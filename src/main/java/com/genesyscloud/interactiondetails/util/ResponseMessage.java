package com.genesyscloud.interactiondetails.util;

public class ResponseMessage {
	
	/**
	 * 
	 */
	public ResponseMessage() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param message
	 */
	public ResponseMessage(String message) {
		super();
		this.message = message;
	}
	
	

	private String message;

	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * @param message the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}

	
}
