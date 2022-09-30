package com.useCases;

import java.util.Scanner;

import com.Interfacing.CoursePlanDao;
import com.Interfacing.CoursePlanDaoImpl;
import com.bean.Course;
import com.bean.CoursePlan;

public class RegisterCoursePlan {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter course PLAN ID");
		int id=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter batch ID");
		int name=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter day number");
		int day=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter TOPIC");
		String desc=sc.nextLine();
		System.out.println("Enter Status");
		String st=sc.next();
	
		CoursePlanDao dao=new CoursePlanDaoImpl();
		CoursePlan courseplan= new CoursePlan();
		courseplan.setPlanId(id);
		courseplan.setBatchId(name);
		courseplan.setDayNumber(day);
		courseplan.setTopic(desc);
		courseplan.setStatus(st);
		String res=dao.registerCoursePlan(courseplan);
		System.out.println(res);
		
		

	}

}
