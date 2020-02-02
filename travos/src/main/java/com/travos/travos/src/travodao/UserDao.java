package com.travos.travos.src.travodao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.travos.travos.src.travomodels.UserGround;

@Repository
public interface UserDao extends JpaRepository<UserGround, String> {
	
	public Optional<UserGround> findByEmail(String email);
	public Optional<UserGround> findByPhone(String phone);
	public Optional<UserGround> findById(Long id);
	public Optional<UserGround> findByName(String name);


}
