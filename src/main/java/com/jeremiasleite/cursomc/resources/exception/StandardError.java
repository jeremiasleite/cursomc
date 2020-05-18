package com.jeremiasleite.cursomc.resources.exception;

import java.time.OffsetDateTime;

public class StandardError {
	
	private Integer status;
	private String msg;
	private OffsetDateTime timeStamp;
	
	
	public StandardError(Integer status, String msg, OffsetDateTime timeStamp) {
		super();
		this.status = status;
		this.msg = msg;
		this.timeStamp = timeStamp;
	}
	
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public OffsetDateTime getTimeStamp() {
		return timeStamp;
	}
	public void setTimeStamp(OffsetDateTime timeStamp) {
		this.timeStamp = timeStamp;
	}
	
	
}
