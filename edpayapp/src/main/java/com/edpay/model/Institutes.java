package com.edpay.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="ep_institutes")
public class Institutes {
	
	@Id
    @Column( name = "institute_id" )
    @GeneratedValue( strategy = GenerationType.IDENTITY )
	Long instituteId;
	
	@Column( name = "institute_name" )
	String instituteName;
	
	@Column( name = "contact_number" )
	String contactNumber;
	
	@Column(name = "description")
	String description;
	
	@Column(name = "address")
	String address;
	
	@Column(name = "email_id")
	String emailId;
	
	@Column(name = "website_link")
	String websiteLink;
	
	@Column(name = "image_link")
	String imageLink;
	
	@ManyToOne
	@JoinColumn(name="region_id")
	 Region regionId;
	
//	@ManyToOne
//	@JoinColumn(name = "accountDetails_id")
//	AccountDetails accountDetailsId;

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

	public Region getRegionId() {
		return regionId;
	}

	public void setRegionId(Region regionId) {
		this.regionId = regionId;
	}



	@Override
	public String toString() {
		return "Institutes [instituteId=" + instituteId + ", instituteName=" + instituteName + ", contactNumber="
				+ contactNumber + ", description=" + description + ", address=" + address + ", emailId=" + emailId
				+ ", websiteLink=" + websiteLink + ", imageLink=" + imageLink + ", regionId=" + regionId
				+ ", accountDetailsId=" + "]";
	}

}
