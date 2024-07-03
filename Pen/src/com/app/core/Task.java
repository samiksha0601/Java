package com.app.core;

import java.time.LocalDate;

public class Task {

	
	private String taskId;
	private String taskName;
	private String desp;
	private LocalDate taskDate;
	private Status status;
	private boolean active;
	
	
	public Task( String taskName, String desp, LocalDate taskDate, Status status, boolean active) {
		super();
		//this.taskId = taskId;
		this.taskName = taskName;
		this.desp = desp;
		this.taskDate = taskDate;
		this.status = status;
		this.active = active;
	}

	

	public Task(String taskId, String taskName, String desp, LocalDate taskDate, Status status, boolean active) {
		super();
		this.taskId = taskId;
		this.taskName = taskName;
		this.desp = desp;
		this.taskDate = taskDate;
		this.status = status;
		this.active = active;
	}



	@Override
	public String toString() {
		return "Task [taskId=" + taskId + ", taskName=" + taskName + ", desp=" + desp + ", taskDate=" + taskDate
				+ ", status=" + status + ", active=" + active + "]";
	}
	
	
	
}
