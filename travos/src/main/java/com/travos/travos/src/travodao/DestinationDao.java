package com.travos.travos.src.travodao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.travos.travos.src.travomodels.Destination;

@Repository
public interface DestinationDao extends JpaRepository<Destination, Long> {
	
	public List<Destination> findByName(String name);
	
}
