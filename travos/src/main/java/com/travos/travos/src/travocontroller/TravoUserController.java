package com.travos.travos.src.travocontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.travos.travos.src.travomodels.UserGround;
import com.travos.travos.src.travoservice.TravoUserService;

@RestController
@RequestMapping("/submit")
public class TravoUserController {
	
	@Autowired
	TravoUserService travoUserService;
	
	@RequestMapping(value="/submitProfile", method=RequestMethod.POST, produces={"application/json","application/xml"}, consumes={"application/json","application/xml"})
	public String submitProfile(@RequestBody UserGround profile){
		
		travoUserService.addUser(profile);
		return "";
	}
	
	@RequestMapping(value="/loginUser", method=RequestMethod.POST, produces={"application/json","application/xml"}, consumes={"application/json","application/xml"})
	public String loginProfile(@RequestBody UserGround profile){
		
		travoUserService.findByValue(profile);
		return "";
	}
	
	@RequestMapping(value="/getUser", method=RequestMethod.GET, produces={"application/json","application/xml"})
	public UserGround findProfile(@RequestParam Long id){
		
		UserGround user = travoUserService.findById(id);
		System.out.println(user);
		return user;
	}

}
