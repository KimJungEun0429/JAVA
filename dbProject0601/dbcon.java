package dbProject0601;

import java.sql.*;

public class dbcon {
	private String strURL;
	private String userID;
	private String userPass;
	private Connection con;
	private Statement stmt;
	
	public dbcon(String strURL, String userID, String userPass) throws ClassNotFoundException, SQLException {
		this.strURL = strURL;
		this.userID = userID;
		this.userPass = userPass;
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		this.con = DriverManager.getConnection(strURL, userID, userPass);
	}
	
	public Connection getConnection() {
		return this.con;
	}
	
	public Statement getStatement() throws SQLException {
		this.stmt = this.con.createStatement();
		return this.stmt;
	}
	
	public ResultSet getResult(String strSql) throws SQLException {
		ResultSet rs = stmt.executeQuery(strSql);
		return rs;
	}
}
