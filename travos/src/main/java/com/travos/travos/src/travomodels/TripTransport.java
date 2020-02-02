package com.travos.travos.src.travomodels;

import java.util.Date;

public class TripTransport {
	private String id;
	private Date reachTime;
	private Transport toTransport;
	private Transport fromTransport;
	public TripTransport() {
		super();
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Date getReachTime() {
		return reachTime;
	}
	public void setReachTime(Date reachTime) {
		this.reachTime = reachTime;
	}
	public Transport getToTransport() {
		return toTransport;
	}
	public void setToTransport(Transport toTransport) {
		this.toTransport = toTransport;
	}
	public Transport getFromTransport() {
		return fromTransport;
	}
	public void setFromTransport(Transport fromTransport) {
		this.fromTransport = fromTransport;
	}
	public Transport getSiteTransport() {
		return siteTransport;
	}
	public void setSiteTransport(Transport siteTransport) {
		this.siteTransport = siteTransport;
	}
	public Date getLeaveTime() {
		return leaveTime;
	}
	public void setLeaveTime(Date leaveTime) {
		this.leaveTime = leaveTime;
	}
	public NearestEndpoint getNearestEndpoint() {
		return nearestEndpoint;
	}
	public void setNearestEndpoint(NearestEndpoint nearestEndpoint) {
		this.nearestEndpoint = nearestEndpoint;
	}
	public Address getFirstReach() {
		return firstReach;
	}
	public void setFirstReach(Address firstReach) {
		this.firstReach = firstReach;
	}
	private Transport siteTransport;
	private Date leaveTime;
	private NearestEndpoint	nearestEndpoint;
	private Address firstReach;

}
