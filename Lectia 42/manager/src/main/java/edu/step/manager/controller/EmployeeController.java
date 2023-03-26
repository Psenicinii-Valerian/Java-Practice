package edu.step.manager.controller;

import edu.step.manager.model.Employee;
import edu.step.manager.model.EmployeeDTO;
import edu.step.manager.service.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

// Serviciu REST
@RestController
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    private EmployeeDao dao;

    // Get all - GET
    @GetMapping
    public ResponseEntity<List<Employee>> getAll(){
//        List<Employee> employees = new ArrayList<>();
//        Employee john = new Employee();
//        john.setName("John Smith");
//        john.setSalary(2000.20);
//        employees.add(john);
        return ResponseEntity.ok(dao.findAll());
    }

    // Create - POST
    @PostMapping
    public ResponseEntity create(@RequestBody EmployeeDTO dto) {
        dao.create(dto.getName(), dto.getSurname(), dto.getBirthdate());
        return ResponseEntity.ok().build();
    }

    // TODO: Update - PUT
    @PutMapping
    public ResponseEntity actualise(@RequestBody EmployeeDTO dto) {
        dao.update(dto.getId(), dto.getName(), dto.getSurname(), dto.getBirthdate());
        return ResponseEntity.ok().build();
    }

    // TODO: Delete - DELETE
    @DeleteMapping
    ResponseEntity clear(@RequestBody EmployeeDTO dto) {
        dao.delete(dto.getId());
        return ResponseEntity.ok().build();
    }

}
