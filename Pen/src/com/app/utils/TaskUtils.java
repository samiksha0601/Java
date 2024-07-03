package com.app.utils;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.app.core.Status;
//import com.app.core.Status;
import com.app.core.Task;

public class TaskUtils {

	
	public static List<Task> populatedTaskInput()
	{
		//String taskName, String desp, LocalDate taskDate, status taskStatus, boolean active
		Task t1=new Task("clean","cleaning","clean",LocalDate.parse("2000-01-01"),Status.INPROGRESS,true);
		Task t2=new Task("cook","cooking","maggie",LocalDate.parse("2023-01-01"),Status.COMPLETED,true);	
		
		Task tarr[]= {t1,t2};
		List<Task> list=new ArrayList<Task>();
		for(Task t:tarr)
		{
			list.add(t);
		 
		}
		 return list;
	}
	
	public static String remove(String id,List<Task> TaskList)
	{
//		Task t2=new Task(id);
//		int index=TaskList.indexOf(t2);
//		System.out.println(index);
//		TaskList.remove(index);
//		return "Task is removed"+TaskList;
		
		
		Iterator<Task> itr=TaskList.iterator();
		while(itr.hasNext())
		{
			itr.next();
			if(true)
				itr.remove();
		}
		return "Task is removed";
	}

}
