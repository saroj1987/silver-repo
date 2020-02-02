package com.travos.travos.src.travocontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.travos.travos.src.travomodels.Destination;
import com.travos.travos.src.travoservice.TravoDestinationService;

@RestController
@RequestMapping("/destination")
public class TravoDestnationController {
	@Autowired
	TravoDestinationService travoDestinationService;
	
	@RequestMapping(value="/submitDestination", method=RequestMethod.POST, produces={"application/json","application/xml"}, consumes={"application/json","application/xml"})
	public String createDestination(@RequestBody Destination destination){
		
		travoDestinationService.createOrUpdateDestination(destination);
		return "Submitted...";
	}
	
	@RequestMapping(value="/deleteDestination", method=RequestMethod.POST, produces={"application/json","application/xml"}, consumes={"application/json","application/xml"})
	public String deleteDestination(@RequestBody Destination destination){
		
		travoDestinationService.deleteDestination(destination);
		return "";
	}
	
	@RequestMapping(value="/getDestination", method=RequestMethod.GET, produces={"application/json","application/xml"}, consumes={"application/json","application/xml"})
	public Destination getDestination(@RequestParam Long id){
		
		return new Destination();
	}
	
}
