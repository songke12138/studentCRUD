package com.service;

import java.util.List;

import com.dao.StuDao;
import com.pojo.Student;

public class AddStuService {

	StuDao studao = new StuDao();
	
	//增
	public void save(Student student) {
		studao.save(student);
	}
	//改
	public void update(Student student) {
		studao.update(student);
	}
	
	//删
	public void delete(int id) {
		studao.delete(id);
	}
	
	//根据id查
	public Student findStuById(int id) {
		return studao.findStuById(id);
	}
	
	//查所有学生
	public List<Student> findAllStu() {
		return studao.findAllStu();
	}
	
	
	
	
}
