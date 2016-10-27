package com.gree.utility;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * ���ݿ⹤����
 * 
 * @author Administrator
 *
 */
public class ConnectToIqc {

	private String dbUrl = "jdbc:mysql://localhost:3306/db_iqc?useSSL=false"; // ���ݿ����ӵ�ַ
	private String dbUserName = "root";
	private String dbPassword = null;
	private String jdbcName = "com.mysql.jdbc.Driver";

	/**
	 * ��ȡ���ݿ�����
	 * 
	 * @return
	 * @throws Exception
	 */
	public Connection getCon() throws Exception {
		Class.forName(jdbcName);
		Connection con = DriverManager.getConnection(dbUrl, dbUserName, dbPassword);
		return con;
	}

	public void closeCon(Connection con) throws Exception {
		if (con != null) {
			con.close();
		}
	}
	
	public static void main(String[] args) {
		ConnectToIqc ctb = new ConnectToIqc();
		try {
			ctb.getCon();
			System.out.println("���ݿ����ӳɹ���");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("���ݿ�����ʧ�ܣ�");
		}
	}
}
