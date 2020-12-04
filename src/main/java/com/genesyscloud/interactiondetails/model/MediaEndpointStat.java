package com.genesyscloud.interactiondetails.model;

public class MediaEndpointStat {

	private String[] codecs;
	private double minMos;
	private double minRFactor;
	private int maxLatencyMs;
	private int receivedPackets;
	
	/**
	 * @return the codecs
	 */
	public String[] getCodecs() {
		return codecs;
	}
	/**
	 * @param codecs the codecs to set
	 */
	public void setCodecs(String[] codecs) {
		this.codecs = codecs;
	}
	/**
	 * @return the minMos
	 */
	public double getMinMos() {
		return minMos;
	}
	/**
	 * @param minMos the minMos to set
	 */
	public void setMinMos(double minMos) {
		this.minMos = minMos;
	}
	/**
	 * @return the minRFactor
	 */
	public double getMinRFactor() {
		return minRFactor;
	}
	/**
	 * @param minRFactor the minRFactor to set
	 */
	public void setMinRFactor(double minRFactor) {
		this.minRFactor = minRFactor;
	}
	/**
	 * @return the maxLatencyMs
	 */
	public int getMaxLatencyMs() {
		return maxLatencyMs;
	}
	/**
	 * @param maxLatencyMs the maxLatencyMs to set
	 */
	public void setMaxLatencyMs(int maxLatencyMs) {
		this.maxLatencyMs = maxLatencyMs;
	}
	/**
	 * @return the receivedPackets
	 */
	public int getReceivedPackets() {
		return receivedPackets;
	}
	/**
	 * @param receivedPackets the receivedPackets to set
	 */
	public void setReceivedPackets(int receivedPackets) {
		this.receivedPackets = receivedPackets;
	}
	
	
}
