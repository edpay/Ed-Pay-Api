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
@Table(name="ep_applications")
public class Applications {
	
	
	@Id
    @Column( name = "application_id" )
    @GeneratedValue( strategy = GenerationType.IDENTITY )
	Long applicationId;
	
	@ManyToOne
	@JoinColumn( name = "institute_id" )
	Institutes instituteId;
	
	@ManyToOne
	@JoinColumn( name = "course_id" )
	Courses courseId;
	
	@Column( name = "percentage" )
	String percentage;
	
	@Column( name = "created_date" )
	Long createdDate;
	
	@Column( name = "first_name" )
	String firstName;
	
	@Column( name = "middle_name" )
	String middleName;
	
	@Column( name = "last_name" )
	String lastName;
	
	@Column( name = "email_id" )
	String emailId;
	
	@Column( name = "category" )
	String category;
	
	@Column( name = "phone_number" )
	String phoneNumber;
	
	@Column( name = "date_of_birth" )
	Date dateOfBirth;
	
	@Column( name = "passout_year" )
	Date passoutYear;
	
	@Column( name = "medium_of_study" )
	String mediumOfStudy;
	
	@Column( name = "gender" )
	String gender;
	
	@Column( name = "sub_caste" )
	String subCaste;
	
	@Column( name = "student_address" )
	String StudentAddress;
	
	@Column( name = "previous_school_name" )
	String previousSchoolName;
	
	@Column( name = "previous_school_Address" )
	String previousSchoolAddress;
	
	@Column( name = "gaurdian_name" )
	String gaurdianName;
	
	@Column( name = "gaurdian_annual_income" )
	String gaurdianAnnualIncome;
	
	@Column( name = "exam_register_number" )
	String examRegisterNumber;
	
	@Column( name = "sports_quota" )
	Boolean sportsQuota;
	
	@Column( name = "submitted_date" )
	Boolean submittedDate;
	
	@ManyToOne
	@JoinColumn( name = "status_id" )
	Status StatusId;



	public Long getApplicationId() {
		return applicationId;
	}

	public void setApplicationId(Long applicationId) {
		this.applicationId = applicationId;
	}

	public Institutes getInstituteId() {
		return instituteId;
	}

	public void setInstituteId(Institutes instituteId) {
		this.instituteId = instituteId;
	}

	public Courses getCourseId() {
		return courseId;
	}

	public void setCourseId(Courses courseId) {
		this.courseId = courseId;
	}

	public String getPercentage() {
		return percentage;
	}

	public void setPercentage(String percentage) {
		this.percentage = percentage;
	}

	public Long getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Long createdDate) {
		this.createdDate = createdDate;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public Date getPassoutYear() {
		return passoutYear;
	}

	public void setPassoutYear(Date passoutYear) {
		this.passoutYear = passoutYear;
	}

	public String getMediumOfStudy() {
		return mediumOfStudy;
	}

	public void setMediumOfStudy(String mediumOfStudy) {
		this.mediumOfStudy = mediumOfStudy;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getSubCaste() {
		return subCaste;
	}

	public void setSubCaste(String subCaste) {
		this.subCaste = subCaste;
	}

	public String getStudentAddress() {
		return StudentAddress;
	}

	public void setStudentAddress(String studentAddress) {
		StudentAddress = studentAddress;
	}

	public String getPreviousSchoolName() {
		return previousSchoolName;
	}

	public void setPreviousSchoolName(String previousSchoolName) {
		this.previousSchoolName = previousSchoolName;
	}

	public String getPreviousSchoolAddress() {
		return previousSchoolAddress;
	}

	public void setPreviousSchoolAddress(String previousSchoolAddress) {
		this.previousSchoolAddress = previousSchoolAddress;
	}

	public String getGaurdianName() {
		return gaurdianName;
	}

	public void setGaurdianName(String gaurdianName) {
		this.gaurdianName = gaurdianName;
	}

	public String getGaurdianAnnualIncome() {
		return gaurdianAnnualIncome;
	}

	public void setGaurdianAnnualIncome(String gaurdianAnnualIncome) {
		this.gaurdianAnnualIncome = gaurdianAnnualIncome;
	}

	public String getExamRegisterNumber() {
		return examRegisterNumber;
	}

	public void setExamRegisterNumber(String examRegisterNumber) {
		this.examRegisterNumber = examRegisterNumber;
	}

	public Boolean getSportsQuota() {
		return sportsQuota;
	}

	public void setSportsQuota(Boolean sportsQuota) {
		this.sportsQuota = sportsQuota;
	}

	public Boolean getSubmittedDate() {
		return submittedDate;
	}

	public void setSubmittedDate(Boolean submittedDate) {
		this.submittedDate = submittedDate;
	}

	public Status getStatusId() {
		return StatusId;
	}

	public void setStatusId(Status statusId) {
		StatusId = statusId;
	}

	@Override
	public String toString() {
		return "Applications [applicationId=" + applicationId + ", instituteId=" + instituteId + ", courseId="
				+ courseId + ", percentage=" + percentage + ", createdDate=" + createdDate + ", firstName=" + firstName
				+ ", middleName=" + middleName + ", lastName=" + lastName + ", emailId=" + emailId + ", category="
				+ category + ", phoneNumber=" + phoneNumber + ", dateOfBirth=" + dateOfBirth + ", passoutYear="
				+ passoutYear + ", mediumOfStudy=" + mediumOfStudy + ", gender=" + gender + ", subCaste=" + subCaste
				+ ", StudentAddress=" + StudentAddress + ", previousSchoolName=" + previousSchoolName
				+ ", previousSchoolAddress=" + previousSchoolAddress + ", gaurdianName=" + gaurdianName
				+ ", gaurdianAnnualIncome=" + gaurdianAnnualIncome + ", examRegisterNumber=" + examRegisterNumber
				+ ", sportsQuota=" + sportsQuota + ", submittedDate=" + submittedDate + ", StatusId=" + StatusId + "]";
	}



	}
