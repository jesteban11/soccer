package com.juanes.soccer.model;

import org.springframework.data.annotation.Id;

import java.util.Optional;
import java.util.UUID;

public class TeamRead {
    @Id
    private UUID uuid;
    private String name;
    private byte[] emblem;
    private LeagueRead leagueRead;

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public byte[] getEmblem() {
        return emblem;
    }

    public void setEmblem(byte[] emblem) {
        this.emblem = emblem;
    }

    public LeagueRead getLeagueRead() {
        return leagueRead;
    }

    public void setLeagueRead(LeagueRead leagueRead) {
        this.leagueRead = leagueRead;
    }
}
