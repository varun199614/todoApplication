package com.Rest.Beans;

import java.util.Date;

public class CustomiseException {
	private Date timeOfError;
	private String errorMessage;
	private String completeDiscription;
	
	public CustomiseException(Date timeOfError, String errorMessage, String completeDiscription) {
		super();
		this.timeOfError = timeOfError;
		this.errorMessage = errorMessage;
		this.completeDiscription = completeDiscription;
	}
	public Date getTimeOfError() {
		return timeOfError;
	}
	public void setTimeOfError(Date timeOfError) {
		this.timeOfError = timeOfError;
	}
	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	public String getCompleteDiscription() {
		return completeDiscription;
	}
	public void setCompleteDiscription(String completeDiscription) {
		this.completeDiscription = completeDiscription;
	}
	@Override
	public String toString() {
		return "CustomiseException [timeOfError=" + timeOfError + ", errorMessage=" + errorMessage
				+ ", completeDiscription=" + completeDiscription + "]";
	}
	
	
}
