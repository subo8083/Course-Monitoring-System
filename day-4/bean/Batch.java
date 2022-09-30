package com.bean;

import java.sql.Date;

public class Batch {
	
	private int batchId;
	private int CourseId;
	private int facultyId;
	private int noOfStudents;
	private String startDate;
	private int duration;
	
	
	public int getBatchId() {
		return batchId;
	}
	public void setBatchId(int batchId) {
		this.batchId = batchId;
	}
	public int getCourseId() {
		return CourseId;
	}
	public void setCourseId(int courseId) {
		CourseId = courseId;
	}
	public int getFacultyId() {
		return facultyId;
	}
	public void setFacultyId(int facultyId) {
		this.facultyId = facultyId;
	}
	public int getNoOfStudents() {
		return noOfStudents;
	}
	public void setNoOfStudents(int noOfStudents) {
		this.noOfStudents = noOfStudents;
	}
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String d) {
		this.startDate = d;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	@Override
	public String toString() {
		return "Batch [batchId=" + batchId + ", CourseId=" + CourseId + ", facultyId=" + facultyId + ", noOfStudents="
				+ noOfStudents + ", startDate=" + startDate + ", duration=" + duration + "]";
	}
	public Batch(int batchId, int courseId, int facultyId, int noOfStudents, String startDate, int duration) {
		super();
		this.batchId = batchId;
		CourseId = courseId;
		this.facultyId = facultyId;
		this.noOfStudents = noOfStudents;
		this.startDate = startDate;
		this.duration = duration;
	}
	
	public Batch() {
		
	}

}
