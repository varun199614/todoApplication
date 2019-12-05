package com.Rest.Beans;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class TodoListItems {
	private String taskTitle;
	private Date addedOn;
	private Date remindMeAt;
	private String taskDetail;
	@Id
	@GeneratedValue
	private int id;
	public TodoListItems() {

	}
	public TodoListItems(String taskTitle, Date addedOn, Date remindMeAt, String taskDetail, int id) {
		super();
		this.taskTitle = taskTitle;
		this.addedOn = addedOn;
		this.remindMeAt = remindMeAt;
		this.taskDetail = taskDetail;
		this.id = id;
	}
	public String getTaskTitle() {
		return taskTitle;
	}
	public void setTaskTitle(String taskTitle) {
		this.taskTitle = taskTitle;
	}
	public Date getAddedOn() {
		return addedOn;
	}
	public void setAddedOn(Date addedOn) {
		this.addedOn = addedOn;
	}
	public Date getRemindMeAt() {
		return remindMeAt;
	}
	public void setRemindMeAt(Date remindMeAt) {
		this.remindMeAt = remindMeAt;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTaskDetail() {
		return taskDetail;
	}
	public void setTaskDetail(String taskDetail) {
		this.taskDetail = taskDetail;
	}
	@Override
	public String toString() {
		return "TodoListItems [taskTitle=" + taskTitle + ", addedOn=" + addedOn + ", remindMeAt=" + remindMeAt
				+ ", taskDetail=" + taskDetail + ", id=" + id + "]";
	}
	
	
	
}
