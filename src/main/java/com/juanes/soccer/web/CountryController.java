package com.juanes.soccer.web;

import com.juanes.soccer.model.Country;
import com.juanes.soccer.service.CountryService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CountryController {
    private final CountryService countryService;

    public CountryController(CountryService countryService) {
        this.countryService = countryService;
    }

    @GetMapping("/country")
    public Iterable<Country> get() {
        return countryService.get();
    }

    @PostMapping("/country")
    public Country create(@RequestBody Country country) {
        return countryService.save(country);
    }
}
