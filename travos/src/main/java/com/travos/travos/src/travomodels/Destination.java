package com.travos.travos.src.travomodels;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "destination")
public class Destination {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long destId;
	@NotNull
	@Column(unique=true)
	private String name;
	@NotNull
	private String description;
	@OneToMany(targetEntity=NearestEndpoint.class, mappedBy="destination",cascade=CascadeType.ALL, fetch = FetchType.LAZY)
	private List<NearestEndpoint> nearestEndpoint = new ArrayList<NearestEndpoint>();
	@OneToMany(targetEntity=Site.class, mappedBy="destination",cascade=CascadeType.ALL, fetch = FetchType.LAZY)
	private List<Site> sites = new ArrayList<Site>();
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "address_id", referencedColumnName = "id")
	private Address address;
	private List<Destination> nearestDestination = new ArrayList<Destination>();
	@OneToMany(targetEntity=AdventureSpot.class, mappedBy="destination",cascade=CascadeType.ALL, fetch = FetchType.LAZY)
	private List<AdventureSpot> adventures = new ArrayList<AdventureSpot>();
	@OneToMany(targetEntity=Activity.class, mappedBy="destination",cascade=CascadeType.ALL, fetch = FetchType.LAZY)
	private List<Activity> activities = new ArrayList<Activity>();
	@NotNull
	private float basePrice;
	@NotNull
	private String photo;
	@NotNull
	private float duration;
	@NotNull
	private int rating;
	@NotNull
	private String bestTime;
	
	public Destination() {
		super();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	public List<NearestEndpoint> getNearestEndpoint() {
		return nearestEndpoint;
	}
	public void setNearestEndpoint(List<NearestEndpoint> nearestEndpoint) {
		for(NearestEndpoint endpoint : nearestEndpoint){
			setEndpointReference(this, endpoint);
		}
		this.getNearestEndpoint().addAll(nearestEndpoint);
	}
	public List<Site> getSites() {
		return sites;
	}
	public void setSites(List<Site> sites) {
		for(Site site : sites){
			setSiteReference(this, site);
		}
		this.getSites().addAll(sites);
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
		address.setDestination(this);
	}
	public List<Destination> getNearestDestination() {
		return nearestDestination;
	}
	public void setNearestDestination(List<Destination> nearestDestination) {
		for(Destination dest : nearestDestination){
			dest.getNearestDestination().add(this);
		}
		this.getNearestDestination().addAll(nearestDestination);
	}
	public List<AdventureSpot> getAdventures() {
		return adventures;
	}
	public void setAdventures(List<AdventureSpot> adventures) {
		for(AdventureSpot adventure : adventures){
			setAdventureReference(this, adventure);
		}
		this.getAdventures().addAll(adventures);
	}
	public float getBasePrice() {
		return basePrice;
	}
	public void setBasePrice(float basePrice) {
		this.basePrice = basePrice;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public float getDuration() {
		return duration;
	}
	public void setDuration(float duration) {
		this.duration = duration;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public String getBestTime() {
		return bestTime;
	}
	public void setBestTime(String bestTime) {
		this.bestTime = bestTime;
	}
	public Long getDestId() {
		return destId;
	}
	public List<Activity> getActivities() {
		return activities;
	}
	public void setActivities(List<Activity> activities) {
		for(Activity activity : activities){
			setActivityReference(this, activity);
		}
		this.getActivities().addAll(activities);
	}
	public void setSiteReference(Destination destination, Site instance){
		instance.setDestination(destination);
	}
	public void setEndpointReference(Destination destination, NearestEndpoint instance){
		instance.setDestination(destination);
	}
	public void setActivityReference(Destination destination, Activity instance){
		instance.setDestination(destination);
	}
	public void setAdventureReference(Destination destination, AdventureSpot instance){
		instance.setDestination(destination);
	}
	
}
