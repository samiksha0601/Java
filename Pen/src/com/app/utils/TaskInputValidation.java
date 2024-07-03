package com.app.utils;

import java.time.LocalDate;
import java.util.List;
import com.app.customException.*;
import com.app.core.Status;
import com.app.core.Task;

public class TaskInputValidation {

	public static Task TaskInputValidations(String taskId,String taskName, String desp, String taskDate, String status, boolean active,List<Task> TaskList)
	{
		//staskIdValidation(taskId);
		
		LocalDate tDate=LocalDate.parse(taskDate);
		Status sat=parseAndValidateStatus(status);
		
		Task t1=new Task(taskName,desp,tDate,sat,active);
		return t1;
		
		//Status.valueOf(status.toUpperCase()
	}
	
	public static  Status parseAndValidateStatus(String status)
	{
		return Status.valueOf(status.toUpperCase());
	}
	
//	public boolean taskIdValidation(String taskId){
//		
//		if(taskId.length()>=8)
//		{
//			System.out.println("Id is Accepted");
//		}
////		else
////			throw new NewException("Invalid TaskId");
////		
//		return  true;
//		
//	}
//	
	
	
	
	
	
}
