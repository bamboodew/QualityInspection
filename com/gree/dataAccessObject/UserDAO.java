package com.gree.dataAccessObject;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import com.gree.model.User;

public class UserDAO {

	/**
	 * 登陆验证
	 * @param con：建立数据库连接
	 * @param user：界面输入的用户数据
	 * @return 返回验证后的用户信息
	 * @throws Exception
	 */
	public User login(Connection con, User user) throws Exception {
		User resultUser = null;
		String sql = "select * from t_user where userName=? and password=?";
		PreparedStatement pstmt = con.prepareStatement(sql);
		
		pstmt.setString(1, user.getUserName()); //登陆界面传过来的输入的数据
		pstmt.setString(2, user.getPassword());
		
		ResultSet rs = pstmt.executeQuery();
		if(rs.next()){
			resultUser = new User();
			resultUser.setId(rs.getInt("id"));
			resultUser.setUserName(rs.getString("userName"));
			resultUser.setPassword(rs.getString("password"));
		}
		return resultUser;  //第一次错误：仍然返回null。
	}

}
