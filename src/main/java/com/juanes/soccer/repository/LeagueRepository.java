package com.juanes.soccer.repository;

import com.juanes.soccer.model.League;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface LeagueRepository extends CrudRepository<League, UUID> {
}
