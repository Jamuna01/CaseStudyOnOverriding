package com.casestudy2;

public class WeekdaysBatch extends Student
{

	
	public WeekdaysBatch(int studentId, String name, String mobileNo, String address, String course)
	{
		super(studentId, name, mobileNo, address, course);
	}

	@Override
	int calculateFee(String cname)
	{
		if(cname.equals("java"))
			return 30000;
		else if(cname.equals("python"))
			return 15000;
		else
			return 8000;
	}

}
