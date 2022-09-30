package com.useCases;

import java.util.Scanner;

import com.Interfacing.FacultyDao;
import com.Interfacing.FacultyDaoImpl;

public class ShowFacultyAllocated {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Course name to search for finding batch allocation: ");
		String n=sc.next();
		
		FacultyDao dao=new FacultyDaoImpl();
		String s=dao.showFacultyAllocated(n);
		System.out.println(s);
		

	}

}
