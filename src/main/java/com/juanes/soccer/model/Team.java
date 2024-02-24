package com.juanes.soccer.model;

import org.springframework.data.annotation.Id;

import java.util.UUID;

public class Team {
    @Id
    private UUID uuid;
    private String name;
    private byte[] emblem;
    private UUID leagueUuid;

    public UUID getLeagueUuid() {
        return leagueUuid;
    }

    public void setLeagueUuid(UUID leagueUuid) {
        this.leagueUuid = leagueUuid;
    }

    public byte[] getEmblem() {
        return emblem;
    }

    public void setEmblem(byte[] emblem) {
        this.emblem = emblem;
    }

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
}
