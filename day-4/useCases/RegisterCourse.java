package com.useCases;

import java.util.Scanner;

import com.Interfacing.CourseDao;
import com.Interfacing.CourseDaoImpl;
import com.bean.Course;

public class RegisterCourse {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter courseID");
		int id=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter course Name");
		String name=sc.next();
		sc.nextLine();
		System.out.println("Enter fee");
		int fee=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter courseDescription");
		String desc=sc.nextLine();
	
		CourseDao dao=new CourseDaoImpl();
		Course course= new Course();
		course.setCourseId(id);
		course.setCoursename(name);
		course.setCourseFee(fee);
		course.setCourseDescription(desc);
		String res=dao.registerCourse(course);
		System.out.println(res);

	}

}
