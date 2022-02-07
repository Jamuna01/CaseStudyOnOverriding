package com.casestudy2;

public abstract class Student 
{
	private int studentId;
	private String name;
	private String mobileNo;
	private String address;
	private String course;
	
	
	
	public Student()
	{
		super();
	}
	public Student(int studentId, String name, String mobileNo, String address, String course)
	{
		super();
		this.studentId = studentId;
		this.name = name;
		this.mobileNo = mobileNo;
		this.address = address;
		this.course = course;
	}
	public int getStudentId()
	{
		return studentId;
	}
	public void setStudentId(int studentId)
	{
		this.studentId = studentId;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public String getMobileNo()
	{
		return mobileNo;
	}
	public void setMobileNo(String mobileNo)
	{
		this.mobileNo = mobileNo;
	}
	public String getAddress()
	{
		return address;
	}
	public void setAddress(String address)
	{
		this.address = address;
	}
	public String getCourse()
	{
		return course;
	}
	public void setCourse(String course)
	{
		this.course = course;
	}
	
	abstract int calculateFee(String cname);
	
}
