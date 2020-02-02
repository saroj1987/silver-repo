package com.travos.travos.src.travomodels;

public class Driver {
	private String id;
	public Driver() {
		super();
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	public String getLicense() {
		return license;
	}
	public void setLicense(String license) {
		this.license = license;
	}
	
	private String license;
	private Person driver;
	public Person getDriver() {
		return driver;
	}
	public void setDriver(Person driver) {
		this.driver = driver;
	}
	

}
