package com.service;

import com.dao.StudentDao;
import com.pojo.Student;

public class LoginService {
		
	StudentDao studentDao = new StudentDao();
	
	
	//�жϵ�¼�Ƿ�Ϸ�
	public boolean legal(Student student) {
		
		return studentDao.isExists(student.getSno(), student.getPassword());
	}
}
