package com.edpay.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ep_courses")
public class Courses {
	
	@Id
    @Column( name = "course_id" )
    @GeneratedValue( strategy = GenerationType.IDENTITY )
	Long coursesId;
	
	@Column( name = "course_name" )
	String coursesName;
	
	@Column( name = "course_description" )
	String coursesDescription;

	public Long getCoursesId() {
		return coursesId;
	}

	public void setCoursesId(Long coursesId) {
		this.coursesId = coursesId;
	}

	public String getCoursesName() {
		return coursesName;
	}

	public void setCoursesName(String coursesName) {
		this.coursesName = coursesName;
	}

	public String getCoursesDescription() {
		return coursesDescription;
	}

	public void setCoursesDescription(String coursesDescription) {
		this.coursesDescription = coursesDescription;
	}

	@Override
	public String toString() {
		return "Courses [coursesId=" + coursesId + ", coursesName=" + coursesName + ", coursesDescription="
				+ coursesDescription + "]";
	}
	
	
}
