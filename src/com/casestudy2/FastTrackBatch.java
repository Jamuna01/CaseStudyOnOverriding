package com.casestudy2;

import com.casestudy2.Student;

public class FastTrackBatch extends Student
{
	

	public FastTrackBatch(int studentId, String name, String mobileNo, String address, String course)
	{
		super(studentId, name, mobileNo, address, course);
	}

	@Override
	int calculateFee(String cname)
	{
		if(cname.equals("java"))
			return 50000;
		else if(cname.equals("python"))
			return 25000;
		else
			return 15000;
	}

}

