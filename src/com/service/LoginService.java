package com.service;

import com.dao.StudentDao;
import com.pojo.Student;

public class LoginService {
		
	StudentDao studentDao = new StudentDao();
	
	
	//ÅÐ¶ÏµÇÂ¼ÊÇ·ñºÏ·¨
	public boolean legal(Student student) {
		
		return studentDao.isExists(student.getSno(), student.getPassword());
	}
}
