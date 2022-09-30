package com.useCases;

import java.util.Scanner;

import com.Interfacing.FacultyDao;
import com.Interfacing.FacultyDaoImpl;
import com.bean.Faculty;
import com.exception.MyException;

public class SearchFacultyByUserName {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Username Of Faculty");
		String u=sc.next();
		System.out.println("Enter password for faculty");
		String p=sc.next();
		FacultyDao dao=new FacultyDaoImpl();
		try {
			Faculty faculty=dao.searchByUsernameAndPassword(u, p);
			System.out.println(faculty);
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}

}
