package com.genesyscloud.interactiondetails.model;

public class Segment {

	private String segmentStart;
	private String segmentEnd;
	private String segmentType;
	private boolean conference;
	
	private String queueId;
	private String disconnectType;
	private int[] q850ResponseCodes;
	private int[] sipResponseCodes;
	
	/**
	 * @return the segmentStart
	 */
	public String getSegmentStart() {
		return segmentStart;
	}
	/**
	 * @param segmentStart the segmentStart to set
	 */
	public void setSegmentStart(String segmentStart) {
		this.segmentStart = segmentStart;
	}
	/**
	 * @return the segmentEnd
	 */
	public String getSegmentEnd() {
		return segmentEnd;
	}
	/**
	 * @param segmentEnd the segmentEnd to set
	 */
	public void setSegmentEnd(String segmentEnd) {
		this.segmentEnd = segmentEnd;
	}
	/**
	 * @return the segmentType
	 */
	public String getSegmentType() {
		return segmentType;
	}
	/**
	 * @param segmentType the segmentType to set
	 */
	public void setSegmentType(String segmentType) {
		this.segmentType = segmentType;
	}
	/**
	 * @return the conference
	 */
	public boolean isConference() {
		return conference;
	}
	/**
	 * @param conference the conference to set
	 */
	public void setConference(boolean conference) {
		this.conference = conference;
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
	 * @return the disconnectType
	 */
	public String getDisconnectType() {
		return disconnectType;
	}
	/**
	 * @param disconnectType the disconnectType to set
	 */
	public void setDisconnectType(String disconnectType) {
		this.disconnectType = disconnectType;
	}
	/**
	 * @return the q850ResponseCodes
	 */
	public int[] getQ850ResponseCodes() {
		return q850ResponseCodes;
	}
	/**
	 * @param q850ResponseCodes the q850ResponseCodes to set
	 */
	public void setQ850ResponseCodes(int[] q850ResponseCodes) {
		this.q850ResponseCodes = q850ResponseCodes;
	}
	/**
	 * @return the sipResponseCodes
	 */
	public int[] getSipResponseCodes() {
		return sipResponseCodes;
	}
	/**
	 * @param sipResponseCodes the sipResponseCodes to set
	 */
	public void setSipResponseCodes(int[] sipResponseCodes) {
		this.sipResponseCodes = sipResponseCodes;
	}
	
	
	
}
