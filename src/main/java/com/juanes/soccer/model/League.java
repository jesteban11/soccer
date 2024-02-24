package com.juanes.soccer.model;

import org.springframework.data.annotation.Id;

import java.util.UUID;

public class League {
    @Id
    private UUID uuid;
    private String name;
    private UUID countryUuid;

    public UUID getCountryUuid() {
        return countryUuid;
    }

    public void setCountryUuid(UUID countryUuid) {
        this.countryUuid = countryUuid;
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
