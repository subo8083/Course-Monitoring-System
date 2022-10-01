package com.Interfacing;

import java.util.List;

import com.bean.Batch;
import com.bean.Course;
import com.exception.MyException;

public interface BatchDao {
	
	public String registerBatch( Batch batch);
	public String updateBatchByBatchId(int n1,int n2);
	public List<Batch> getAllBatchDetails() throws MyException;
	public String dayWiseUpdateOfBatch();
	
}
