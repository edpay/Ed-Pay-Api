package com.edpay.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="ep_application_expiry_deatails")
public class ApplicationExpiryDetails {
	
	@Id
    @Column( name = "application_expiry_deatails_id" )
    @GeneratedValue( strategy = GenerationType.IDENTITY )
	Long applicationExpiryDeatailsId;
	
	@ManyToOne
	@JoinColumn( name = "institute_id" )
	Institutes instituteId;
	
	@ManyToOne
	@JoinColumn( name = "courses_id" )
	Courses coursesId;
	
	@Column( name = "expiry_date" )
	Date expiryDate;

	public Long getApplicationExpiryDeatailsId() {
		return applicationExpiryDeatailsId;
	}

	public void setApplicationExpiryDeatailsId(Long applicationExpiryDeatailsId) {
		this.applicationExpiryDeatailsId = applicationExpiryDeatailsId;
	}

	public Institutes getInstituteId() {
		return instituteId;
	}

	public void setInstituteId(Institutes instituteId) {
		this.instituteId = instituteId;
	}

	public Courses getCoursesId() {
		return coursesId;
	}

	public void setCoursesId(Courses coursesId) {
		this.coursesId = coursesId;
	}

	public Date getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}

	@Override
	public String toString() {
		return "ApplicationExpiryDetails [applicationExpiryDeatailsId=" + applicationExpiryDeatailsId + ", instituteId="
				+ instituteId + ", coursesId=" + coursesId + ", expiryDate=" + expiryDate + "]";
	}
	
	
	
	

}
