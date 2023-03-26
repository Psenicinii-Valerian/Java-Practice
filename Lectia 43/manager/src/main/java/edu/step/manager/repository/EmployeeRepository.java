package edu.step.manager.repository;

import edu.step.manager.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    List<Employee> findAllByNameEquals(String name);
    List<Employee> findAllBySalaryGreaterThanOrderByNameAsc(Double salary);
    List<Employee> findAllByNameEqualsAndSalaryLessThan(String name, Double salary);

    Employee findOneByNameEquals(String name);
}
