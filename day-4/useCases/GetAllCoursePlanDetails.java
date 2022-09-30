package com.useCases;

import java.util.List;

import com.Interfacing.CourseDao;
import com.Interfacing.CourseDaoImpl;
import com.Interfacing.CoursePlanDao;
import com.Interfacing.CoursePlanDaoImpl;
import com.bean.Course;
import com.bean.CoursePlan;
import com.exception.MyException;

public class GetAllCoursePlanDetails {

	public static void main(String[] args) {
		
		
		CoursePlanDao dao=new CoursePlanDaoImpl();
		try {
			List<CoursePlan> courses=dao.getAllCoursePlanDetails();
			courses.forEach(s->System.out.println(s));
		} catch (MyException e) {
			
			System.out.println(e.getMessage());
		}
		

	}

}
