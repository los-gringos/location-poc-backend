package io.los.gringos.location.poc.rest.controller;

import io.los.gringos.location.poc.core.model.Location;
import io.los.gringos.location.poc.core.service.LocationService;
import io.los.gringos.location.poc.rest.dto.LocationDto;
import ma.glasnost.orika.MapperFacade;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/location")
public class LocationController {

    private final MapperFacade mapperFacade;

    private final LocationService locationService;

    public LocationController(MapperFacade mapperFacade,
                              LocationService locationService) {
        this.mapperFacade = mapperFacade;
        this.locationService = locationService;
    }

    @RequestMapping(method = RequestMethod.GET, path = "/current")
    public LocationDto getCurrent() {
        Location currentLocation = locationService.retrieveCurrent();

        return mapperFacade.map(currentLocation, LocationDto.class);
    }
}
