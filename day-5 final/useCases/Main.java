package com.useCases;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your Choice: ");
		System.out.println("1) For Admin");
		System.out.println("2) For Faculty ");
		int n=sc.nextInt();
		int flag2=0;
		int flag3=0;
		switch(n) {
		
		case 1:
			userNameAndPasswordADMIN a=new userNameAndPasswordADMIN();
			a.userNameAndPass();
			if(a.flag==1)
			{
				while(true)
				{
				
				if(flag2==1)
				{
					break;
				}
				System.out.println("Please select options for ADMIN");
				System.out.println("1) Create Course ");
				System.out.println("2) Update Course by course Name ");
				System.out.println("3) View Course ");
				System.out.println("4) create Batch ");
				System.out.println("5) Update Batch by BatchId");
				System.out.println("6) View Batch");
				System.out.println("7) Create Faculty");
				System.out.println("8) Update Faculty by Faculty Name");
				System.out.println("9) View Faculties ");
				System.out.println("10) Show Allocated Faculty for a particular Batch");
				System.out.println("11) Create course Plan");
				System.out.println("12) View Course Plan");
				System.out.println("13) EXIT");
				int course=sc.nextInt();
				switch(course) {
				
				case 1:
					RegisterCourse rc= new RegisterCourse();
					rc.main(args);
					break;
					
				case 2:
					UpdateCourseByCourseName up= new UpdateCourseByCourseName();
					up.main(args);
					break;
					
				case 3:
					GetAllCourses allCou=new GetAllCourses();
					allCou.main(args);
					break;
					
				case 4:
					RegisterBatch rb=new RegisterBatch();
					rb.main(args);
					break;
					
					
				case 5:
					updateBatchByBatchId ub=new updateBatchByBatchId();
					ub.main(args);
					break;
					
				case 6:
					getAllBatches gb=new getAllBatches();
					gb.main(args);
					break;
					
				case 7:
					RegisterFaculty rf=new RegisterFaculty();
					rf.main(args); 
					break;
					
				case 8:
					UpdateFacultyByFacultyName ufn=new UpdateFacultyByFacultyName();
					ufn.main(args);
					break;
					
				case 9:
					GetAllFacultyDetails gfd= new GetAllFacultyDetails();
					gfd.main(args);
					break;
					
				case 10:
					ShowFacultyAllocated sfa=new ShowFacultyAllocated();
					sfa.main(args);
					break;
					
				case 11:
					RegisterCoursePlan cp=new RegisterCoursePlan();
					cp.main(args);
					break;
					
				case 12:
					GetAllCoursePlanDetails gacp=new GetAllCoursePlanDetails();
					gacp.main(args);
					break;
					
					
				case 13:
					flag2=1;
					System.out.println("Thank You for using Course Monitoring System! Please Visit Again! ");
					break;
				}
				
	

			}
		}
			else
				break;
		break;
		case 2: 
			UsernamePasswordFaculty b=new UsernamePasswordFaculty();
			b.userNameAndPass();
			if(b.flags==1)
			{
				while(true)
				{
					if(flag3==1)
						break;
					System.out.println("Please Select options for Faculty: ");
					System.out.println("1) View Courses");
					System.out.println("2) View Faculty Alloted to particular batch");
					System.out.println("3) Daywise Plan for faulties ");
					System.out.println("4) Update Password ");
					System.out.println("5) EXIT");
					int num=sc.nextInt();
					switch(num) {
						
					case 1:
						GetAllCourses allCou=new GetAllCourses();
						allCou.main(args);
						break;
						
					case 2:
						ShowFacultyAllocated sfa=new ShowFacultyAllocated();
						sfa.main(args);
						break;
						
					case 3:
						ShowDayWiseUpdateForBatch sdu=new ShowDayWiseUpdateForBatch();
						sdu.main(args);
						break;
						
					case 4:
						UsernamePasswordFaculty ud=new UsernamePasswordFaculty();
						System.out.println("Enter New password");
						String p=sc.next();
						ud.pass=p;
						System.out.println("password updated");
						break;
						
					case 5:
						flag3=1;
						System.out.println("Thank You for using Course Monitoring System! Please Visit Again! ");
						break;
						
					}
					
				}
			}
			else
				break;
			break;
			
			
			
			
		
		}
	}

}
