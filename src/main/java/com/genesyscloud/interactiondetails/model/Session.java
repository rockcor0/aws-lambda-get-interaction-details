/**
 * 
 */
package com.genesyscloud.interactiondetails.model;

import java.util.List;

/**
 * @author RicardoDelgado
 *
 */
public class Session {
	
	private String mediaType;
	private String sessionId;
	private String ani;
	private String direction;
	private String dnis;
	private String sessionDnis;
	private String edgeId;
	private String remoteNameDisplayable;
	private String peerId;
	private List<Segment> segments; 
	private List<Metric> metrics;
	private List<MediaEndpointStat> mediaEndpointStats;
	private Flow flow;
	private boolean recording;
	private String protocolCallId;
	private String provider;
	
	/**
	 * @return the mediaType
	 */
	public String getMediaType() {
		return mediaType;
	}
	/**
	 * @param mediaType the mediaType to set
	 */
	public void setMediaType(String mediaType) {
		this.mediaType = mediaType;
	}
	/**
	 * @return the sessionId
	 */
	public String getSessionId() {
		return sessionId;
	}
	/**
	 * @param sessionId the sessionId to set
	 */
	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}
	/**
	 * @return the ani
	 */
	public String getAni() {
		return ani;
	}
	/**
	 * @param ani the ani to set
	 */
	public void setAni(String ani) {
		this.ani = ani;
	}
	/**
	 * @return the direction
	 */
	public String getDirection() {
		return direction;
	}
	/**
	 * @param direction the direction to set
	 */
	public void setDirection(String direction) {
		this.direction = direction;
	}
	/**
	 * @return the dnis
	 */
	public String getDnis() {
		return dnis;
	}
	/**
	 * @param dnis the dnis to set
	 */
	public void setDnis(String dnis) {
		this.dnis = dnis;
	}
	/**
	 * @return the sessionDnis
	 */
	public String getSessionDnis() {
		return sessionDnis;
	}
	/**
	 * @param sessionDnis the sessionDnis to set
	 */
	public void setSessionDnis(String sessionDnis) {
		this.sessionDnis = sessionDnis;
	}
	/**
	 * @return the edgeId
	 */
	public String getEdgeId() {
		return edgeId;
	}
	/**
	 * @param edgeId the edgeId to set
	 */
	public void setEdgeId(String edgeId) {
		this.edgeId = edgeId;
	}
	/**
	 * @return the remoteNameDisplayable
	 */
	public String getRemoteNameDisplayable() {
		return remoteNameDisplayable;
	}
	/**
	 * @param remoteNameDisplayable the remoteNameDisplayable to set
	 */
	public void setRemoteNameDisplayable(String remoteNameDisplayable) {
		this.remoteNameDisplayable = remoteNameDisplayable;
	}
	/**
	 * @return the peerId
	 */
	public String getPeerId() {
		return peerId;
	}
	/**
	 * @param peerId the peerId to set
	 */
	public void setPeerId(String peerId) {
		this.peerId = peerId;
	}
	/**
	 * @return the segments
	 */
	public List<Segment> getSegments() {
		return segments;
	}
	/**
	 * @param segments the segments to set
	 */
	public void setSegments(List<Segment> segments) {
		this.segments = segments;
	}
	/**
	 * @return the metrics
	 */
	public List<Metric> getMetrics() {
		return metrics;
	}
	/**
	 * @param metrics the metrics to set
	 */
	public void setMetrics(List<Metric> metrics) {
		this.metrics = metrics;
	}
	/**
	 * @return the mediaEndpointStats
	 */
	public List<MediaEndpointStat> getMediaEndpointStats() {
		return mediaEndpointStats;
	}
	/**
	 * @param mediaEndpointStats the mediaEndpointStats to set
	 */
	public void setMediaEndpointStats(List<MediaEndpointStat> mediaEndpointStats) {
		this.mediaEndpointStats = mediaEndpointStats;
	}
	/**
	 * @return the flow
	 */
	public Flow getFlow() {
		return flow;
	}
	/**
	 * @param flow the flow to set
	 */
	public void setFlow(Flow flow) {
		this.flow = flow;
	}
	/**
	 * @return the recording
	 */
	public boolean isRecording() {
		return recording;
	}
	/**
	 * @param recording the recording to set
	 */
	public void setRecording(boolean recording) {
		this.recording = recording;
	}
	/**
	 * @return the protocolCallId
	 */
	public String getProtocolCallId() {
		return protocolCallId;
	}
	/**
	 * @param protocolCallId the protocolCallId to set
	 */
	public void setProtocolCallId(String protocolCallId) {
		this.protocolCallId = protocolCallId;
	}
	/**
	 * @return the provider
	 */
	public String getProvider() {
		return provider;
	}
	/**
	 * @param provider the provider to set
	 */
	public void setProvider(String provider) {
		this.provider = provider;
	}
	
	
}
