package com.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.pojo.Student;
import com.utils.JDBc;

public class StuDao {
	
	
	
		//增
		public void save(Student student) {
			String sql = "insert into stu_info (id,name,sno,age) values(?,?,?,?)";
			try {
				PreparedStatement pstm = JDBc.getPreparedStatement(sql);
				pstm.setString(1,null);
				pstm.setString(2,student.getName());
				pstm.setInt(3, student.getSno());
				pstm.setInt(4, student.getAge());
				pstm.executeUpdate();
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		
		}
		//改
		public void update(Student student) {
			String sql = "update stu_info set name = ?,sno=?,age=? where id = ?";
			try {
				PreparedStatement pstm = JDBc.getPreparedStatement(sql);
				pstm.setString(1,student.getName());
				pstm.setInt(2, student.getSno());
				pstm.setInt(3, student.getAge());
				pstm.setInt(4,student.getId());
				pstm.executeUpdate();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		//删
		public void delete(int id) {
			String sql = "delete from stu_info where id = ?";
			try {
				PreparedStatement pstm = JDBc.getPreparedStatement(sql);
				pstm.setInt(1,id);
				pstm.executeUpdate();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		//根据id查
		public Student findStuById(int id) {
			Student stu = null;
			String sql = "select * from stu_info where id = ?";
			try {
				PreparedStatement pstm = JDBc.getPreparedStatement(sql);
				pstm.setInt(1,id);
				ResultSet rs = pstm.executeQuery();
				
				if(rs.next()) {
					String name = rs.getString("name");
					int sno = rs.getInt("sno");
					int age = rs.getInt("age");
					
					stu = new Student();
					stu.setName(name);
					stu.setSno(sno);
					stu.setAge(age);
				}
				rs.close();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
					return stu;
		}
		
		//查所有学生
		public List<Student> findAllStu() {
			List<Student> stuList = new ArrayList<Student>();
			String sql = "select * from stu_info";
			try {
				PreparedStatement pstm = JDBc.getPreparedStatement(sql);
				ResultSet rs = pstm.executeQuery();
				
				while(rs.next()) {
					int id = rs.getInt("id");
					String name = rs.getString("name");
					int sno = rs.getInt("sno");
					int age = rs.getInt("age");
					
					Student stu = new Student();
					stu.setId(id);
					stu.setName(name);
					stu.setSno(sno);
					stu.setAge(age);
					stuList.add(stu);
				}
				rs.close();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
					return stuList;
		}
	
}
