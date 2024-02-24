package com.juanes.soccer.web;

import com.juanes.soccer.model.League;
import com.juanes.soccer.model.Team;
import com.juanes.soccer.model.TeamRead;
import com.juanes.soccer.service.TeamService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.UUID;

@RestController
public class TeamController {
    private final TeamService teamService;

    public TeamController(TeamService teamService) {
        this.teamService = teamService;
    }

    @GetMapping("/team")
    public Iterable<TeamRead> get() {
        return teamService.get();
    }

    @PostMapping("/team")
    public Team create(@RequestPart("name") String name, @RequestPart("league") String uuid, @RequestPart("emblem") MultipartFile emblem) throws IOException {
        return teamService.save(name, uuid, emblem.getBytes());
    }
}
