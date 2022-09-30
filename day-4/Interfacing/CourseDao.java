package com.Interfacing;

import java.util.List;

import com.bean.Course;
import com.exception.MyException;

public interface CourseDao{
	
	public  String registerCourse(Course course);
	public String updateCourseByCourseName(String s1,String s2);
	public List<Course> getAllCourseDetails() throws MyException;

}
