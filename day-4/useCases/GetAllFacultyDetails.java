package com.useCases;

import java.util.List;

import com.Interfacing.CourseDao;
import com.Interfacing.CourseDaoImpl;
import com.Interfacing.FacultyDao;
import com.Interfacing.FacultyDaoImpl;
import com.bean.Course;
import com.bean.Faculty;
import com.exception.MyException;

public class GetAllFacultyDetails {

	public static void main(String[] args) {
		
		
		FacultyDao dao=new FacultyDaoImpl();
		try {
			List<Faculty> faculties=dao.getAllFacultyDetails();
			faculties.forEach(s->System.out.println(s));
		} catch (MyException e) {
			
			System.out.println(e.getMessage());
		}
		

	}

}
