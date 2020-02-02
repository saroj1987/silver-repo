package com.travos.travos.src.travomodels;

import java.util.Date;
import java.util.List;
import java.util.Map;

public class Trip {

	private String id; 
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
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public List<Destination> getDestinations() {
		return destinations;
	}
	public void setDestinations(List<Destination> destinations) {
		this.destinations = destinations;
	}
	public Map<Destination, TripTransport> getTransportMap() {
		return transportMap;
	}
	public void setTransportMap(Map<Destination, TripTransport> transportMap) {
		this.transportMap = transportMap;
	}
	public Map<AdventureSpot, Destination> getAdventureMap() {
		return adventureMap;
	}
	public void setAdventureMap(Map<AdventureSpot, Destination> adventureMap) {
		this.adventureMap = adventureMap;
	}
	public Map<Destination, Float> getDuration() {
		return duration;
	}
	public void setDuration(Map<Destination, Float> duration) {
		this.duration = duration;
	}
	public Map<Destination, Hotel> getHotelMap() {
		return hotelMap;
	}
	public void setHotelMap(Map<Destination, Hotel> hotelMap) {
		this.hotelMap = hotelMap;
	}
	public UserGround getUser() {
		return userModel;
	}
	public void setUser(UserGround userModel) {
		this.userModel = userModel;
	}
	public List<Tourist> getTourist() {
		return tourist;
	}
	public void setTourist(List<Tourist> tourist) {
		this.tourist = tourist;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public Offer getOffer() {
		return offer;
	}
	public void setOffer(Offer offer) {
		this.offer = offer;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	private String name;
	private String type;
	private List<Destination> destinations;
	private Map<Destination, TripTransport> transportMap;
	private Map<AdventureSpot, Destination> adventureMap;
	private Map<Activity, Destination> activityMap;
	public Map<Activity, Destination> getActivityMap() {
		return activityMap;
	}
	public void setActivityMap(Map<Activity, Destination> activityMap) {
		this.activityMap = activityMap;
	}
	private Map<Destination, Float> duration;
	private Map<Destination, Hotel> hotelMap;
	private Map<Destination, Agency> AgencyMap;
	private Map<Destination, Person> pocMap;
	public Map<Destination, Agency> getAgencyMap() {
		return AgencyMap;
	}
	public void setAgencyMap(Map<Destination, Agency> agencyMap) {
		AgencyMap = agencyMap;
	}
	public Map<Destination, Person> getPocMap() {
		return pocMap;
	}
	public void setPocMap(Map<Destination, Person> pocMap) {
		this.pocMap = pocMap;
	}
	private UserGround userModel;
	private List<Tourist> tourist;
	private float price;
	private Offer offer;
	private String status;
	private Date startDate;
	private float totalDuration;
	public Trip() {
		super();
	}
	public float getTotalDuration() {
		return totalDuration;
	}
	public void setTotalDuration(float totalDuration) {
		this.totalDuration = totalDuration;
	}

}
