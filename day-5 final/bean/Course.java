package com.bean;

public class Course {
	
	private int courseId;
	private String Coursename;
	private int courseFee;
	private String courseDescription;
	
	
	public int getCourseId() {
		return courseId;
	}
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	public String getCoursename() {
		return Coursename;
	}
	public void setCoursename(String coursename) {
		Coursename = coursename;
	}
	public int getCourseFee() {
		return courseFee;
	}
	public void setCourseFee(int courseFee) {
		this.courseFee = courseFee;
	}
	public String getCourseDescription() {
		return courseDescription;
	}
	public void setCourseDescription(String courseDuration) {
		this.courseDescription = courseDuration;
	}
	
	
	@Override
	public String toString() {
		return "Course [courseId=" + courseId + ", Coursename=" + Coursename + ", courseFee=" + courseFee
				+ ", courseDuration=" + courseDescription + "]";
	}
	public Course(int courseId, String coursename, int courseFee, String courseDescription) {
		super();
		this.courseId = courseId;
		Coursename = coursename;
		this.courseFee = courseFee;
		this.courseDescription = courseDescription;
	}
	
	
	public Course()
	{
		
	}

}
