package io.los.gringos.location.poc;

import io.los.gringos.location.poc.core.mapper.MapperConfiguration;
import io.los.gringos.location.poc.core.model.Location;
import io.los.gringos.location.poc.core.repository.LocationRepository;
import io.los.gringos.location.poc.core.service.ServiceConfiguration;
import io.los.gringos.location.poc.rest.controller.ControllerConfiguration;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Import;

import javax.inject.Inject;

@Import({
        ControllerConfiguration.class,
        MapperConfiguration.class,
        ServiceConfiguration.class
})
@EnableAutoConfiguration
@SpringBootConfiguration
public class Application implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    private final LocationRepository locationRepository;

    @Inject
    public Application(LocationRepository locationRepository) {
        this.locationRepository = locationRepository;
    }

    // this is just for example
    @Override
    public void run(String... args) {
        Location currentLocation = new Location();
        currentLocation.setId("1");
        currentLocation.setLatitude(1.2);
        currentLocation.setLongitude(3.4);

        locationRepository.save(currentLocation);
    }
}
