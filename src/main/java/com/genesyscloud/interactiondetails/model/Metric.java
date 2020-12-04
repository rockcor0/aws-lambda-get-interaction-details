package com.genesyscloud.interactiondetails.model;

public class Metric {
	
	private String name;
	private int value;
	private String emitDate;
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the value
	 */
	public int getValue() {
		return value;
	}
	/**
	 * @param value the value to set
	 */
	public void setValue(int value) {
		this.value = value;
	}
	/**
	 * @return the emitDate
	 */
	public String getEmitDate() {
		return emitDate;
	}
	/**
	 * @param emitDate the emitDate to set
	 */
	public void setEmitDate(String emitDate) {
		this.emitDate = emitDate;
	}

	
}
