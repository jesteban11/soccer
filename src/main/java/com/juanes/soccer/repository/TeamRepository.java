package com.juanes.soccer.repository;

import com.juanes.soccer.model.Team;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface TeamRepository extends CrudRepository<Team, UUID> {
}
