package com.travos.travos.src.travomodels;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "Agency")
public class Agency {
	@Id
	private String id;
	@NotNull
	private String name;
	@NotNull
	@Column(unique = true)
	private String regNumber;
	@OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
	private Address address;
	private String type;
	@OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "accountNumber")
	private Account account;
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "owner", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Person> owner;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Agency() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRegNumber() {
		return regNumber;
	}

	public void setRegNumber(String regNumber) {
		this.regNumber = regNumber;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public List<Person> getOwner() {
		return owner;
	}

	public void setOwner(List<Person> owner) {
		this.owner = owner;
	}

}
