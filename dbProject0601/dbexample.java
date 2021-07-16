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
		//ojdbc8.jar - ĸ��ȭ �Ǿ� �ִ� ��. �츮�� �����ٰ� �׳� ����ϸ��

		Connection con = null;
		//connection Ŭ������ java���� db�� ������ �� �ֵ����ϴ� Ŭ������.
		//�ٸ� Ŭ������ �Ž�带 ���� ȣ���� �Ǵ� �ִ�.
		
		Statement stmt = null;
		//������ ��� ��ü inline Query
		
		CallableStatement csmt = null;
		//���ν����� ��� ��ü

		ResultSet rs = null;
		//���ν������� OUTŸ���� �� ������ ��� ���̺��� ��� ��ü
		
		
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
		}*///�ܼ��� ���̺��� ���� �� ���.
		
		/*
		//���ν����� ������ �����ͺ��̽� ������� �������� ��
		String procName = "BEGIN PROC_MANY_TRACKING(?);END;";
		csmt = con.prepareCall(procName);
		csmt.registerOutParameter(1, OracleTypes.CURSOR);	
		
		csmt.execute();
		//���ν��� ����
		
		rs = (ResultSet)csmt.getObject(1);
		//�����ͺ��̽����� ��� ���̺��� ������� ResultSet Ÿ������ ������µ� ResultSet Ÿ������ �ٷ� �θ� �� ���� ������
		//�ֻ��� ��ü�� objectŸ������ �ҷ��ͼ� ResultSet���� �ٿ�ĳ���� ���Ѽ� rs�� �ٽ� �Ҵ����ִ� ��.
		
		while(rs.next()) {
			System.out.println(rs.getString("P_ID"));
			System.out.println(rs.getString("P_NAME"));
		}
		*/
		
		//�����ڷ� �����ͺ��̽��� �ҷ�����
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
