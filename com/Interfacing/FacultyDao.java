package com.Interfacing;

import com.bean.Course;
import com.bean.Faculty;

public interface FacultyDao {
	
	public  String registerCourse(Faculty faculty);
	public String updateFacultyByName(String name1,String name2);
	
}
