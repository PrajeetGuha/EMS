package org.antwalk.ems.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.antwalk.ems.model.Project;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepository extends JpaRepository<Project,Long> {
    
}
