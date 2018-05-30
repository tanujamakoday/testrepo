import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
//import org.openqa.selenium.support.ui.ExpectedConditions;

public class DB {

	
	public  static void main (String [] args) throws Exception {

	// Object of Connection from the Database
	Connection conn = null;
	
	//Object of Statement. It is used to create a Statement to execute the query
	Statement stmt = null;
	
	// /Object of ResultSet => 'It maintains a cursor that points to the current row in the result set'
	
	ResultSet resultSet = null;
	Class.forName("com.mysql.jdbc.Driver");
	
	//open a connection 
	 conn = DriverManager.getConnection("jdbc:mysql://localhost:1433/HILLCREST001", "root", "root");
	
	 //execute a query 
	 
	 stmt = (Statement) conn.createStatement();
	 
	resultSet = ((java.sql.Statement) stmt).executeQuery("Select * from HILLCREST001.dbo.Filelog");
										
				while (resultSet.next()){
					System.out.println(resultSet.getString(1)+" "+resultSet.getString(2)+ ""+ resultSet.getString(3)+""+resultSet.getString(4));
				}
			}
				
			


}