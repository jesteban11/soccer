package com.juanes.soccer.service;

import com.juanes.soccer.model.Country;
import com.juanes.soccer.repository.CountryRepository;
import org.springframework.stereotype.Service;

@Service
public class CountryService {
    private final CountryRepository countryRepository;

    public CountryService(CountryRepository countryRepository) {
        this.countryRepository = countryRepository;
    }

    public Iterable<Country> get() {
        return countryRepository.findAll();
    }

    public Country save(Country country) {
        countryRepository.save(country);
        return country;
    }
}
