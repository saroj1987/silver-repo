package com.travos.travos.src.travoservice;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.travos.travos.src.travodao.UserDao;
import com.travos.travos.src.travomodels.UserGround;

@Service
public class TravoUserService {
	@Autowired
	UserDao userDao;
	public Boolean addUser(UserGround profile){
		userDao.save(profile);
		return true;
	}
	public Boolean updateUser(UserGround profile){
		userDao.save(profile);
		return true;
	}
	public UserGround findByValue(UserGround user){
		Optional<UserGround> userOption = null;
		if(user.getEmail() != null)
			userOption = userDao.findByEmail(user.getEmail());
		if(user.getPhone() != null)
			userOption = userDao.findByPhone(user.getPhone());
		if(user.getName() != null)
			userOption = userDao.findByName(user.getName());
		
		return userOption.isPresent()?userOption.get():null;
		
	}
	
	public UserGround findById(Long id){
		Optional<UserGround> userOption = null;
		userOption = userDao.findById(id);
		return userOption.isPresent()?userOption.get():null;
		
	}
}
