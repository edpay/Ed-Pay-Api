package com.edpay.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ep_status")
public class Status {
	
	@Id
    @Column( name = "status_id" )
    @GeneratedValue( strategy = GenerationType.IDENTITY )
	Long statusId;
	
	@Column( name = "status_name" )
	String statusName;
	
	@Column( name = "status_message" )
	String statusMessage;
	
	@Column( name = "status_email_message" )
	String statusEmailMessage;

	public Long getStatusId() {
		return statusId;
	}

	public void setStatusId(Long statusId) {
		this.statusId = statusId;
	}

	public String getStatusName() {
		return statusName;
	}

	public void setStatusName(String statusName) {
		this.statusName = statusName;
	}

	public String getStatusMessage() {
		return statusMessage;
	}

	public void setStatusMessage(String statusMessage) {
		this.statusMessage = statusMessage;
	}

	public String getStatusEmailMessage() {
		return statusEmailMessage;
	}

	public void setStatusEmailMessage(String statusEmailMessage) {
		this.statusEmailMessage = statusEmailMessage;
	}

	@Override
	public String toString() {
		return "Status [statusId=" + statusId + ", statusName=" + statusName + ", statusMessage=" + statusMessage
				+ ", statusEmailMessage=" + statusEmailMessage + "]";
	}
	
	

}
