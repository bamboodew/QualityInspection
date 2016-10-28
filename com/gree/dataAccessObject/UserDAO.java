package com.gree.dataAccessObject;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import com.gree.model.User;

public class UserDAO {

	/**
	 * ��½��֤
	 * @param con���������ݿ�����
	 * @param user������������û�����
	 * @return ������֤����û���Ϣ
	 * @throws Exception
	 */
	public User login(Connection con, User user) throws Exception {
		User resultUser = null;
		String sql = "select * from t_user where userName=? and password=?";
		PreparedStatement pstmt = con.prepareStatement(sql);
		
		pstmt.setString(1, user.getUserName()); //��½���洫���������������
		pstmt.setString(2, user.getPassword());
		
		ResultSet rs = pstmt.executeQuery();
		if(rs.next()){
			resultUser = new User();
			resultUser.setId(rs.getInt("id"));
			resultUser.setUserName(rs.getString("userName"));
			resultUser.setPassword(rs.getString("password"));
		}
		return resultUser;  //��һ�δ�����Ȼ����null��
	}

}
