package io.los.gringos.location.poc.core.service;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServiceConfiguration {

    @Bean
    public LocationService locationService() {
        return new LocationServiceImpl();
    }
}
