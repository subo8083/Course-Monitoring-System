package com.Interfacing;

import java.util.List;

import com.bean.Course;
import com.bean.Faculty;
import com.exception.MyException;

public interface FacultyDao {
	
	public  String registerCourse(Faculty faculty);
	public String updateFacultyByName(String name1,String name2);
	public List<Faculty> getAllFacultyDetails() throws MyException;
	public String showFacultyAllocated(String s);
	public Faculty searchByUsernameAndPassword(String username, String password);
	
}
