package com.apap.tutorial7.service;

import java.util.List;
import java.util.Optional;

import com.apap.tutorial7.model.FlightModel;
import com.apap.tutorial7.repository.FlightDb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * FlightServiceImpl
 */
@Service
@Transactional
public class FlightServiceImpl implements FlightService {
    @Autowired
    private FlightDb flightDb;
    
    @Override
    public FlightModel addFlight(FlightModel flight) {
        return flightDb.save(flight);
    }

    @Override
    public void deleteByFlightNumber(String flightNumber) {
        flightDb.deleteByFlightNumber(flightNumber);
    }
    
    @Override
    public void deleteFlight(FlightModel flight) {
        flightDb.delete(flight);
    }
    
    @Override
    public void updateFlight(long flightId, FlightModel flight) {
    	
    }

    @Override
    public FlightModel getFlightDetailByFlightNumber(String flightNumber) {
        return flightDb.findByFlightNumber(flightNumber);
    }
    
    @Override
    public FlightModel getFlightDetailById(long flightId) {
        return flightDb.findById(flightId);
    }

	@Override
	public List<FlightModel> viewAllFlight() {
		// TODO Auto-generated method stub
		return flightDb.findAll();
	}
}