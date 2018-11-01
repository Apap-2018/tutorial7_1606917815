package com.apap.tutorial7.service;

import java.util.List;
import java.util.Optional;

import com.apap.tutorial7.model.FlightModel;
import com.apap.tutorial7.model.PilotModel;

/**
 * FlightService
 */
public interface FlightService {
    FlightModel addFlight(FlightModel flight);
    FlightModel getFlightDetailByFlightNumber(String flightNumber);
	FlightModel getFlightDetailById(long flightId);
    void deleteByFlightNumber(String flightNumber);
	void updateFlight(long flightId, FlightModel flight);
	void deleteFlight(FlightModel flight);
	List<FlightModel> viewAllFlight();
	
}