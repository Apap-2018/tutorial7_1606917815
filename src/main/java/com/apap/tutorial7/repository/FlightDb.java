package com.apap.tutorial7.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.apap.tutorial7.model.FlightModel;

/**
 * FlightDb
 */
@Repository
public interface FlightDb extends JpaRepository<FlightModel, Long> {
    void deleteByFlightNumber(String flightNumber);
    void delete(FlightModel flight);
    FlightModel findByFlightNumber(String flightNumber);
    FlightModel findById(long flightId);
}