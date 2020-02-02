package com.travos.travos.src.travocontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.travos.travos.src.travomodels.Destination;
import com.travos.travos.src.travomodels.Site;
import com.travos.travos.src.travoservice.TravoSearchService;

@RestController
@RequestMapping("/search")
public class TravoSearchController {
	
	@Autowired
	TravoSearchService travoSearchService;
	List<Destination> destinations;
	
	@RequestMapping(value="/searchByPlace", method=RequestMethod.GET, produces={"application/json","application/xml"})
	public List<Destination> searchPlace(@RequestParam String name){
		destinations = travoSearchService.findByName(name);
		return destinations;
	}

	@RequestMapping(value="/searchSite", method=RequestMethod.GET, produces={"application/json","application/xml"})
	public Site searchSite(@RequestParam String name){
		Site site = null;
		site = travoSearchService.findBySite(name);
		return site;
	}
	
	@RequestMapping(value="/searchByCountry", method=RequestMethod.GET, produces={"application/json","application/xml"})
	public List<Destination> searchCountry(@RequestParam String name){
		destinations = travoSearchService.findByCountry(name);
		return destinations;
	}
	
	@RequestMapping(value="/searchByCity", method=RequestMethod.GET, produces={"application/json","application/xml"})
	public List<Destination> searchCity(@RequestParam String name){
		destinations = travoSearchService.findByCity(name);
		return destinations;
	}
	
	@RequestMapping(value="/searchByState", method=RequestMethod.GET, produces={"application/json","application/xml"})
	public List<Destination> searchState(@RequestParam String name){
		destinations = travoSearchService.findByState(name);
		return destinations;
	}
	
}
