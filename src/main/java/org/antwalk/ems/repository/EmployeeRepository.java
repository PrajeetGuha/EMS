package org.antwalk.ems.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.antwalk.ems.model.Employee;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long> {
}
