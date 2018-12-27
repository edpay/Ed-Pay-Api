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
@Table(name="ep_subjects")
public class Subjects {
	
	@Id
    @Column( name = "subject_id" )
    @GeneratedValue( strategy = GenerationType.IDENTITY )
	Long subjectId;
	
	@ManyToOne
	@JoinColumn(name = "course_id")
	Courses courseId;
	
	@Column(name = "subject_name")
	String subjectName;

	public Long getSubjectId() {
		return subjectId;
	}

	public void setSubjectId(Long subjectId) {
		this.subjectId = subjectId;
	}

	public Courses getCourseId() {
		return courseId;
	}

	public void setCourseId(Courses courseId) {
		this.courseId = courseId;
	}

	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	@Override
	public String toString() {
		return "Subjects [subjectId=" + subjectId + ", courseId=" + courseId + ", subjectName=" + subjectName + "]";
	}
	
}
