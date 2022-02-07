package com.casestudy1;

public class AccountsDepartMent extends Employee
{


	public AccountsDepartMent(int eno, String ename, String dname)
	{
		super(eno, ename, dname);
		
	}

	@Override
	int CalculateSalary(String dname)
	{
		if(dname.equalsIgnoreCase("accountant"))
		{
			return 1500;
		}
		else if (dname.equalsIgnoreCase("manager"))
		{
			return 3000;
		}
		else
		{
			return 1000;
		}
		
		
	}

}
