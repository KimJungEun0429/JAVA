
import java.sql.*;

import oracle.jdbc.internal.OracleTypes;

public class DBExample {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//ojdbc8.jar - ĸ��ȭ �Ǿ� �ִ� ��. �츮�� �����ٰ� �׳� ����ϸ��
		
		//�ܺ� jar, class������ �����ͼ� ����Ѵ�
		
		Connection con = null;
		//connection Ŭ������ java���� db�� ������ �� �ֵ����ϴ� Ŭ������.
		//�ٸ� Ŭ������ �Ž�带 ���� ȣ���� �Ǵ� �ִ�.
		Statement stmt = null;
		//������ ��� ��ü
		ResultSet rs = null;
		//����� ��� ��ü
		
	    //CallableStatement csmt = null;
	     //����Ŭ�� ���ν����� ȣ�� �� �� �ֵ��� �ϴ� ��ü

		
		String userID = "CORONA";
		String userPass = "1";
		String url ="jdbc:oracle:thin:@localhost:1521:xe";
		
		Class.forName("oracle.jdbc.driver.OracleDriver");

		con = DriverManager.getConnection(url, userID, userPass);
		//���ᰴü�� �������.
		
		//������ ������ ����� �����´�
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
		
	    //CONNECTION�� ����ؼ� �����ͺ��̽�(ORACLE)�� PROCEDURE�� ��� ��ü
	      CallableStatement csmt = null;
	      String strProcName = "BEGIN PROC_CON_AVG_AGE(?); END;";
	      //���ν����� �յڷ� BEGIN�� END�� ���°�
	      csmt = con.prepareCall(strProcName);
	      csmt.setString(1,"S002");
	      csmt.registerOutParameter(1, OracleTypes.CURSOR);
	      //Types.�ϸ� �ڹٰ� �����ϴ� Ÿ�Ե�
	      csmt.execute();
	      
	      rs = (ResultSet)csmt.getObject(1);
	      
	      while(rs.next()){
				System.out.println(rs.getString("P_ID"));
				System.out.println(rs.getString("P_NAME"));
			}
	}//MAIN END

}



