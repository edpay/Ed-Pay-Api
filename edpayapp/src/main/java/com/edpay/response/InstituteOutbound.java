package com.edpay.response;

public class InstituteOutbound {
	
	Long instituteId;
	
	String instituteName;
	
	String contactNumber;
	
	String description;
	
	String address;
	
	String emailId;
	
	String websiteLink;
	
	String imageLink;

	public Long getInstituteId() {
		return instituteId;
	}

	public void setInstituteId(Long instituteId) {
		this.instituteId = instituteId;
	}

	public String getInstituteName() {
		return instituteName;
	}

	public void setInstituteName(String instituteName) {
		this.instituteName = instituteName;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getWebsiteLink() {
		return websiteLink;
	}

	public void setWebsiteLink(String websiteLink) {
		this.websiteLink = websiteLink;
	}

	public String getImageLink() {
		return imageLink;
	}

	public void setImageLink(String imageLink) {
		this.imageLink = imageLink;
	}

	@Override
	public String toString() {
		return "InstituteOutbound [instituteId=" + instituteId + ", instituteName=" + instituteName + ", contactNumber="
				+ contactNumber + ", description=" + description + ", address=" + address + ", emailId=" + emailId
				+ ", websiteLink=" + websiteLink + ", imageLink=" + imageLink + "]";
	}
	
	

}
