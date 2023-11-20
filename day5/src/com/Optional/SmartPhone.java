package com.Optional;

import java.util.Optional;

public class SmartPhone {

	private long id;
	private String brandName;
	private String name;
	private Optional<DisplayFeatures> df;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Optional<DisplayFeatures> getDf() {
		return df;
	}

	public void setDf(Optional<DisplayFeatures> df) {
		this.df = df;
	}

	@Override
	public String toString() {
		return "SmartPhone [id=" + id + ", brandName=" + brandName + ", name=" + name + ", df=" + df + "]";
	}

	public SmartPhone(long id, String brandName, String name, Optional<DisplayFeatures> df) {
		super();
		this.id = id;
		this.brandName = brandName;
		this.name = name;
		this.df = df;
	}

}
