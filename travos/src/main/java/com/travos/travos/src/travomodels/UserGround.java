package com.travos.travos.src.travomodels;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "UserGround")
public class UserGround {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@NotNull
	private String name;
	@NotNull
	@Column(unique=true)
	private String email;
	@NotNull
	@Column(unique=true)
	private String phone;
	@NotNull
	private String paassword;
	@NotNull
	private boolean active;
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	private String photo;
	
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public UserGround() {
		super();
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public String getPaassword() {
		return paassword;
	}
	public void setPaassword(String paassword) {
		this.paassword = paassword;
	}
	@Override
	public String toString() {
		return "UserGround [id=" + id + ", name=" + name + ", email=" + email
				+ ", phone=" + phone + ", paassword=" + paassword + ", active="
				+ active + ", photo=" + photo + "]";
	}

}
