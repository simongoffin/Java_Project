import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DB
{
	
	public DB()
	{
		Connection c = null;
		Statement stmt = null;
	    try {
	      Class.forName("org.sqlite.JDBC");
	      c = DriverManager.getConnection("jdbc:sqlite:repertoire.db");
	      System.out.println("Opened database successfully");

	      stmt = c.createStatement();
	      
	      String sql = "CREATE TABLE PERSONNE " +
	                   "(ID INT PRIMARY KEY       NOT NULL," +
	                   " PRENOM         TEXT      NOT NULL," + 
	                   " NOM            TEXT      NOT NULL," + 
	                   " NATION         CHAR(50))"; 
	      stmt.executeUpdate(sql);
	      sql = "CREATE TABLE METIER " +
                  "(ID INT PRIMARY KEY       NOT NULL," +
                  " JOB         TEXT      NOT NULL)"; 
	      stmt.executeUpdate(sql);

	      sql="PRAGMA foreign_keys = ON;";
	      stmt.executeUpdate(sql);
	      
	      sql = "CREATE TABLE EMPLOYE " +
                  "(ID INT PRIMARY KEY NOT NULL," +
                  " ID_P INT  NOT NULL,"+
                  " ID_M INT  NOT NULL,"+
                  "FOREIGN KEY(ID_P) REFERENCES PERSONNE(ID)"+
                  "FOREIGN KEY(ID_M) REFERENCES METIER(ID))"; 
	      stmt.executeUpdate(sql);
	      
	      stmt.close();
	      c.close();
	    } catch ( Exception e ) {
	      System.err.println( e.getClass().getName() + ": " + e.getMessage() );
	      System.exit(0);
	    }
	    System.out.println("Table created successfully");
		
	}
	
	public void insert_personne(String prenom,String nom,int id,String nation)
	{
		
		Connection c = null;
	    Statement stmt = null;
	    try {
	    	Class.forName("org.sqlite.JDBC");
	    	c = DriverManager.getConnection("jdbc:sqlite:repertoire.db");
	    	c.setAutoCommit(false);
	    	System.out.println("Opened database successfully");

	    	stmt = c.createStatement();
	    	String sql = "INSERT INTO PERSONNE (ID,PRENOM,NOM,NATION) " +
	                   "VALUES ("+id+",'"+
	    			prenom+"','"+nom+"','"+nation+"');"; 
	    	stmt.executeUpdate(sql);

	    	stmt.close();
	    	c.commit();
	    	c.close();
	    } catch ( Exception e ) {
	    	System.err.println( e.getClass().getName() + ": " + e.getMessage() );
	    	System.exit(0);
	    }
	    System.out.println("Records created successfully");
		
	}
  
}
