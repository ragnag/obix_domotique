package obix.operations;

import obix.elements.BureauObix;
import obix.elements.CuisineObix;
import obix.elements.ExterieursObix;
import obix.elements.RetreiveInformations;
import obix.model.Bureau;
import obix.model.Commandebureau;
import obix.model.Cuisine;
import obix.model.Exterieur;
import obix.model.Laboratoire;
import obix.model.Typeeclairagebureau;
import obix.model.Voletbureau;

import java.util.Date;
import java.util.Map;
import java.util.Timer;

import java.sql.*;
import java.util.ArrayList;
import java.util.Calendar;

import java.util.TimerTask;
import java.util.concurrent.locks.ReentrantLock;

public class Historisation {

	private obix.elements.LaboratoireObix laboratoireObix;
	private static RetreiveInformations retreiveInformations;
	private Connection conn;

	long delay = 10 * 60 * 1000; // delay in milliseconds
	LoopTask task = new LoopTask();
	Timer timer = new Timer("TaskName");

	public obix.elements.LaboratoireObix getLaboratoire() {
		return laboratoireObix;
	}

	public void setLaboratoire(obix.elements.LaboratoireObix laboratoire) {
		this.laboratoireObix = laboratoire;
	}

	public void start() {
		timer.cancel();
		timer = new Timer("TaskName");
		Date executionDate = new Date(); // no params = now
		timer.scheduleAtFixedRate(task, executionDate, delay);
	}

	private class LoopTask extends TimerTask {
		public void run() {
            System.out.println("Recuperation des informations toutes les 10 mins");
            retreiveInformations.getLaboratoryInformations();
            laboratoireObix = retreiveInformations.getLaboratoire();
            enregistrerInformations();
        }
	}

	public ArrayList<Cuisine> getListCuisines() {

		ArrayList<Cuisine> list_cuisines = new ArrayList<Cuisine>();

		Statement stmt = null;
		try {
			stmt = conn.createStatement();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		String sql = "SELECT idCuisine, nomCuisine FROM cuisine";
		ResultSet rs = null;
		try {
			rs = stmt.executeQuery(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// STEP 5: Extract data from result set
		try {
			while (rs.next()) {
				// Retrieve by column name

				Cuisine cuisine = new Cuisine();
				cuisine.setIdCuisine(rs.getInt("idCuisine"));
				cuisine.setNomCuisine(rs.getString("nomCuisine"));

				list_cuisines.add(cuisine);

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			rs.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list_cuisines;
	}

	public ArrayList<Bureau> getListBureaux() {

		ArrayList<Bureau> list_Bureaus = new ArrayList<Bureau>();

		Statement stmt = null;
		try {
			stmt = conn.createStatement();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		String sql = "SELECT idBureau, nomBureau, idLaboratoire FROM Bureau";
		ResultSet rs = null;
		try {
			rs = stmt.executeQuery(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// STEP 5: Extract data from result set
		try {
			while (rs.next()) {
				// Retrieve by column name

				Bureau bureau = new Bureau();
				bureau.setIdBureau(rs.getInt("idBureau"));
				bureau.setNomBureau(rs.getString("nomBureau"));

				list_Bureaus.add(bureau);

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			rs.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list_Bureaus;
	}

	public ArrayList<Typeeclairagebureau> getListTypeEclairageBureau(int idBureau) {

		ArrayList<Typeeclairagebureau> typeeclairagebureaus = new ArrayList<Typeeclairagebureau>();

		Statement stmt = null;
		try {
			stmt = conn.createStatement();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		String sql = "SELECT idEtatEclairageBureau, typeEtatEclairage,idBureau FROM typeeclairagebureau where idBureau = "
				+ idBureau;
		ResultSet rs = null;
		try {
			rs = stmt.executeQuery(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// STEP 5: Extract data from result set
		try {
			while (rs.next()) {
				// Retrieve by column name

				Typeeclairagebureau typeeclairagebureau = new Typeeclairagebureau();
				typeeclairagebureau.setIdEtatEclairageBureau(rs.getInt("idEtatEclairageBureau"));
				typeeclairagebureau.setTypeEtatEclairage(rs.getString("typeEtatEclairage"));

				typeeclairagebureaus.add(typeeclairagebureau);

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			rs.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return typeeclairagebureaus;
	}

	public ArrayList<Voletbureau> getListVoletbureau(int idBureau) {

		ArrayList<Voletbureau> voletbureaus = new ArrayList<Voletbureau>();

		Statement stmt = null;
		try {
			stmt = conn.createStatement();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		String sql = "SELECT idEtatVoletBureau, typeEtatVoletBureau,idBureau FROM voletbureau where idBureau = "
				+ idBureau;
		ResultSet rs = null;
		try {
			rs = stmt.executeQuery(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// STEP 5: Extract data from result set
		try {
			while (rs.next()) {
				// Retrieve by column name

				Voletbureau voletbureau = new Voletbureau();
				voletbureau.setIdEtatVoletBureau(rs.getInt("idEtatVoletBureau"));
				voletbureau.setTypeEtatVoletBureau(rs.getString("typeEtatVoletBureau"));

				voletbureaus.add(voletbureau);

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			rs.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return voletbureaus;
	}

	public ArrayList<Exterieur> getListExterieurs() {
// on cree une liste et on l'initialise à une liste vide
		ArrayList<Exterieur> exterieurs = new ArrayList<Exterieur>();

		Statement stmt = null;
		try {
			stmt = conn.createStatement();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		//Recupère la liste des exterieurs
		String sql = "SELECT idExterieure, nomExterieure FROM exterieur";
		ResultSet rs = null;
		try {
			rs = stmt.executeQuery(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// STEP 5: Extract data from result set
		try {
			while (rs.next()) {
				// Retrieve by column name

				Exterieur exterieur = new Exterieur();
				exterieur.setIdExterieure(rs.getInt("idExterieure"));
				exterieur.setNomExterieure(rs.getString("nomExterieure"));

				exterieurs.add(exterieur);

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			rs.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return exterieurs;
	}
	
	
	
	
	public ArrayList<Commandebureau> getListCommandeBureaux(int idBureau) {

		ArrayList<Commandebureau> commandebureaus = new ArrayList<Commandebureau>();

		Statement stmt = null;
		try {
			stmt = conn.createStatement();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		String sql = "SELECT idCommandeBureau, typeCommandeBureau,idBureau FROM commandebureau where idBureau = " + idBureau;
		ResultSet rs = null;
		try {
			rs = stmt.executeQuery(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// STEP 5: Extract data from result set
		try {
			while (rs.next()) {
				// Retrieve by column name

				Commandebureau voletbureau = new Commandebureau();
				voletbureau.setIdCommandeBureau(rs.getInt("idCommandeBureau"));
				voletbureau.setTypeCommandeBureau(rs.getString("typeCommandeBureau"));

				commandebureaus.add(voletbureau);

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			rs.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return commandebureaus;
	}
	
	

	public void enregistrerInformationsBureau(BureauObix bureauObix, int idbureau) throws SQLException {
		Double luminositeBureau = bureauObix.getLuminosite().get("LuminositeBureau");
		Double temperatureBureau = bureauObix.getTemperature().get("TemperatureBureau");
		Double wagoTemperatureBureau = bureauObix.getTemperature().get("WagoTemperatureBureau");
		Boolean etatPCBureau = bureauObix.getEtat_pc_bureau().get("EtatPCCBureau");

		// the mysql insert statement
		String query = " insert into valeursbureau (luminositeBureau,temperatureBureau, wagoTemperatureBureau, etatPCBureau, dateEnregistrement, idBureau)"
				+ " values (?, ?, ?, ?, ?, ?)";

		// create the mysql insert preparedstatement
		PreparedStatement preparedStmt = conn.prepareStatement(query);
		preparedStmt.setDouble(1, luminositeBureau);
		preparedStmt.setDouble(2, temperatureBureau);
		preparedStmt.setDouble(3, wagoTemperatureBureau);
		preparedStmt.setBoolean(4, etatPCBureau);
		preparedStmt.setTimestamp(5, new Timestamp(System.currentTimeMillis()));
		preparedStmt.setInt(6, idbureau);

		// execute the preparedstatement
		preparedStmt.execute();

	}

	public void enregistrerInformationsCuisine(CuisineObix cuisineObix, int idcuisine) throws SQLException {
		Double co2cuisine = cuisineObix.getCO2Cuisine().get("CO2Cuisine");
		Double humiditeCuisine = cuisineObix.getHumiditeCuisine().get("HumiditeCuisine");
		Double temperatureCuisine = cuisineObix.getTemperatureCuisine().get("TemperatureCuisine");

		// the mysql insert statement
		String query = " insert into valeurscuisine (Co2Cuisine,humiditeCuisine, idCuisine,  dateEnregistrement)"
				+ " values (?, ?, ?, ?)";

		// create the mysql insert preparedstatement
		PreparedStatement preparedStmt = conn.prepareStatement(query);
		preparedStmt.setDouble(1, co2cuisine);
		preparedStmt.setDouble(2, humiditeCuisine);
		preparedStmt.setInt(3, idcuisine);
		preparedStmt.setTimestamp(4, new Timestamp(System.currentTimeMillis()));

		// execute the preparedstatement
		preparedStmt.execute();

	}

	public void enregistrerInformationsEtatEclaireBureau(Boolean etateclairage, int idtypeeclairage)
			throws SQLException {

		// the mysql insert statement
		String query = " insert into valeursetateclairage (valeurs,idTypeEclairage,   dateEnregistrement)"
				+ " values (?, ?, ?)";

		// create the mysql insert preparedstatement
		PreparedStatement preparedStmt = conn.prepareStatement(query);
		preparedStmt.setBoolean(1, etateclairage);
		preparedStmt.setInt(2, idtypeeclairage);
		preparedStmt.setTimestamp(3, new Timestamp(System.currentTimeMillis()));

		// execute the preparedstatement
		preparedStmt.execute();

	}

	public void enregistrerInformationsEtatVoletBureau(Boolean etat, int idvolet) throws SQLException {

		// the mysql insert statement
		String query = " insert into valeursetatvolets (etat,idVoletBureau,   dateEnregistrement)"
				+ " values (?, ?, ?)";

		// create the mysql insert preparedstatement
		PreparedStatement preparedStmt = conn.prepareStatement(query);
		preparedStmt.setBoolean(1, etat);
		preparedStmt.setInt(2, idvolet);
		preparedStmt.setTimestamp(3, new Timestamp(System.currentTimeMillis()));

		// execute the preparedstatement
		preparedStmt.execute();

	}

	public void enregistrerInformationsCommandePCBureau(String etat, int idCommandeBureau) throws SQLException {

		// the mysql insert statement
		String query = " insert into valeurscommandebureau (valeur,idCommandeBureau,   dateEnregistrement)"
				+ " values (?, ?, ?)";

		// create the mysql insert preparedstatement
		PreparedStatement preparedStmt = conn.prepareStatement(query);
		preparedStmt.setString(1, etat);
		preparedStmt.setInt(2, idCommandeBureau);
		preparedStmt.setTimestamp(3, new Timestamp(System.currentTimeMillis()));

		// execute the preparedstatement
		preparedStmt.execute();

	}
	
	
	public void enregistrerInformationsExterieure(ExterieursObix exterieursObix, int idExterieur) throws SQLException {
		
		Double temperature = exterieursObix.getTemperatureExterieure().get("Exterieurs");
		Double direction = exterieursObix.getDirectionVent().get("Exterieurs");
		Double vitesse = exterieursObix.getVitesseVent().get("Exterieurs");
		
		// the mysql insert statement
		String query = " insert into valeursexterieur (temperature,direction,vitesse,idExterieur, dateEnregistrement)"
				+ " values (?, ?, ?, ?, ?)";

		// create the mysql insert preparedstatement
		PreparedStatement preparedStmt = conn.prepareStatement(query);
		preparedStmt.setDouble(1, temperature);
		preparedStmt.setDouble(2, direction);
		preparedStmt.setDouble(3, vitesse);
		preparedStmt.setDouble(4, idExterieur);
		preparedStmt.setTimestamp(5, new Timestamp(System.currentTimeMillis()));

		// execute the preparedstatement
		preparedStmt.execute();

	}

	public void enregistrerInformations() {
		try {

			// create a mysql database connection
			String myDriver = "com.mysql.cj.jdbc.Driver";
			// Class.forName("com.mysql.jdbc.Driver");
			String myUrl = "jdbc:mysql://localhost:3306/obix";
			Class.forName(myDriver);
			conn = DriverManager.getConnection(myUrl, "root", "pqscqle");
			// create a sql date object so we can use it in our INSERT statement
			Calendar calendar = Calendar.getInstance();
			java.sql.Date startDate = new java.sql.Date(calendar.getTime().getTime());

			obix.elements.LaboratoireObix laboratoireObix = retreiveInformations.getLaboratoire();

			// Debut des insertions
			// Bureau
			// Recuperer l'identifiant des bureaux
			ArrayList<Bureau> listBureaus = getListBureaux();

			for (Bureau bureau : listBureaus) {
				BureauObix bureauObix = laboratoireObix.getList_bureaux().get(bureau.getNomBureau());
				if (bureauObix == null)
					continue;
				enregistrerInformationsBureau(bureauObix, bureau.getIdBureau());

				ArrayList<Typeeclairagebureau> typeeclairagebureaus = getListTypeEclairageBureau(bureau.getIdBureau());
				for (Typeeclairagebureau typeeclairagebureau : typeeclairagebureaus) {
					Boolean etat_variation_eclairage = bureauObix.getEtat_variation_eclairage()
							.get(typeeclairagebureau.getTypeEtatEclairage());
					if (etat_variation_eclairage == null)
						continue;
					enregistrerInformationsEtatEclaireBureau(etat_variation_eclairage,
							typeeclairagebureau.getIdEtatEclairageBureau());
				}

				ArrayList<Voletbureau> voletbureaus = getListVoletbureau(bureau.getIdBureau());
				for (Voletbureau voletbureau : voletbureaus) {
					Boolean etat_volet_bureau = bureauObix.getEtat_volet().get(voletbureau.getTypeEtatVoletBureau());
					if (etat_volet_bureau == null)
						continue;
					enregistrerInformationsEtatVoletBureau(etat_volet_bureau, voletbureau.getIdEtatVoletBureau());
				}

				ArrayList<Commandebureau> commandebureaus = getListCommandeBureaux(bureau.getIdBureau());
				for (Commandebureau commandebureau : commandebureaus) {
					String commande = bureauObix.getCmd_pc_bureau().get(commandebureau.getTypeCommandeBureau());
					if (commande == null)
						continue;
					enregistrerInformationsCommandePCBureau(commande, commandebureau.getIdCommandeBureau());
				}
				
				

			}

			ArrayList<Cuisine> cuisines = getListCuisines();
			for (Cuisine cuisine : cuisines) {
				CuisineObix cuisineObix = laboratoireObix.getList_cuisines().get(cuisine.getNomCuisine());
				if (cuisineObix == null)
					continue;
				enregistrerInformationsCuisine(cuisineObix, cuisine.getIdCuisine());
			}
			
		//Recuperer la liste des exterieurs du laboratoire qui se trouve dans la base de donnee
			ArrayList<Exterieur> exterieurs = getListExterieurs();
			//On fait une boucle et pour chaque exterieure qu'on a recupérer dans la base de donnée , 
			//on fait une vérification et on récupère les valeurs que le programme vient de recupérer
			for (Exterieur exterieur : exterieurs) {
				ExterieursObix exterieursObix = laboratoireObix.getLlist_exterieus().get(exterieur.getNomExterieure());
				if (exterieursObix == null)
					continue;
				enregistrerInformationsExterieure(exterieursObix, exterieur.getIdExterieure());
			}
			

			
			conn.close();
		} catch (Exception e) {
			System.err.println("Got an exception!");
			System.err.println(e.getMessage());
		}
	}

	public static void main(String[] args) {
		retreiveInformations = new RetreiveInformations();
		retreiveInformations.getLaboratoryInformations();

		Historisation executingTask = new Historisation();
		executingTask.start();

		/*
		 * retreiveInformations = new RetreiveInformations(); Historisation
		 * executingTask = new Historisation(); executingTask.start();
		 */

	}

}
