package com.useCases;

import java.sql.SQLException;

import java.util.Scanner;

import com.Interfacing.FacultyDao;
import com.Interfacing.FacultyDaoImpl;
import com.bean.Faculty;

public class UpdateFacultyByFacultyName {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the faculty name to be change:");
		String n1=sc.next();
		System.out.println("Enter the new Faculty name to update:");
		String n2=sc.next();
		
		FacultyDao dao=new FacultyDaoImpl();
		
		
		try {
		String str=dao.updateFacultyByName(n1,n2);
		System.out.println(str);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
		
		
		
	}

}
