package edu.step.manager.service;

import edu.step.manager.model.Employee;
import edu.step.manager.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class EmployeeDao {
    @Autowired
    EmployeeRepository repository;

    public List<Employee> findAll() {
        return repository.findAll();
    }

    public Employee findById(Long id) {
        Optional<Employee> byId = repository.findById(id);
        if(byId.isPresent()) {
            return byId.get();
        }
        return null;
    }

    public List<Employee> findByName(String name) {
        return repository.findAllByNameEquals(name);
    }

    public void create(String name, String surname, LocalDate birthdate) {
        Employee entity = new Employee();
        entity.setName(name);
        entity.setSalary(1200.0);
        repository.save(entity);
    }

    public void create(List<Employee> employees) {
        repository.saveAll(employees);
    }

    public void update(Long id, String name, String surname, LocalDate birthdate) {
        Optional<Employee> employee = repository.findById(id);
        if(employee.isPresent()) {
            Employee emp = employee.get();
            emp.setName(name);
            repository.save(emp);
        } else {
            System.out.println("N-am putut gasi obiectul cu id=" + id);
        }
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}


