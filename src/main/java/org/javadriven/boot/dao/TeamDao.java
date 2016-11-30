package org.javadriven.boot.dao;

import org.javadriven.boot.model.Team;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.List;

@RestResource(path = "teams", rel = "teams")
public interface TeamDao extends CrudRepository<Team, Long>{

    List<Team> findAll();

    Team findByName(String name);
}
