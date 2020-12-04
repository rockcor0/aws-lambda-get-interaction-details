package com.genesyscloud.interactiondetails.services.vo;

public class VOQueueAgentResponse {
	
	private String queueId;
	private String agentId;
	private String agentName;
	
	/**
	 * @param queueId
	 * @param agentId
	 */
	public VOQueueAgentResponse(String queueId, String agentId, String agentName) {
		super();
		this.queueId = queueId;
		this.agentId = agentId;
		this.agentName = agentName;
	}
	
	
	
	/**
	 * @return the agentName
	 */
	public String getAgentName() {
		return agentName;
	}



	/**
	 * @param agentName the agentName to set
	 */
	public void setAgentName(String agentName) {
		this.agentName = agentName;
	}



	/**
	 * 
	 */
	public VOQueueAgentResponse() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * @return the queueId
	 */
	public String getQueueId() {
		return queueId;
	}
	/**
	 * @param queueId the queueId to set
	 */
	public void setQueueId(String queueId) {
		this.queueId = queueId;
	}
	/**
	 * @return the agentId
	 */
	public String getAgentId() {
		return agentId;
	}
	/**
	 * @param agentId the agentId to set
	 */
	public void setAgentId(String agentId) {
		this.agentId = agentId;
	}

	

}
