package com.genesyscloud.interactiondetails.services.vo;

public class VOInteractionRequest {

	private String interactionId;
	private String token;
	private String purecloudUrl;
	
	/**
	 * @return the purecloudUrl
	 */
	public String getPurecloudUrl() {
		return purecloudUrl;
	}

	/**
	 * @param purecloudUrl the purecloudUrl to set
	 */
	public void setPurecloudUrl(String purecloudUrl) {
		this.purecloudUrl = purecloudUrl;
	}

	public VOInteractionRequest() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the interactionId
	 */
	public String getInteractionId() {
		return interactionId;
	}

	/**
	 * @param interactionId the interactionId to set
	 */
	public void setInteractionId(String interactionId) {
		this.interactionId = interactionId;
	}

	/**
	 * @return the token
	 */
	public String getToken() {
		return token;
	}

	/**
	 * @param token the token to set
	 */
	public void setToken(String token) {
		this.token = token;
	}
}
