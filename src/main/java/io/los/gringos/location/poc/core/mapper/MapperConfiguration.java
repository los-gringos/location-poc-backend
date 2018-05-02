package io.los.gringos.location.poc.core.mapper;

import io.los.gringos.location.poc.core.model.Location;
import io.los.gringos.location.poc.rest.dto.LocationDto;
import ma.glasnost.orika.CustomMapper;
import ma.glasnost.orika.MapperFacade;
import ma.glasnost.orika.MapperFactory;
import ma.glasnost.orika.MappingContext;
import ma.glasnost.orika.impl.DefaultMapperFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MapperConfiguration {

    @Bean
    public MapperFacade mapperFacade() {
        MapperFactory mapperFactory = new DefaultMapperFactory.Builder().build();

        configureLocation(mapperFactory);

        return mapperFactory.getMapperFacade();
    }

    private void configureLocation(MapperFactory mapperFactory) {
        mapperFactory.classMap(Location.class, LocationDto.class)
                .mapNulls(false)
                .byDefault();

        mapperFactory.classMap(LocationDto.class, Location.class)
                .customize(new CustomMapper<LocationDto, Location>() {

                    @Override
                    public void mapAtoB(LocationDto locationDto, Location location, MappingContext context) {
                        location.setLatitude(locationDto.getLatitude());
                        location.setLongitude(locationDto.getLongitude());
                    }
                })
                .byDefault();
    }
}
