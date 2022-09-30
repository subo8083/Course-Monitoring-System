package com.useCases;

import java.sql.Date;
import java.util.Scanner;

import com.Interfacing.BatchDao;
import com.Interfacing.BatchDaoImpl;
import com.Interfacing.FacultyDao;
import com.Interfacing.FacultyDaoImpl;
import com.bean.Batch;

public class RegisterBatch {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter new Batch Id:");
		int id=sc.nextInt();
		System.out.println("Enter courseId ");
		int cid=sc.nextInt();
		System.out.println("Enter faculty id");
		int fid=sc.nextInt();
		System.out.println("Number of students in batch");
		int no=sc.nextInt();
		System.out.println("Enter start date of batch");
		String d=sc.next();
		System.out.println("Enter duration");
		int duration=sc.nextInt();
		
		BatchDao dao=new BatchDaoImpl();
		Batch batch=new Batch();
		batch.setBatchId(id);
		batch.setCourseId(cid);
		batch.setDuration(duration);
		batch.setFacultyId(fid);
		batch.setNoOfStudents(no);
		batch.setStartDate(d);
		String res=dao.registerBatch(batch);
		System.out.println(res);
		

	}

}
