package com.edpay.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.edpay.model.Institutes;

@Entity
@Table(name="ep_accountDetails")
public class AccountDetails {
	
	@Id
    @Column( name = "accountDetails_id" )
    @GeneratedValue( strategy = GenerationType.IDENTITY )
	Long accountDetailsId;
	
	@ManyToOne
	@JoinColumn(name="institution_id")
	Institutes institutionId;
	
	@Column( name = "account_number" )
	String accountNumber;
	
	@Column( name = "ifsc_code" )
	String ifscCode;

	@Column( name = "branch" )
	String branch;

	public Long getAccountDetailsId() {
		return accountDetailsId;
	}

	public void setAccountDetailsId(Long accountDetailsId) {
		this.accountDetailsId = accountDetailsId;
	}

	public Institutes getInstitutionId() {
		return institutionId;
	}

	public void setInstitutionId(Institutes institutionId) {
		this.institutionId = institutionId;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getIfscCode() {
		return ifscCode;
	}

	public void setIfscCode(String ifscCode) {
		this.ifscCode = ifscCode;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	@Override
	public String toString() {
		return "AccountDetails [accountDetailsId=" + accountDetailsId + ", institutionId=" + institutionId
				+ ", accountNumber=" + accountNumber + ", ifscCode=" + ifscCode + ", branch=" + branch + "]";
	}
	
	
	
}
