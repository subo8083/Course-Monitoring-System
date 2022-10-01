package com.Interfacing;

import java.util.List;

import com.bean.Course;
import com.bean.CoursePlan;
import com.exception.MyException;

public interface CoursePlanDao {

	public  String registerCoursePlan(CoursePlan courseplan);
	public List<CoursePlan> getAllCoursePlanDetails() throws MyException;
}
