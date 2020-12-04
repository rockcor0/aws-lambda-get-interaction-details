package com.genesyscloud.interactiondetails.services.vo;

import java.util.List;

import com.genesyscloud.interactiondetails.model.Participant;

public class VOInteractionDetailsResponse200 {

	private String conversationId;
	private String conversationStart;
	private String conversationEnd;
	private double mediaStatsMinConversationMos;
	private double mediaStatsMinConversationRFactor;
	private String originatingDirection;
	private String[] divisionIds;
	private List<Participant> participants;
	
	/**
	 * @return the conversationId
	 */
	public String getConversationId() {
		return conversationId;
	}
	/**
	 * @param conversationId the conversationId to set
	 */
	public void setConversationId(String conversationId) {
		this.conversationId = conversationId;
	}
	/**
	 * @return the conversationStart
	 */
	public String getConversationStart() {
		return conversationStart;
	}
	/**
	 * @param conversationStart the conversationStart to set
	 */
	public void setConversationStart(String conversationStart) {
		this.conversationStart = conversationStart;
	}
	/**
	 * @return the conversationEnd
	 */
	public String getConversationEnd() {
		return conversationEnd;
	}
	/**
	 * @param conversationEnd the conversationEnd to set
	 */
	public void setConversationEnd(String conversationEnd) {
		this.conversationEnd = conversationEnd;
	}
	/**
	 * @return the mediaStatsMinConversationMos
	 */
	public double getMediaStatsMinConversationMos() {
		return mediaStatsMinConversationMos;
	}
	/**
	 * @param mediaStatsMinConversationMos the mediaStatsMinConversationMos to set
	 */
	public void setMediaStatsMinConversationMos(double mediaStatsMinConversationMos) {
		this.mediaStatsMinConversationMos = mediaStatsMinConversationMos;
	}
	/**
	 * @return the mediaStatsMinConversationRFactor
	 */
	public double getMediaStatsMinConversationRFactor() {
		return mediaStatsMinConversationRFactor;
	}
	/**
	 * @param mediaStatsMinConversationRFactor the mediaStatsMinConversationRFactor to set
	 */
	public void setMediaStatsMinConversationRFactor(double mediaStatsMinConversationRFactor) {
		this.mediaStatsMinConversationRFactor = mediaStatsMinConversationRFactor;
	}
	/**
	 * @return the originatingDirection
	 */
	public String getOriginatingDirection() {
		return originatingDirection;
	}
	/**
	 * @param originatingDirection the originatingDirection to set
	 */
	public void setOriginatingDirection(String originatingDirection) {
		this.originatingDirection = originatingDirection;
	}
	/**
	 * @return the divisionIds
	 */
	public String[] getDivisionIds() {
		return divisionIds;
	}
	/**
	 * @param divisionIds the divisionIds to set
	 */
	public void setDivisionIds(String[] divisionIds) {
		this.divisionIds = divisionIds;
	}
	/**
	 * @return the participants
	 */
	public List<Participant> getParticipants() {
		return participants;
	}
	/**
	 * @param participants the participants to set
	 */
	public void setParticipants(List<Participant> participants) {
		this.participants = participants;
	}
	
	
	
}
