package com.juanes.soccer.web;

import com.juanes.soccer.model.League;
import com.juanes.soccer.model.LeagueRead;
import com.juanes.soccer.repository.LeagueRepository;
import com.juanes.soccer.service.LeagueService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LeagueController {
    private final LeagueService leagueService;

    public LeagueController(LeagueService leagueRepository) {
        this.leagueService = leagueRepository;
    }

    @GetMapping("/league")
    public Iterable<LeagueRead> get(){
        return leagueService.get();
    }

    @PostMapping("league")
    public League create(@RequestBody League league){
        return leagueService.save(league);
    }
}
