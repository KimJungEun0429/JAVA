
import java.sql.*;

import oracle.jdbc.internal.OracleTypes;

public class DBExample {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//ojdbc8.jar - 캡술화 되어 있는 것. 우리가 가져다가 그냥 사용하면됨
		
		//외부 jar, class파일을 가져와서 사용한다
		
		Connection con = null;
		//connection 클래스는 java에서 db를 연결할 수 있도록하는 클래스다.
		//다른 클래스로 매써드를 만들어서 호출이 되는 애다.
		Statement stmt = null;
		//쿼리를 담는 객체
		ResultSet rs = null;
		//결과를 담는 객체
		
	    //CallableStatement csmt = null;
	     //오라클의 프로시져를 호출 할 수 있도록 하는 객체

		
		String userID = "CORONA";
		String userPass = "1";
		String url ="jdbc:oracle:thin:@localhost:1521:xe";
		
		Class.forName("oracle.jdbc.driver.OracleDriver");

		con = DriverManager.getConnection(url, userID, userPass);
		//연결객체를 만들었다.
		
		//쿼리를 날려서 결과를 가져온다
		//-inline query
		//-oracle package procedure, procedure
		
		/*
		String inPID = "P001";
		
		String strSql2 = "";
		
		strSql2 += "Select * from PEOPLE_TBL ";
		strSql2 += "Select * from PEOPLE_TBL ";
		
		String strSql = "Select * from PEOPLE_TBL";
		
		
		stmt = con.createStatement();
		
		rs = stmt.executeQuery(strSql);
		
		while(rs.next()){
			System.out.println(rs.getString("P_ID"));
			System.out.println(rs.getString("P_NAME"));
		}
		
	
		String procName = "PROC_CON_AVG_AGE(?)";
	      csmt = con.prepareCall(procName);
	      csmt.setString(1, "S001");
	      csmt.registerOutParameter(1, OracleTypes.CURSOR);
		*/
		
	    //CONNECTION을 사용해서 데이터베이스(ORACLE)에 PROCEDURE를 담는 객체
	      CallableStatement csmt = null;
	      String strProcName = "BEGIN PROC_CON_AVG_AGE(?); END;";
	      //프로시저명 앞뒤로 BEGIN과 END가 묶는것
	      csmt = con.prepareCall(strProcName);
	      csmt.setString(1,"S002");
	      csmt.registerOutParameter(1, OracleTypes.CURSOR);
	      //Types.하면 자바가 제공하는 타입들
	      csmt.execute();
	      
	      rs = (ResultSet)csmt.getObject(1);
	      
	      while(rs.next()){
				System.out.println(rs.getString("P_ID"));
				System.out.println(rs.getString("P_NAME"));
			}
	}//MAIN END

}



