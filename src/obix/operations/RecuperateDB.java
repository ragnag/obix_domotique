package obix.operations;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import obix.dao.ConnectionDB;
import obix.elements.BureauObix;
import obix.elements.CuisineObix;
import obix.elements.ExterieursObix;
import obix.model.Bureau;
import obix.model.Commandebureau;
import obix.model.Cuisine;
import obix.model.Exterieur;
import obix.model.Typeeclairagebureau;
import obix.model.Valeursbureau;
import obix.model.Voletbureau;

public class RecuperateDB {

	private  Connection conn;
	private ArrayList<Bureau> bureaus = new ArrayList<Bureau>();

	public RecuperateDB() {
		ConnectionDB db = new ConnectionDB();
		this.conn = db.getConnection();
	}

	public void getSavedInformations()  {
		bureaus = getListBureaux();
		
		for (Bureau bureau : bureaus) {
			ArrayList<Valeursbureau> valeursbureaus = new ArrayList<Valeursbureau>();
			try {
				valeursbureaus = getValeursBureaux(bureau);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			bureau.setValeursbureaus(valeursbureaus);

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

	public ArrayList<Valeursbureau> getValeursBureaux(Bureau bureau) throws SQLException {

		ArrayList<Valeursbureau> valeursbureaus = new ArrayList<Valeursbureau>();

		Statement stmt = null;
		try {
			stmt = conn.createStatement();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		// the mysql insert statement
		String sql = " select  luminositeBureau,temperatureBureau, wagoTemperatureBureau, etatPCBureau, dateEnregistrement, idBureau"
				+ " from valeursbureau " + " where idBureau = " + bureau.getIdBureau();

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
				Valeursbureau valeursbureau = new Valeursbureau();
				valeursbureau.setDateEnregistrement(rs.getTimestamp("dateEnregistrement"));
				valeursbureau.setTemperatureBureau(rs.getDouble("temperatureBureau"));
				valeursbureau.setWagoTemperatureBureau(rs.getDouble("wagoTemperatureBureau"));
				valeursbureau.setLuminositeBureau(rs.getDouble("luminositeBureau"));
				valeursbureau.setEtatPCBureau(rs.getDouble("etatPCBureau"));

				valeursbureaus.add(valeursbureau);
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

		return valeursbureaus;

	}

	public Connection getConn() {
		return conn;
	}

	public void setConn(Connection conn) {
		this.conn = conn;
	}

	public ArrayList<Bureau> getBureaus() {
		return bureaus;
	}

	public void setBureaus(ArrayList<Bureau> bureaus) {
		this.bureaus = bureaus;
	}
	
	

	public static void main(String[] args) {
		System.out.println("moi");
		/*RecuperateDB recuperateDB = new RecuperateDB();

		recuperateDB.getSavedInformations();

		ArrayList<Bureau> bureaus = recuperateDB.getBureaus();
		
		ArrayList<Double> temperatureBureaus = new ArrayList<Double>();
		
		for(Valeursbureau valeursbureau : bureaus.get(0).getValeursbureaus())
		{
			temperatureBureaus.add(valeursbureau.getTemperatureBureau());
			
		}*/
		
		System.out.println("ici");

	}

}
