package com.casestudy2;

import java.util.Scanner;

import com.casestudy2.WeekendBatch;

public class StudentClient
{
	public static void main(String[] args)
	{
		Scanner console = new Scanner(System.in);
		System.out.println("Student id:");
		int id = Integer.parseInt(console.nextLine());
		
		System.out.println("Student name: ");
		String name = console.nextLine();
		
		System.out.println("Student mobile no: ");
		String mobile = console.nextLine();
		
		System.out.println("Student address: ");
		String address = console.nextLine();
		
		System.out.println("Student course: ");
		String course = console.nextLine();
		
		System.out.println("Which batch you want: ");
		String batch = console.nextLine();
		
		FastTrackBatch ftb = new FastTrackBatch(id, name, mobile, address, course);
		WeekendBatch wb = new WeekendBatch(id, name, mobile, address, course);
		WeekdaysBatch wdb = new WeekdaysBatch(id, name, mobile, address, course);
		
		if(batch.equalsIgnoreCase("FastTrackBatch"))
		{
			if(course.equalsIgnoreCase("java"))
			{
				System.out.println(ftb.getStudentId() + " " + ftb.getName() + " " + ftb.getMobileNo() + " " + ftb.getAddress()+ " " + ftb.getCourse());
				System.out.println("Your course fee will be: $" + ftb.calculateFee(course));
			}
			else if(course.equalsIgnoreCase("python"))
			{
				System.out.println(ftb.getStudentId() + " " + ftb.getName() + " " + ftb.getMobileNo() + " " + ftb.getAddress()+ " " + ftb.getCourse());
				System.out.println("Your course fee will be: $" + ftb.calculateFee(course));
			}
			else
			{
				System.out.println("Your course fee will be: $" + ftb.calculateFee(course));
			}
		}
		else if(batch.equalsIgnoreCase("WeekendBatch"))
		{
			if(course.equalsIgnoreCase("java"))
			{
				System.out.println(wb.getStudentId() + " " + wb.getName() + " " + wb.getMobileNo() + " " + wb.getAddress()+ " " + wb.getCourse());
				System.out.println("Your course fee will be: $" + wb.calculateFee(course));
			}
			else if(course.equalsIgnoreCase("python"))
			{
				System.out.println(wb.getStudentId() + " " + wb.getName() + " " + wb.getMobileNo() + " " + wb.getAddress()+ " " + wb.getCourse());
				System.out.println("Your course fee will be: $" + wb.calculateFee(course));
			}
			else
			{
				System.out.println("Your course fee will be: $" + wb.calculateFee(course));
			}
		}
		else if(batch.equalsIgnoreCase("WeekdaysBatch"))
		{
			if(course.equalsIgnoreCase("java"))
			{
				System.out.println(wdb.getStudentId() + " " + wdb.getName() + " " + wdb.getMobileNo() + " " + wdb.getAddress()+ " " + wdb.getCourse());
				System.out.println("Your course fee will be: $" + wdb.calculateFee(course));
			}
			else if(course.equalsIgnoreCase("python"))
			{
				System.out.println(wdb.getStudentId() + " " + wdb.getName() + " " + wdb.getMobileNo() + " " + wdb.getAddress()+ " " + wdb.getCourse());
				System.out.println("Your course fee will be: $" + wdb.calculateFee(course));
			}
			else
			{
				System.out.println("Your course fee will be: $" + wdb.calculateFee(course));
			}
		}
		else
		{
			System.out.println("Sorry, something went wrong..");
		}
		
	}
}
