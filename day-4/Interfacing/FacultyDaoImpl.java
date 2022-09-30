package com.Interfacing;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.DButil.DbUtil;
import com.bean.Course;
import com.bean.Faculty;
import com.exception.MyException;

public class FacultyDaoImpl implements FacultyDao{

	@Override
	public String registerCourse(Faculty faculty) {
		
		String msg="Faculty not added";
		
		try(Connection conn=DbUtil.provideConnection()){
			
			PreparedStatement ps=conn.prepareStatement("insert into faculty values(?,?,?,?,?,?,?)");
			ps.setInt(1, faculty.getFacultyId());
			ps.setString(2, faculty.getFacultyName());
			ps.setString(3, faculty.getFacultyAddress());
			ps.setString(4, faculty.getMobile());
			ps.setString(5, faculty.getEmail());
			ps.setString(6, faculty.getUsername());
			ps.setString(7, faculty.getPassword());
			
			int x=ps.executeUpdate();
			if(x>0)
					msg="Faculty added";
			
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		return msg;

	}

	@Override
	public String updateFacultyByName(String s1, String s2) {
		
		
		String msg="Not Updated";
		try(Connection conn=DbUtil.provideConnection()){
			
			PreparedStatement ps=conn.prepareStatement("update faculty set facultyName= ? where facultyName= ? ");
			ps.setString(1, s2);
			ps.setString(2, s1);
			int x=ps.executeUpdate();
			if(x>0)
				msg="Faculty name updated";
			
			
			
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		return msg;
		
		
	}

	@Override
	public List<Faculty> getAllFacultyDetails() throws MyException {
		
		List<Faculty>faculties=new ArrayList();
		try(Connection conn=DbUtil.provideConnection()){
			
			PreparedStatement ps=conn.prepareStatement("select * from faculty");
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				
				int r=rs.getInt("facultyid");
				String n=rs.getString("facultyName");
				String address=rs.getString("facultyAddress");
				String mob=rs.getString("mobile");
				String email=rs.getString("email");
				String username=rs.getString("username");
				String password=rs.getString("password");
				Faculty faculty=new Faculty(r,n,address,mob,email,username,password);
				faculties.add(faculty);
				
			}
			
		}
		catch(SQLException e)
		{
			throw new MyException(e.getMessage());
		}
		if(faculties.size()==0)
				throw new MyException("No Faculty found");
		return faculties;
		
		
	}

	@Override
	public String showFacultyAllocated(String s) {
		String msg="NO Faculties are there";
		
		try(Connection conn=DbUtil.provideConnection()){
			
			PreparedStatement ps=conn.prepareStatement("select f.facultyid,f.facultyname,b.batchid,b.courseid from faculty f "
					+ "INNER JOIN batch b INNER JOIN Course c ON b.facultyid=f.facultyid AND c.courseid=b.courseId AND "
					+ "c.courseName=?");
			ps.setString(1, s);
			ResultSet rs=ps.executeQuery();
			while(rs.next())
			{
				msg="Showed the names of Faculties..";
				int fid=rs.getInt("facultyid");
				String fname=rs.getString("facultyname");
				int bid=rs.getInt("batchid");
				int cid=rs.getInt("courseid");
				
				
				System.out.println("FACULTY ID IS :"+fid);
				System.out.println("FACULTY NAME IS: "+fname);
				System.out.println("FACULTY BATCHID IS "+bid);
				System.out.println("FACULTY COURSE ID IS "+cid);
				System.out.println("===============================================");
			}
		}
		
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		
		
		
		return msg;
	}

	@Override
	public Faculty searchByUsernameAndPassword(String username, String password) {
		
		Faculty faculty=null;
		try (Connection conn=DbUtil.provideConnection()){
			PreparedStatement ps=conn.prepareStatement("select * from Faculty where username=? AND password=?");
			ps.setString(1, username);
			ps.setString(2, password);
			ResultSet rs=ps.executeQuery();
			
			if(rs.next()) {
				int r=rs.getInt("facultyid");
				String n=rs.getString("facultyName");
				String add=rs.getString("FacultyAddress");
				String mob=rs.getString("mobile");
				String email=rs.getString("email");
				faculty=new Faculty(r,n,add,mob,email,null,null);
				
				
			}
			
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return faculty;
	}
	
	

}
