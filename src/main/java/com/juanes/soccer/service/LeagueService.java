package com.juanes.soccer.service;

import com.juanes.soccer.model.League;
import com.juanes.soccer.model.LeagueRead;
import com.juanes.soccer.repository.CountryRepository;
import com.juanes.soccer.repository.LeagueRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.function.Supplier;

@Service
public class LeagueService {
    private final LeagueRepository leagueRepository;
    private final CountryRepository countryRepository;

    public LeagueService(LeagueRepository leagueRepository, CountryRepository countryRepository) {
        this.leagueRepository = leagueRepository;
        this.countryRepository = countryRepository;
    }

    public Iterable<LeagueRead> get() {
        ArrayList<LeagueRead> leagueReads = new ArrayList<>();
        leagueRepository.findAll().forEach(league -> {
            LeagueRead leagueRead = new LeagueRead();
            leagueRead.setUuid(league.getUuid());
            leagueRead.setName(league.getName());
            try {
                leagueRead.setCountry(countryRepository.findById(league.getCountryUuid()).orElseThrow(() -> new Exception("Country not found")));
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
            leagueReads.add(leagueRead);
        });
        return leagueReads;
    }

    public League save(League league) {
        leagueRepository.save(league);
        return league;
    }
}
