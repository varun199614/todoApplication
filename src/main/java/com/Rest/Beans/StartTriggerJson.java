package com.Rest.Beans;

public class StartTriggerJson {
	
	@Override
	public String toString() {
		return "StartTriggerJson [message=" + message + "]";
	}

	public StartTriggerJson(String message) {
		super();
		this.message = message;
	}

	private String message="";
	
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}


}
