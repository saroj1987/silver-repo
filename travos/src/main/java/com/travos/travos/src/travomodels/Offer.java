package com.travos.travos.src.travomodels;

import java.util.Date;

public class Offer {
	private String id;
	private String name;
	private String type;
	private Date validity;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	private String offer;
	private String detail;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Date getValidity() {
		return validity;
	}
	public void setValidity(Date validity) {
		this.validity = validity;
	}
	public Offer() {
		super();
	}
	public String getOffer() {
		return offer;
	}
	public void setOffer(String offer) {
		this.offer = offer;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}

}
