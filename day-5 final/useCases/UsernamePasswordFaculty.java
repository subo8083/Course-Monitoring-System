package com.useCases;

import java.util.Scanner;

public class UsernamePasswordFaculty {
	
	int flags=0;

	String pass="123";
	
		
	public void userNameAndPass() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Faculty Username ");
		String s=sc.next();
		System.out.println("Enter Faculty Password");
		String passed=sc.next();
		if(s.equals("RATAN") && pass.equals(passed))
		{
			flags=1;
			System.out.println("LOGIN SUCCESSFUL");
		}
		else
			System.out.println("WRONG USERNAME OR PASSWORD");
	}	
	

	public static void main(String[] args) {
		
		UsernamePasswordFaculty a=new UsernamePasswordFaculty();
		a.userNameAndPass();

	}
		

	}
