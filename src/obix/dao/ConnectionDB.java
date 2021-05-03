package obix.dao;
import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionDB {


	private  Connection conn;
	
	public  Connection getConnection()
	{
		try {

			// create a mysql database connection
			String myDriver = "com.mysql.cj.jdbc.Driver";
			// Class.forName("com.mysql.jdbc.Driver");
			String myUrl = "jdbc:mysql://localhost:3306/obix";
			Class.forName(myDriver);
			conn = DriverManager.getConnection(myUrl, "root", "pqscqle");
			System.out.println("cmmonnecte");
		} catch (Exception e) {
			System.err.println("Got an exception!");
			System.err.println(e.getMessage());
			e.printStackTrace();
		}
		return conn;
	}

	public static void main(String[] args) {



	}

}
