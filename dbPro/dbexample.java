package dbPro;

import java.sql.*;


public class dbexample {
	public static void main(String[] args) throws ClassNotFoundException {
		
		Connection con = null;
		Statement stmt = null;
		CallableStatement csmt = null;
		ResultSet rs = null;
		
		String userID = "CORONA";
		String userPass = "1";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		
	}
}
