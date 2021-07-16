package dbProject0601;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import oracle.jdbc.OracleTypes;

public class dbexample {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		//ojdbc8.jar - 캡술화 되어 있는 것. 우리가 가져다가 그냥 사용하면됨

		Connection con = null;
		//connection 클래스는 java에서 db를 연결할 수 있도록하는 클래스다.
		//다른 클래스로 매써드를 만들어서 호출이 되는 애다.
		
		Statement stmt = null;
		//쿼리를 담는 객체 inline Query
		
		CallableStatement csmt = null;
		//프로시저를 담는 객체

		ResultSet rs = null;
		//프로시저에서 OUT타입일 때 나오는 결과 테이블을 담는 객체
		
		
		String userID = "CORONA";
		String userPass = "1";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		con = DriverManager.getConnection(url, userID, userPass);
	
		/*
		String inSID = "P0002";
		String strSql = "";
		
		//strSql += "SELECT * FROM PEOPLE_TBL";
		strSql += "SELECT * FROM PEOPLE_TBL WHERE P_ID ='" + inSID + "'";
		
		stmt = con.createStatement();
		
		rs = stmt.executeQuery(strSql);
		
		while(rs.next()) {
		System.out.println(rs.getString("P_ID"));
		System.out.println(rs.getString("P_NAME"));
		}*///단순한 테이블을 블러올 때 사용.
		
		/*
		//프로시저를 실행한 데이터베이스 결과값을 가져오는 것
		String procName = "BEGIN PROC_MANY_TRACKING(?);END;";
		csmt = con.prepareCall(procName);
		csmt.registerOutParameter(1, OracleTypes.CURSOR);	
		
		csmt.execute();
		//프로시저 실행
		
		rs = (ResultSet)csmt.getObject(1);
		//데이터베이스에서 결과 테이블이 날라오면 ResultSet 타입으로 날라오는데 ResultSet 타입으로 바로 부를 수 없기 때문에
		//최상위 객체인 object타입으로 불러와서 ResultSet으로 다운캐스팅 시켜서 rs에 다시 할당해주는 것.
		
		while(rs.next()) {
			System.out.println(rs.getString("P_ID"));
			System.out.println(rs.getString("P_NAME"));
		}
		*/
		
		//생성자로 데이터베이스를 불러오기
		dbcon db = new dbcon("jdbc:oracle:thin:@localhost:1521:xe", "CORONA", "1");
		String stID = "P0002";
		String sSql = "SELECT * FROM PEOPLE_TBL WHERE P_ID ='" + stID + "'";
	
		db.getStatement();
		ResultSet rs2 = db.getResult(sSql);
		
		while(rs2.next()) {
			System.out.println(rs2.getString("P_ID"));
			System.out.println(rs2.getString("P_NAME"));
		}
	}//main end
}
