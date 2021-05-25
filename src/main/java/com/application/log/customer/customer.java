package com.application.log.customer;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class customer {
	@Id
	private String id;
	private String name;
	private String logType;
	private String date;
	private String time;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLogType() {
		return logType;
	}
	public void setLogType(String logType) {
		this.logType = logType;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date= date;
		 
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
         this.time = time;
	}
	@Override
	public String toString() {
		return "LogModel [id=" + id + ", name=" + name + ", logType=" + logType + ", date=" + date + ", time=" + time
				+ "]";
	}
}
