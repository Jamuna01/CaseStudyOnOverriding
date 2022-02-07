package com.casestudy1;

public class HrDepartment extends Employee
{

	
	public HrDepartment(int eno, String ename, String dname)
	{
		super(eno, ename, dname);
		
	}

	@Override
	int CalculateSalary(String dname) 
	{
		if(dname.equalsIgnoreCase("administrator"))
		{
			return 2000;
		}
		else if (dname.equalsIgnoreCase("manager"))
		{
			return 2800;
		}
		else
		{
			return 1500;
		}
		
	}

}
