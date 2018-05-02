package io.los.gringos.location.poc.core.service;

import io.los.gringos.location.poc.core.model.Location;
import io.los.gringos.location.poc.core.repository.LocationRepository;

public class LocationServiceImpl implements LocationService {

    private final LocationRepository locationRepository;

    public LocationServiceImpl(LocationRepository locationRepository) {
        this.locationRepository = locationRepository;
    }

    @Override
    public Location retrieveCurrent() {
        return locationRepository.findById("1").get();
    }
}
