package com.service;

import java.util.List;

import com.dao.StuDao;
import com.pojo.Student;

public class AddStuService {

	StuDao studao = new StuDao();
	
	//��
	public void save(Student student) {
		studao.save(student);
	}
	//��
	public void update(Student student) {
		studao.update(student);
	}
	
	//ɾ
	public void delete(int id) {
		studao.delete(id);
	}
	
	//����id��
	public Student findStuById(int id) {
		return studao.findStuById(id);
	}
	
	//������ѧ��
	public List<Student> findAllStu() {
		return studao.findAllStu();
	}
	
	
	
	
}
