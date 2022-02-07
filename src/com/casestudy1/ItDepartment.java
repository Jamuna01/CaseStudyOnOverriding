package com.casestudy1;

public class ItDepartment extends Employee 
{

	
	public ItDepartment(int eno, String ename, String dname)
	{
		super(eno, ename, dname);
		
	}

	@Override
	int CalculateSalary(String dname)
	{
		if(dname.equalsIgnoreCase("manager"))
		{
			return 5000;
		}
		else if (dname.equalsIgnoreCase("engineer"))
		{
			return 3000;
		}
		else
		{
			return 2000;
		}
		
	}

}
