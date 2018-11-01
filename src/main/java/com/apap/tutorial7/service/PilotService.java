package com.apap.tutorial7.service;

import java.util.Optional;

import com.apap.tutorial7.model.PilotModel;

/**
 * PilotService
 */
public interface PilotService {
    PilotModel getPilotDetailByLicenseNumber(String licenseNumber);
    PilotModel getPilotDetailById(long id);
    PilotModel addPilot(PilotModel pilot);
    void deletePilotByLicenseNumber(String licenseNumber);
	void updatePilot(long pilotId, PilotModel pilot);
	void deletePilot(PilotModel pilot);
}