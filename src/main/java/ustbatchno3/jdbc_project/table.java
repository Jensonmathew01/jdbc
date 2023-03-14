package ustbatchno3.jdbc_project;

import java.sql.Connection;
import java.sql.DriverManager;

public class table {
	public static void main(String args[])
	{
	 try{  
	    	Class.forName("com.mysql.jdbc.Driver");  
	    	Connection con=DriverManager.getConnection(  
	    	"jdbc:mysql://localhost:3306/jenson","root","pass@word1");  
	    	//here sonoo is database name, root is username and password  
	    	java.sql.Statement stmt=(java.sql.Statement) con.createStatement();
	    	String query = "CREATE TABLE e("
	    	         + "ID INT NOT NULL, "
	    	         + "NAME VARCHAR (20) NOT NULL, "
	    	         + "AGE INT NOT NULL, "
	    	         + "SALARY DECIMAL (18, 2), "
	    	         + "ADDRESS CHAR (25) , "
	    	         + "PRIMARY KEY (ID))";
	    	      stmt.execute(query);
	    	      System.out.println("Table Created......");
	    	      String sql = "INSERT INTO e VALUES (100, 'Zara',33, 180,'ffg')";
	    	         stmt.executeUpdate(sql);
	    	         sql = "INSERT INTO e VALUES (101, 'Mahnaz',34,134,'erfrgrt')";
	    	         stmt.executeUpdate(sql);
	    	         sql = "INSERT INTO e VALUES (102, 'Zaid', 45,67,'hbtehtyhrt')";
	    	         stmt.executeUpdate(sql);
	    	         sql = "INSERT INTO e VALUES(103, 'Sumit',45,67,'tgertghbdtbt')";
	    	         
	    	         stmt.executeUpdate(sql);
	    	         System.out.println("Inserted records into the table...");   	  
             }catch(Exception e){ System.out.println(e);
      }
	}
}

