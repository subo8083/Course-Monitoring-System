package com.useCases;

import java.util.Scanner;

import com.Interfacing.CourseDao;
import com.Interfacing.CourseDaoImpl;
import com.bean.Course;

public class UpdateCourseByCourseName {

	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the course Name to update");
		String name=sc.next();
		System.out.println("Enter the new course name");
		String name2=sc.next();
		
		CourseDao dao=new CourseDaoImpl();
		
		try {
			String course=dao.updateCourseByCourseName(name,name2);
			System.out.println(course);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
