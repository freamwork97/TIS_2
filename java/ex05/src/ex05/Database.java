package ex05;
// oracle ver
// import java.sql.Connection;
// import java.sql.DriverManager;

// public class Database {
// 	public static Connection connect() {
// 		Connection con=null;
// 		try {
// 			Class.forName("oracle.jdbc.driver.OracleDriver");
// 			con=DriverManager.getConnection(
// 					"jdbc:oracle:thin:@localhost:1521:xe",
// 					"java",
// 					"pass");
// 			System.out.println("접속성공");
// 		}catch(Exception e) {
// 			System.out.println("DB연결:" + e.toString());
// 		}
// 		return con;
// 	}
// }
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;
public class Database {

	public static Connection connect() {
		// TODO Auto-generated method stub
		try {
				Class.forName("com.mysql.cj.jdbc.Driver"); 
			    Connection CON=DriverManager.getConnection("jdbc:mysql://localhost:3306/SQL_TEST", 
				"root", "9852");

		} catch (Exception e) {
			System.out.println("error? : "+e.toString());
		}
			

			
		
		
		
	return connect();	
	}

}