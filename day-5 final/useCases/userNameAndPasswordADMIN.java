package com.useCases;

import java.util.Scanner;

public class userNameAndPasswordADMIN {
	
	int flag=0;
	public void userNameAndPass() {
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Admin Username ");
		String s=sc.next();
		System.out.println("Enter Admin Password");
		String pass=sc.next();
		if(s.equals("SUBOJIT") && pass.equals("1234"))
		{
			flag=1;
			System.out.println("LOGIN SUCCESSFUL");
		}
		else
			System.out.println("WRONG USERNAME OR PASSWORD");
		
	}

	public static void main(String[] args) {
		
		userNameAndPasswordADMIN a=new userNameAndPasswordADMIN();
		a.userNameAndPass();

	}

}
