package com.Interfacing;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.DButil.DbUtil;
import com.bean.Course;
import com.exception.MyException;

public class CourseDaoImpl implements CourseDao {

	@Override
	public String registerCourse(Course course) {
		
		String msg="not Inserted";
		
		try(Connection conn=DbUtil.provideConnection()){
			
			PreparedStatement ps=conn.prepareStatement("insert into Course values(?,?,?,?) ");
			ps.setInt(1, course.getCourseId());
			ps.setString(2,course.getCoursename());
			ps.setInt(3, course.getCourseFee());
			ps.setString(4, course.getCourseDescription());
			
			int x=ps.executeUpdate();
			if(x>0)
			{
				msg="Course Registered Successfully";
			}
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		return msg;
		
	}

	@Override
	public String updateCourseByCourseName(String s1,String s2) {
		Scanner sc=new Scanner(System.in);
		String msg="Not updated";
		try(Connection conn=DbUtil.provideConnection()){
			
			PreparedStatement ps=conn.prepareStatement("update course set courseName= ? where courseName= ?");
			
			ps.setString(1, s2);
			ps.setString(2, s1);
			
			int x=ps.executeUpdate();
			if(x>0)
				msg="updated..";
			
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		return msg;
		
	}

	@Override
	public List<Course> getAllCourseDetails() throws MyException {
		
		List<Course>courses=new ArrayList();
		try(Connection conn=DbUtil.provideConnection()){
			
			PreparedStatement ps=conn.prepareStatement("select * from course");
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				
				int r=rs.getInt("courseId");
				String n=rs.getString("courseName");
				int f=rs.getInt("fee");
				String cd=rs.getString("courseDescription");
				Course course=new Course(r,n,f,cd);
				courses.add(course);
				
			}
			
		}
		catch(SQLException e)
		{
			throw new MyException(e.getMessage());
		}
		if(courses.size()==0)
				throw new MyException("No courses found");
		return courses;

	}

}
