package com.genesyscloud.interactiondetails.model;

import java.util.List;

public class Flow {
	
	private String flowId;
	private String flowName;
	private String flowVersion;
	private String flowType;
	private String exitReason;
	private String entryReason;
	private String entryType;
	private String transferType;
	private String transferTargetAddress;
	private boolean issuedCallback;
	private String startingLanguage;
	private String endingLanguage;
	private List<Outcome> outcomes;
	
	
	
	/**
	 * @return the outcomes
	 */
	public List<Outcome> getOutcomes() {
		return outcomes;
	}
	/**
	 * @param outcomes the outcomes to set
	 */
	public void setOutcomes(List<Outcome> outcomes) {
		this.outcomes = outcomes;
	}
	/**
	 * @return the flowId
	 */
	public String getFlowId() {
		return flowId;
	}
	/**
	 * @param flowId the flowId to set
	 */
	public void setFlowId(String flowId) {
		this.flowId = flowId;
	}
	/**
	 * @return the flowName
	 */
	public String getFlowName() {
		return flowName;
	}
	/**
	 * @param flowName the flowName to set
	 */
	public void setFlowName(String flowName) {
		this.flowName = flowName;
	}
	/**
	 * @return the flowVersion
	 */
	public String getFlowVersion() {
		return flowVersion;
	}
	/**
	 * @param flowVersion the flowVersion to set
	 */
	public void setFlowVersion(String flowVersion) {
		this.flowVersion = flowVersion;
	}
	/**
	 * @return the flowType
	 */
	public String getFlowType() {
		return flowType;
	}
	/**
	 * @param flowType the flowType to set
	 */
	public void setFlowType(String flowType) {
		this.flowType = flowType;
	}
	/**
	 * @return the exitReason
	 */
	public String getExitReason() {
		return exitReason;
	}
	/**
	 * @param exitReason the exitReason to set
	 */
	public void setExitReason(String exitReason) {
		this.exitReason = exitReason;
	}
	/**
	 * @return the entryReason
	 */
	public String getEntryReason() {
		return entryReason;
	}
	/**
	 * @param entryReason the entryReason to set
	 */
	public void setEntryReason(String entryReason) {
		this.entryReason = entryReason;
	}
	/**
	 * @return the entryType
	 */
	public String getEntryType() {
		return entryType;
	}
	/**
	 * @param entryType the entryType to set
	 */
	public void setEntryType(String entryType) {
		this.entryType = entryType;
	}
	/**
	 * @return the transferType
	 */
	public String getTransferType() {
		return transferType;
	}
	/**
	 * @param transferType the transferType to set
	 */
	public void setTransferType(String transferType) {
		this.transferType = transferType;
	}
	/**
	 * @return the transferTargetAddress
	 */
	public String getTransferTargetAddress() {
		return transferTargetAddress;
	}
	/**
	 * @param transferTargetAddress the transferTargetAddress to set
	 */
	public void setTransferTargetAddress(String transferTargetAddress) {
		this.transferTargetAddress = transferTargetAddress;
	}
	/**
	 * @return the issuedCallback
	 */
	public boolean isIssuedCallback() {
		return issuedCallback;
	}
	/**
	 * @param issuedCallback the issuedCallback to set
	 */
	public void setIssuedCallback(boolean issuedCallback) {
		this.issuedCallback = issuedCallback;
	}
	/**
	 * @return the startingLanguage
	 */
	public String getStartingLanguage() {
		return startingLanguage;
	}
	/**
	 * @param startingLanguage the startingLanguage to set
	 */
	public void setStartingLanguage(String startingLanguage) {
		this.startingLanguage = startingLanguage;
	}
	/**
	 * @return the endingLanguage
	 */
	public String getEndingLanguage() {
		return endingLanguage;
	}
	/**
	 * @param endingLanguage the endingLanguage to set
	 */
	public void setEndingLanguage(String endingLanguage) {
		this.endingLanguage = endingLanguage;
	}
	
	
}
