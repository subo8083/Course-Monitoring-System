package com.Interfacing;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.DButil.DbUtil;
import com.bean.Course;
import com.bean.CoursePlan;
import com.exception.MyException;

public class CoursePlanDaoImpl implements CoursePlanDao {

	@Override
	public String registerCoursePlan(CoursePlan courseplan) {
		
		String msg="Noted Added";
		try(Connection conn=DbUtil.provideConnection()){
			
			PreparedStatement ps=conn.prepareStatement("insert into CoursePlan values(?,?,?,?,?) ");
			ps.setInt(1, courseplan.getPlanId());
			ps.setInt(2,courseplan.getBatchId());
			ps.setInt(3, courseplan.getDayNumber());
			ps.setString(4, courseplan.getTopic());
			ps.setString(5, courseplan.getStatus());
			
			int x=ps.executeUpdate();
			if(x>0)
			{
				msg="Course PLAN Registered Successfully";
			}
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		return msg;
		
		
	}

	@Override
	public List<CoursePlan> getAllCoursePlanDetails() throws MyException {
		
		List<CoursePlan>courseplan=new ArrayList();
		try(Connection conn=DbUtil.provideConnection()){
			
			PreparedStatement ps=conn.prepareStatement("select * from coursePlan");
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				
				int r=rs.getInt("planId");
				int n=rs.getInt("batchid");
				int f=rs.getInt("daynumber");
				String cd=rs.getString("topic");
				String st=rs.getString("status");
				CoursePlan course=new CoursePlan(r,n,f,cd,st);
				courseplan.add(course);
				
			}
			
		}
		catch(SQLException e)
		{
			throw new MyException(e.getMessage());
		}
		if(courseplan.size()==0)
				throw new MyException("No courses found");
		return courseplan;
		
		
	}
	
	
}
