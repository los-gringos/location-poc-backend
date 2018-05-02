package io.los.gringos.location.poc;

import io.los.gringos.location.poc.core.mapper.MapperConfiguration;
import io.los.gringos.location.poc.core.service.ServiceConfiguration;
import io.los.gringos.location.poc.rest.controller.ControllerConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Import;

@Import({
        ControllerConfiguration.class,
        MapperConfiguration.class,
        ServiceConfiguration.class
})
@EnableAutoConfiguration
@SpringBootConfiguration
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
