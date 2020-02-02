package com.travos.travos.src.travodao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.travos.travos.src.travomodels.Address;
import com.travos.travos.src.travomodels.Destination;

@Repository
public interface AddressDao extends JpaRepository<Address, Long> {
	public List<Address> findByName(String name);
	@Query("select a.destination from Address a where a.country = ?")
	public List<Destination> findByCountry(String name);
	@Query("select a.destination from Address a where a.state = ?")
	public List<Destination> findByState(String name);
	@Query("select a.destination from Address a where a.city = ?")
	public List<Destination> findByCity(String name);
	@Query("select a.destination from Address a where a.village = ?")
	public List<Destination> findByVillage(String name);
	
}
