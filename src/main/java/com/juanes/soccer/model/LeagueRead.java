package com.juanes.soccer.model;

import org.springframework.data.annotation.Id;

import java.util.Optional;
import java.util.UUID;

public class LeagueRead {

    @Id
    private UUID uuid;
    private String name;
    private Country country;

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

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }


}
