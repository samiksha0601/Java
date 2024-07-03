package com.app.tester;

import static com.app.utils.TaskInputValidation.TaskInputValidations;

import java.util.List;
import java.util.Scanner;

import com.app.core.Task;
import com.app.utils.TaskUtils;

public class TaskApp {

	public static void main(String[] args) {
		try(Scanner sc=new Scanner(System.in))
		{
			boolean exit=false;
		
		   List<Task> TaskList=TaskUtils.populatedTaskInput();
		   while(!exit){

				System.out.println("Options: 1. Display Task\n"
						            +"2.Add New Task \n"
						            +"3. Delete a Task "+"4. Exit");
				
				System.out.println("Enter the choice\n");
				try
				{
					switch(sc.nextInt())
					{
					case 1:
						//forEach()
						System.out.println("Displaying Task");
						for(Task t:TaskList)
						{
							System.out.println(t);
						}
						break;
						
						
					case 2:
						//clean clean clean 2000-10-01 inprogress false
						System.out.println("Enter taskId,taskName, desp, taskDate,status,active");
						Task t1=TaskInputValidations(sc.next(),sc.next(),sc.next(),sc.next(),sc.next(),sc.nextBoolean(),TaskList);
						
						TaskList.add(t1);
						System.out.println("Task is added");
						
						break;
						
					case 3:
						System.out.println("Enter the id");
						TaskUtils.remove(sc.next(),TaskList);
						System.out.println("task is removed");
						
						break;
						
					case 0:
						
						exit=true;
						System.out.println("Exit Succesfully");
					
						break;	
						
					}
				}catch(Exception e)
				{
					System.out.println("error occured");
				}
		   }
		}
	}

	
	
}
