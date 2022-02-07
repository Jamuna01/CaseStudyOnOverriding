package com.casestudy1;

import java.util.Scanner;

public class DepartmentDriver 
{
	public static void main(String[] args)
	{
		Scanner console = new Scanner(System.in);
		
		System.out.println("Enter employee no: ");
		int eno = Integer.parseInt(console.nextLine());
		
		System.out.println("Enter employee name: ");
		String name = console.nextLine();
		
		System.out.println("Enter department name: ");
		String depart = console.nextLine();
		
		AccountsDepartMent ad = new AccountsDepartMent(eno, name, depart);
		HrDepartment hd = new HrDepartment(eno, name, depart);
		ItDepartment id = new ItDepartment(eno, name, depart);
		
		System.out.println("What roles you perform: ");
		String role = console.nextLine();
		if(depart.equalsIgnoreCase("Account"))
		{
			if(role.equalsIgnoreCase("accountant"))
			{
				System.out.println("Your salary would be: $" + ad.CalculateSalary(role));
			}
			else if (role.equalsIgnoreCase("manager"))
			{
				System.out.println("Your salary would be: $" + ad.CalculateSalary(role));
			}
			else
			{
				System.out.println("Your salary would be: $" + ad.CalculateSalary(role));
			}
		}
		else if(depart.equalsIgnoreCase("HrDepartment"))
		{
			if(role.equalsIgnoreCase("administrator"))
			{
				System.out.println("Your salary would be: $" + hd.CalculateSalary(role));
			}
			else if (role.equalsIgnoreCase("manager"))
			{
				System.out.println("Your salary would be: $" + hd.CalculateSalary(role));
			}
			else
			{
				System.out.println("Your salary would be: $" + hd.CalculateSalary(role));
			}
		}
		else if(depart.equalsIgnoreCase("ItDepartment"))
		{
			if(role.equalsIgnoreCase("Engineer"))
			{
				System.out.println("Your salary would be: $" + id.CalculateSalary(role));
			}
			else if (role.equalsIgnoreCase("manager"))
			{
				System.out.println("Your salary would be: $" + id.CalculateSalary(role));
			}
			else
			{
				System.out.println("Your salary would be: $" + id.CalculateSalary(role));
			}
		}
		else
		{
			System.out.println("Sorry something went wrong....");
		}
	}
}
