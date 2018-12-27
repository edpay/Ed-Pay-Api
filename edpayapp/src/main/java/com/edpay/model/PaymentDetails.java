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
@Table(name="ep_payment_deatails")
public class PaymentDetails {
	
	@Id
    @Column( name = "payment_id" )
    @GeneratedValue( strategy = GenerationType.IDENTITY )
	Long paymentId;
	
	@ManyToOne
	@JoinColumn(name = "institute_id" )
	Institutes instituteId;
	
	@ManyToOne
	@JoinColumn(name = "account_details_id" )
	AccountDetails accountDetailsId;
	
	@Column(name = "reference_number" )
	String referneceNumber;
	
	@Column(name = "payment_status" )
	String paymentStatus;

	@Column(name = "payment_date" )
	Date paymentDate;

	public Long getPaymentId() {
		return paymentId;
	}

	public void setPaymentId(Long paymentId) {
		this.paymentId = paymentId;
	}

	public Institutes getInstituteId() {
		return instituteId;
	}

	public void setInstituteId(Institutes instituteId) {
		this.instituteId = instituteId;
	}

	public AccountDetails getAccountDetailsId() {
		return accountDetailsId;
	}

	public void setAccountDetailsId(AccountDetails accountDetailsId) {
		this.accountDetailsId = accountDetailsId;
	}

	public String getReferneceNumber() {
		return referneceNumber;
	}

	public void setReferneceNumber(String referneceNumber) {
		this.referneceNumber = referneceNumber;
	}

	public String getPaymentStatus() {
		return paymentStatus;
	}

	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}

	public Date getPaymentDate() {
		return paymentDate;
	}

	public void setPaymentDate(Date paymentDate) {
		this.paymentDate = paymentDate;
	}

	@Override
	public String toString() {
		return "PaymentDetails [paymentId=" + paymentId + ", instituteId=" + instituteId + ", accountDetailsId="
				+ accountDetailsId + ", referneceNumber=" + referneceNumber + ", paymentStatus=" + paymentStatus
				+ ", paymentDate=" + paymentDate + "]";
	}
	

}
