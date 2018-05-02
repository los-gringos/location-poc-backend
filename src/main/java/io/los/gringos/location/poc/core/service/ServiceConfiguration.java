package io.los.gringos.location.poc.core.service;

import io.los.gringos.location.poc.core.repository.LocationRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@Configuration
@EnableMongoRepositories(basePackages = {
        "io.los.gringos.location.poc.core.repository"
})
public class ServiceConfiguration {

    @Bean
    public LocationService locationService(LocationRepository locationRepository) {
        return new LocationServiceImpl(locationRepository);
    }
}
