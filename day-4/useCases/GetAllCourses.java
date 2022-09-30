package com.useCases;

import java.util.List;

import com.Interfacing.CourseDao;
import com.Interfacing.CourseDaoImpl;
import com.bean.Course;
import com.exception.MyException;

public class GetAllCourses {

	public static void main(String[] args) {
		
		CourseDao dao=new CourseDaoImpl();
		try {
			List<Course> courses=dao.getAllCourseDetails();
			courses.forEach(s->System.out.println(s));
		} catch (MyException e) {
			
			System.out.println(e.getMessage());
		}
		

	}

}
