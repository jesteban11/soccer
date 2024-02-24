package com.juanes.soccer.model;

import org.springframework.data.annotation.Id;

import java.util.UUID;

public class Country {
    @Id
    private UUID uuid;
    private String name;

    private String alphaCode2;
    private String alphaCode3;

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

    public String getAlphaCode2() {
        return alphaCode2;
    }

    public void setAlphaCode2(String alphaCode2) {
        this.alphaCode2 = alphaCode2;
    }

    public String getAlphaCode3() {
        return alphaCode3;
    }

    public void setAlphaCode3(String alphaCode3) {
        this.alphaCode3 = alphaCode3;
    }
}
