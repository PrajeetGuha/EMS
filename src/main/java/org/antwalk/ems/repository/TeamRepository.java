package org.antwalk.ems.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.antwalk.ems.model.Team;
import org.springframework.stereotype.Repository;

@Repository
public interface TeamRepository extends JpaRepository<Team,Long> {
    
}
