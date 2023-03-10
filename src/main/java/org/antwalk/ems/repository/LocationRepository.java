package org.antwalk.ems.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.antwalk.ems.model.Location;
import org.springframework.stereotype.Repository;

@Repository
public interface LocationRepository extends JpaRepository<Location,Long> {
    
}
