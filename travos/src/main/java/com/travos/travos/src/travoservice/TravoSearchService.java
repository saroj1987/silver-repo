package com.travos.travos.src.travoservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.travos.travos.src.travodao.AddressDao;
import com.travos.travos.src.travodao.DestinationDao;
import com.travos.travos.src.travodao.SiteDao;
import com.travos.travos.src.travomodels.Address;
import com.travos.travos.src.travomodels.Destination;
import com.travos.travos.src.travomodels.Site;

@Service
public class TravoSearchService {
	
	@Autowired
	DestinationDao search;
	@Autowired
	AddressDao searchAddress;
	@Autowired
	SiteDao siteSearch;
	
	public List<Destination> findByName(String name){
		List<Destination> destinationList = search.findByName(name);
		return destinationList;
	}
	
	public List<Destination> findByState(String name){
		List<Destination> addressList = searchAddress.findByState(name);
		return addressList;
	}
	
	public List<Destination> findByCity(String name){
		List<Destination> addressList = searchAddress.findByCity(name);
		return addressList;
	}
	
	public List<Destination> findByCountry(String name){
		List<Destination> addressList = searchAddress.findByCountry(name);
		return addressList;
	}
	
	public List<Address> findAllAddress(){
		List<Address> addressList = searchAddress.findAll();
		return addressList;
	}
	
	public Site findBySite(String name){
		Site site = siteSearch.findByName(name);
		return site;
	}

}
