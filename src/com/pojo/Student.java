package com.pojo;

public class Student {

	private int id;
	private String name;
	private int age;
	private int sno;
	private int password;
	
	
	public Student() {
		
	}
	
	
	public Student(int id, String name, int age, int sno, int password) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.sno = sno;
		this.password = password;
	}



	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	public int getPassword() {
		return password;
	}
	public void setPassword(int password) {
		this.password = password;
	}
	
	
}
