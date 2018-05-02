package io.los.gringos.location.poc.core.repository;

import io.los.gringos.location.poc.core.model.Location;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface LocationRepository extends MongoRepository<Location, String> {
}
