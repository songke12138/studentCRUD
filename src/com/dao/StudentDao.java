package com.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.utils.JDBc;

public class StudentDao {
	
	
	public boolean isExists(int sno,int passowrd) {
		
		boolean a = false;
		//ÒªÖ´ÐÐµÄsqlÓï¾ä
		String sql = "select * from stu_info where sno=? and password = ?";
		
		try {
			PreparedStatement pstm = JDBc.getPreparedStatement(sql);
			
			pstm.setInt(1, sno);
			pstm.setInt(2, passowrd);
			
			ResultSet rs = pstm.executeQuery();
			
			if(rs.next()) {
				a = true;
			}
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return a;
		
	}
}
