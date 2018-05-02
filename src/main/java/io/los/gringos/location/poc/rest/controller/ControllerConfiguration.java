package io.los.gringos.location.poc.rest.controller;

import io.los.gringos.location.poc.core.mapper.MapperConfiguration;
import io.los.gringos.location.poc.core.service.LocationService;
import io.los.gringos.location.poc.core.service.ServiceConfiguration;
import ma.glasnost.orika.MapperFacade;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Import({
        MapperConfiguration.class,
        ServiceConfiguration.class
})
@Configuration
public class ControllerConfiguration {

    @Bean
    public LocationController locationController(MapperFacade mapperFacade,
                                                 LocationService locationService) {
        return new LocationController(
                mapperFacade,
                locationService);
    }
}
