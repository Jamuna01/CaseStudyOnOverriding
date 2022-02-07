package com.casestudy2;

public class WeekendBatch extends Student
{
	

	public WeekendBatch(int studentId, String name, String mobileNo, String address, String course)
	{
		super(studentId, name, mobileNo, address, course);
	}

	@Override
	int calculateFee(String cname) 
	{
		if(cname.equals("java"))
			return 750000;
		else if(cname.equals("python"))
			return 35000;
		else
			return 20000;
	}

}
