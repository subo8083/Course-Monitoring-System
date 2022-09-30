package com.Interfacing;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.DButil.DbUtil;
import com.bean.Batch;
import com.bean.Course;
import com.exception.MyException;

public class BatchDaoImpl implements BatchDao {

	@Override
	public String registerBatch(Batch batch) {
		
		String msg="Batch Not Inserted";
		
		try(Connection conn=DbUtil.provideConnection()){
			
			PreparedStatement ps=conn.prepareStatement("insert into batch values(?,?,?,?,?,?)");
			ps.setInt(1, batch.getBatchId());
			ps.setInt(2, batch.getCourseId());
			ps.setInt(3, batch.getFacultyId());
			ps.setInt(4, batch.getNoOfStudents());
			ps.setString(5, batch.getStartDate());
			ps.setInt(6, batch.getDuration());
			int x=ps.executeUpdate();
			if(x>0)
					msg="New Batch added";
			
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		return msg;
	}

	@Override
	public String updateBatchByBatchId(int n1, int n2) {
		
		String msg="Not updated";
		try(Connection conn=DbUtil.provideConnection()){
			
			PreparedStatement ps=conn.prepareStatement("update batch set batchId= ? where batchId= ?");
			
			ps.setInt(1, n2);
			ps.setInt(2, n1);
			
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
	public List<Batch> getAllBatchDetails() throws MyException {
		
		List<Batch>batches=new ArrayList();
		try(Connection conn=DbUtil.provideConnection()){
			
			PreparedStatement ps=conn.prepareStatement("select * from batch");
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				
				int r=rs.getInt("batchId");
				int n=rs.getInt("courseId");
				int f=rs.getInt("facultyId");
				int no=rs.getInt("numberOfStudents");
				String s=rs.getString("batchStartDate");
				int d=rs.getInt("duration");
				Batch batch=new Batch(r,n,f,no,s,d);
				batches.add(batch);
				
			}
			
		}
		catch(SQLException e)
		{
			throw new MyException(e.getMessage());
		}
		if(batches.size()==0)
				throw new MyException("No courses found");
		return batches;
		
	}

	@Override
	public String dayWiseUpdateOfBatch() {
		
		String msg="Not updated or no batch detected for now";
		
		try(Connection conn=DbUtil.provideConnection()){
			
			PreparedStatement ps=conn.prepareStatement("select b.batchid,b.facultyid,b.numberofStudents,cp.planid,"
					+ "cp.topic,cp.status from batch b "
					+ "INNER JOIN courseplan cp where b.batchid=cp.batchid");
			
			ResultSet rs=ps.executeQuery();
			int i=0;
			 while(rs.next()) {
				 
				 msg="updated..";
				 int bid=rs.getInt("batchid");
				 int fid=rs.getInt("facultyid");
				 int n2=rs.getInt("numberOfStudents");
				 int p=rs.getInt("planid");
				 String t=rs.getString("topic");
				 String s=rs.getString("status");
				 
				 System.out.println("batch Id is "+bid);
				 System.out.println("FACULTY ID is: "+fid);
				 System.out.println("NUMBER OF STUDENTS are: "+n2);
				 System.out.println("PLAN ID is: "+p);
				 System.out.println("TOPIC For the day "+ ++i +" "+t);
				 System.out.println("STATUS : "+s);
				 System.out.println("=========================================");
				 
			 }
			
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		return msg;
	}
	
	

}
