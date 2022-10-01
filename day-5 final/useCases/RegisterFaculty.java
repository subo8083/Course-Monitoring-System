package com.useCases;

import java.util.Scanner;

import com.Interfacing.FacultyDao;
import com.Interfacing.FacultyDaoImpl;
import com.bean.Faculty;

public class RegisterFaculty {

	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter faculty id to insert");
		int id=sc.nextInt();
		System.out.println("Enter faculty name");
		String name=sc.next();
		System.out.println("Enter Address");
		String add=sc.next();
		System.out.println("Enter mobile number");
		String mob=sc.next();
		System.out.println("Enter email");
		String email=sc.next();
		System.out.println("Enter username");
		String username=sc.next();
		System.out.println("Enter password");
		String pass=sc.next();
		
		FacultyDao dao=new FacultyDaoImpl();
		Faculty faculty=new Faculty();
		faculty.setFacultyId(id);
		faculty.setFacultyName(name);
		faculty.setFacultyAddress(add);
		faculty.setMobile(mob);
		faculty.setEmail(email);
		faculty.setUsername(username);
		faculty.setPassword(pass);
		String res=dao.registerCourse(faculty);
		System.out.println(res);
		
		

	}

}
