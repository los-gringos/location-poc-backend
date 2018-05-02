package io.los.gringos.location.poc.core.service;

import io.los.gringos.location.poc.core.model.Location;

public class LocationServiceImpl implements LocationService {

    @Override
    public Location retrieveCurrent() {
        Location currentLocation = new Location();
        currentLocation.setLatitude(1.2);
        currentLocation.setLongitude(3.4);

        return currentLocation;
    }
}
