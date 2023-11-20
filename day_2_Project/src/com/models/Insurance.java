package com.models;

public class Insurance {
	public String insuranceType;
	public int premium;
	public String getInsuranceType() {
		return insuranceType;
	}
	public void setInsuranceType(String insuranceType) {
		this.insuranceType = insuranceType;
	}
	public int getPremium() {
		return premium;
	}
	public void setPremium(int premium) {
		this.premium = premium;
	}
	@Override
	public String toString() {
		return "Insurance [insuranceType=" + insuranceType + ", premium=" + premium + "]";
	}
	public Insurance(String insuranceType, int premium) {
		super();
		this.insuranceType = insuranceType;
		this.premium = premium;
	}
	public Insurance() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
