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
@Table(name="ep_marks")
public class Marks {

	@Id
    @Column( name = "marks_id" )
    @GeneratedValue( strategy = GenerationType.IDENTITY )
	Long marksId;
	
	@ManyToOne
	@JoinColumn(name = "subject_id")
	Subjects SubjectId;
	
	@Column(name = "marks")
	String marks;

	public Long getMarksId() {
		return marksId;
	}

	public void setMarksId(Long marksId) {
		this.marksId = marksId;
	}

	public Subjects getSubjectId() {
		return SubjectId;
	}

	public void setSubjectId(Subjects subjectId) {
		SubjectId = subjectId;
	}

	public String getMarks() {
		return marks;
	}

	public void setMarks(String marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Marks [marksId=" + marksId + ", SubjectId=" + SubjectId + ", marks=" + marks + "]";
	}
	
	
}
