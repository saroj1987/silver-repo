package com.travos.travos.src.travomodels;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "adventureSpot")
public class AdventureSpot {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@NotNull
	@Column(unique=true)
	private String name;
	@NotNull
	private String type;
	@NotNull
	private float adventureDuration;
	@NotNull
	private float price;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "destId", referencedColumnName = "destId")
	private Destination destination;
	@NotNull
	private float rating;
	public float getRating() {
		return rating;
	}
	public void setRating(float rating) {
		this.rating = rating;
	}
	private String bestTime;
	public AdventureSpot() {
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
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public float getAdventureDuration() {
		return adventureDuration;
	}
	public void setAdventureDuration(float adventureDuration) {
		this.adventureDuration = adventureDuration;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public String getBestTime() {
		return bestTime;
	}
	public void setBestTime(String bestTime) {
		this.bestTime = bestTime;
	}
	public Destination getDestination() {
		return destination;
	}
	public void setDestination(Destination destination) {
		this.destination = destination;
	}
	

}
