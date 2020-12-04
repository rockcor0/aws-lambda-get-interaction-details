/**
 * 
 */
package com.genesyscloud.interactiondetails.services.vo;

import java.util.List;

import com.genesyscloud.interactiondetails.model.Address;
import com.genesyscloud.interactiondetails.model.Chat;
import com.genesyscloud.interactiondetails.model.Division;
import com.genesyscloud.interactiondetails.model.PrimaryContactInfo;

/**
 * @author RicardoDelgado
 *
 */
public class VOGetUser {
	
	private String id;
	private String name;
	private Division division;
	private Chat chat;
	private String department;
	private String email;
	private List<PrimaryContactInfo> primaryContactInfo;
	private List<Address> addresses;
	private String state;
	private String title;
	private String username;
	private int version;
	private boolean acdAutoAnswer;
	private String selfUri;
	
	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}
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
	 * @return the division
	 */
	public Division getDivision() {
		return division;
	}
	/**
	 * @param division the division to set
	 */
	public void setDivision(Division division) {
		this.division = division;
	}
	/**
	 * @return the chat
	 */
	public Chat getChat() {
		return chat;
	}
	/**
	 * @param chat the chat to set
	 */
	public void setChat(Chat chat) {
		this.chat = chat;
	}
	/**
	 * @return the department
	 */
	public String getDepartment() {
		return department;
	}
	/**
	 * @param department the department to set
	 */
	public void setDepartment(String department) {
		this.department = department;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return the primaryContactInfo
	 */
	public List<PrimaryContactInfo> getPrimaryContactInfo() {
		return primaryContactInfo;
	}
	/**
	 * @param primaryContactInfo the primaryContactInfo to set
	 */
	public void setPrimaryContactInfo(List<PrimaryContactInfo> primaryContactInfo) {
		this.primaryContactInfo = primaryContactInfo;
	}
	/**
	 * @return the addresses
	 */
	public List<Address> getAddresses() {
		return addresses;
	}
	/**
	 * @param addresses the addresses to set
	 */
	public void setAddresses(List<Address> addresses) {
		this.addresses = addresses;
	}
	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}
	/**
	 * @param state the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}
	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}
	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}
	/**
	 * @return the version
	 */
	public int getVersion() {
		return version;
	}
	/**
	 * @param version the version to set
	 */
	public void setVersion(int version) {
		this.version = version;
	}
	/**
	 * @return the acdAutoAnswer
	 */
	public boolean isAcdAutoAnswer() {
		return acdAutoAnswer;
	}
	/**
	 * @param acdAutoAnswer the acdAutoAnswer to set
	 */
	public void setAcdAutoAnswer(boolean acdAutoAnswer) {
		this.acdAutoAnswer = acdAutoAnswer;
	}
	/**
	 * @return the selfUri
	 */
	public String getSelfUri() {
		return selfUri;
	}
	/**
	 * @param selfUri the selfUri to set
	 */
	public void setSelfUri(String selfUri) {
		this.selfUri = selfUri;
	}

	
}
