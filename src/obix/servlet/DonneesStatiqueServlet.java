package obix.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import obix.elements.LaboratoireObix;
import obix.elements.RetreiveInformations;

//@WebServlet("/Données Statiques")

@WebServlet(name = "DonneesStatiqueServlet", urlPatterns = {"/DonneesStatiqueServlet"})
public class DonneesStatiqueServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
	@Override
	// La methode qui est appelé lorsqu'on lance la servlet est toujours le doGet
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		
		
		
		//getLaboratoryInformations();
		RetreiveInformations rt = new RetreiveInformations();
		rt.getLaboratoryInformations();
		LaboratoireObix laboratoire_elements=new LaboratoireObix("Laboratoire");
		//Recupère les informations de la classe Laboratoire
		laboratoire_elements = rt.getLaboratoire();


		// On créer une session si ça n'existe pas sinon on charge la session
		HttpSession session = request.getSession(true);

		// Yupie un utilisateur est connecté
		// On l'envoie donc à la page de chat

		// Pour faire de la redirection
		RequestDispatcher rd = request.getRequestDispatcher("Statique.jsp");

		request.setAttribute("nomlabo", laboratoire_elements.getNom_laboratoire());
		request.setAttribute("infolabo", laboratoire_elements);

		rd.include(request, response);

	}


	


}
