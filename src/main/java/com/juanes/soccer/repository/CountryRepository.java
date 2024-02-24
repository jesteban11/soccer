package com.juanes.soccer.repository;

import com.juanes.soccer.model.Country;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface CountryRepository extends CrudRepository<Country, UUID> {
}
