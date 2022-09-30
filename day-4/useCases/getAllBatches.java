package com.useCases;

import java.util.List;

import com.Interfacing.BatchDao;
import com.Interfacing.BatchDaoImpl;
import com.Interfacing.CourseDao;
import com.Interfacing.CourseDaoImpl;
import com.bean.Batch;
import com.bean.Course;
import com.exception.MyException;

public class getAllBatches {

	public static void main(String[] args) {
		
		
		BatchDao dao=new BatchDaoImpl();
		try {
			List<Batch> batches=dao.getAllBatchDetails();
			batches.forEach(s->System.out.println(s));
		} catch (MyException e) {
			
			System.out.println(e.getMessage());
		}
		
		

	}

}
