package com.travos.travos.src.travomodels;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "Person")
public class Person {
	@Id
	private String id;
	@NotNull
	private String name;
	@OneToOne
	@NotNull
	private Address address;
	@NotNull
	@Column(unique = true)
	private String govtId;
	@NotNull
	private String idType;
	@NotNull
	private String photo;
	@NotNull
	private String idPhoto;
	@ManyToOne(fetch = FetchType.LAZY)
	private Agency owner;
	public Agency getOwner() {
		return owner;
	}
	public void setOwner(Agency owner) {
		this.owner = owner;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public String getGovtId() {
		return govtId;
	}
	public void setGovtId(String govtId) {
		this.govtId = govtId;
	}
	public String getIdType() {
		return idType;
	}
	public void setIdType(String idType) {
		this.idType = idType;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public String getIdPhoto() {
		return idPhoto;
	}
	public void setIdPhoto(String idPhoto) {
		this.idPhoto = idPhoto;
	}
	
}
