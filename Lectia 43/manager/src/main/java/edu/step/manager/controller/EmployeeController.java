package edu.step.manager.controller;

import edu.step.manager.model.Employee;
import edu.step.manager.model.EmployeeDTO;
import edu.step.manager.service.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/employees") // localhost:8080/employees
public class EmployeeController { /* MVC */

    @Autowired
    private EmployeeDao dao;

    // Metode: GET, POST, PUT, DELETE
    // GET /employees/filter?value= (List<Employee>) (READ)
    // GET /employees?name=John (List<Employee>) (READ)
    // POST /employee (CREATE) HTTP Request (Body)
    // PUT /employee (UPDATE) HTTP Request (Body)
    // DELETE /employee?id=10

    // Create Read Update Delete - operatii de baza (must have)

    // Get all - GET
    @GetMapping // GET localhost:8080/employees
    public ResponseEntity<List<Employee>> getAll(){
//        List<Employee> employees = new ArrayList<>();
//        Employee john = new Employee();
//        john.setName("John Smith");
//        john.setSalary(2000.20);
//        employees.add(john);
        return ResponseEntity.ok(dao.findAll());
    }

    @GetMapping("/{id}")// GET localhost:8080/employees/111x
    public ResponseEntity<Employee> getById(@PathVariable Long id){
        return ResponseEntity.badRequest().build();
    }

    @GetMapping("/filter") // GET localhost:8080/employees/filter?name=Peter
    public ResponseEntity<Employee> getOne(@RequestParam String name){
        if (name == null || name.trim().equals("")) {
            return ResponseEntity.badRequest().build();
        }
        return ResponseEntity.ok(dao.filter(name));
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
// Serviciu REST


