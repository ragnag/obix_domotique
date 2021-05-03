package obix.servlet;



import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;




import obix.elements.*;
import obix.model.Bureau;
import obix.model.Valeursbureau;
import obix.operations.RecuperateDB;


@WebServlet(name = "HomeServlet", urlPatterns = {"/HomeServlet"})
public class HomeServlet  extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private String root_url = "http://148.60.19.201:8080/obix/automation/all/";
	private LaboratoireObix laboratoire= new LaboratoireObix("Laboratoire Domotique");
	
public void init(ServletConfig config) throws ServletException {

		super.init(config);
			
	}
	
	@Override
	// La methode qui est appelé lorsqu'on lance la servlet est toujours le doGet
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		
		//getLaboratoryInformations();
		//RetreiveInformations rt = new RetreiveInformations();
		//rt.getLaboratoryInformations();
		
		//System.out.println(laboratoire);
		
		RecuperateDB recuperateDB = new RecuperateDB();

		recuperateDB.getSavedInformations();

		ArrayList<Bureau> bureaus = recuperateDB.getBureaus();
		
		ArrayList<Double> temperatureBureaus = new ArrayList<Double>();
		
		for(Valeursbureau valeursbureau : bureaus.get(0).getValeursbureaus())
		{
			temperatureBureaus.add(valeursbureau.getTemperatureBureau());
			
		}
		
		System.out.println("ici");
		
		//System.out.println(temperatureBureaus);
		

		// On créer une session si ça n'existe pas sinon on charge la session
		//HttpSession session = request.getSession(true);

		// Yupie un utilisateur est connecté
		// On l'envoie donc à la page de chat

		// Pour faire de la redirection
		RequestDispatcher rd = request.getRequestDispatcher("Home.jsp");

		/*request.setAttribute("content", "");
		request.setAttribute("bureaus", bureaus);*/

		rd.include(request, response);

	}
	


	
	
}
