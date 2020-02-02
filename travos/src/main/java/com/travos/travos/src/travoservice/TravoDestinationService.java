package com.travos.travos.src.travoservice;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.travos.travos.src.travodao.DestinationDao;
import com.travos.travos.src.travomodels.Destination;

@Service
public class TravoDestinationService {
	
	@Autowired
	DestinationDao destinationOp;
	
	public boolean createOrUpdateDestination(Destination destination){
		destinationOp.save(destination);
		return true;
	}
	
	public boolean deleteDestination(Destination destination){
		destinationOp.delete(destination);
		return true;
	}
	
	public Destination getDestination(Long id){
		Optional<Destination> op = destinationOp.findById(id);
		return op.isPresent()?op.get():null;
	}
	
	
}
