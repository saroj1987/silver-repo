package com.travos.travos.src.travomodels;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "nearestEndpoint")
public class NearestEndpoint {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private Long id;
@NotNull
@Column(unique=true)
private String name;
@OneToOne
private Address address;
@NotNull
private float distance;
@ManyToOne(fetch = FetchType.LAZY)
@JoinColumn(name = "destId", referencedColumnName = "destId")
private Destination destination;
public NearestEndpoint() {
	super();
}
public Long getId() {
	return id;
}
public void setId(Long id) {
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
public float getDistance() {
	return distance;
}
public void setDistance(float distance) {
	this.distance = distance;
}
public Destination getDestination() {
	return destination;
}
public void setDestination(Destination destination) {
	this.destination = destination;
}

}
