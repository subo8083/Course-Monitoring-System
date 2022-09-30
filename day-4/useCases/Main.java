package com.useCases;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your Choice: ");
		System.out.println("1) For Admin");
		System.out.println("2) For Faculty ");
		int n=sc.nextInt();
		switch(n) {
		
		case 1:
			userNameAndPasswordADMIN a=new userNameAndPasswordADMIN();
			a.userNameAndPass();
			if(a.flag==1)
			{
				
			}
			else
				break;
		
			
			
			
			
		
		}
	}

}
