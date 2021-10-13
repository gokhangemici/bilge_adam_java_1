package com.gokhan.composition.avm;

import java.util.Date;

public class CommonProperties {
	public int id;
	public Date logsDate;
	
	public CommonProperties() {
		// TODO Auto-generated constructor stub
		this.id = 0;
		this.logsDate = new Date(System.currentTimeMillis());
	}

	public CommonProperties(int id) {
		this.id = id;	
	}

	@Override
	public String toString() {
		return "CommonProperties [id=" + id + ", logsDate=" + logsDate + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getLogsDate() {
		return logsDate;
	}

	public void setLogsDate(Date logsDate) {
		this.logsDate = logsDate;
	}
	
	
	
	
	
	
}
