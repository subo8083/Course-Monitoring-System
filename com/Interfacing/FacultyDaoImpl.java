package com.Interfacing;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.DButil.DbUtil;
import com.bean.Faculty;

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
	
	

}
