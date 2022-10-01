package com.useCases;

import java.util.Scanner;

import com.Interfacing.BatchDao;
import com.Interfacing.BatchDaoImpl;

public class ShowDayWiseUpdateForBatch {

	public static void main(String[] args) {
		
		BatchDao dao=new BatchDaoImpl();
		String s=dao.dayWiseUpdateOfBatch();
		System.out.println(s);

	}

}
