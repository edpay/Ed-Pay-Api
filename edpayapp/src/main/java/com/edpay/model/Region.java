package com.edpay.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ep_region")
public class Region {
	
	@Id
    @Column( name = "region_id" )
    @GeneratedValue( strategy = GenerationType.IDENTITY )
	Long regionId;
	
	@Column( name = "state" )
	String state;
	
	@Column( name = "city" )
	String city;

	public Long getRegionId() {
		return regionId;
	}

	public void setRegionId(Long regionId) {
		this.regionId = regionId;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Region [regionId=" + regionId + ", state=" + state + ", city=" + city + "]";
	}
	
}
