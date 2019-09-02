package com.utils;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class JDBc {
	
	private static Connection conn = null;
	private static PreparedStatement pstm = null;
	private static Statement stm =null;
//	private static ResultSet resultSet = null;
	
	private static String url = "jdbc:mysql://LocalHost:3306/student?serverTimezone=GMT%2B8";
    private static String user= "root";
    private static String password = "123456";
    private static String driver ="com.mysql.cj.jdbc.Driver";
	
	static {
		 try {
	            Class.forName(driver);
	        } catch (Exception e) {
	            
	            e.getMessage();
	        }
	        
	    }
	    
	    public static Connection getConn() throws Exception{
	        
	        conn= DriverManager.getConnection(url, user, password);
	        
	        return conn;
	    }
	    
	    
	    
	    public static Statement getStatement() {
	    	try {
				conn = getConn();
				
				if(conn!=null) {
					stm = conn.createStatement();
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return stm;
	    }
	    
	    public static PreparedStatement getPreparedStatement(String sql) throws Exception {
	    	
	    	
	    	try {
	    		conn = getConn();
				pstm = conn.prepareStatement(sql);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    	
			return pstm;
	    	
	    }
	    
	    
	    
	    
	    public static void close(PreparedStatement pstm,
	    		Connection conn){
	        
	        try {
	            if(pstm != null ){
	            	pstm.close();
	            }
	            if(conn != null ){
	            	conn.close();
	            }
	        } catch (SQLException e) {
	            throw new RuntimeException();
	        }
	    }
	}

