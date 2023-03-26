package edu.step.manager.controller.api;

import edu.step.manager.model.Employee;
import edu.step.manager.model.EmployeeDTO;
import edu.step.manager.service.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// Controller Serviciu REST
@RestController
@RequestMapping("/employees") // localhost:8080/employees
public class EmployeeRestController { /* MVC */

    @Autowired
    private EmployeeDao dao;

    // Metode: GET, POST, PUT, DELETE
    // Create Read Update Delete - operatii de baza (must have)
    // GET /employees/filter?value= (List<Employee>) (READ)
    @GetMapping("/{id}") // GET localhost:8081/employees/111x
    public ResponseEntity<Employee> getById(@PathVariable Long id){
        Employee employee = dao.findById(id);
        return ResponseEntity.ok(employee);
    }

    // GET /employees/search?name=John (List<Employee>) (READ)
    @GetMapping("/search") // GET localhost:8081/employees/search?name=xxx&lastname=yyy&salary=zzz,
    public ResponseEntity search(@RequestParam(required = false) String name,
                                 @RequestParam String lastname,
                                 @RequestParam Double salary)
    {
        return ResponseEntity.ok().build();
    }
    @GetMapping("/filter") // GET localhost:8081/employees/filter?name=Peter
    public ResponseEntity<Employee> getOne(@RequestParam String name){
        if (name == null || name.trim().equals("")) {
            return ResponseEntity.badRequest().build();
        }
        return ResponseEntity.ok(dao.filter(name));
    }
    @GetMapping // GET localhost:8081/employees
    public ResponseEntity<List<Employee>> getAll(){
        return ResponseEntity.ok(dao.findAll());
    }

    // POST /employee (CREATE) HTTP Request (Body)
    @PostMapping
    public ResponseEntity create(@RequestBody EmployeeDTO dto) {
        dao.create(dto.getName(), dto.getSurname(), dto.getBirthdate());
        return ResponseEntity.ok().build();
    }

    // PUT /employee (UPDATE) HTTP Request (Body)
    // TODO: Update - PUT
    @PutMapping
    public ResponseEntity actualise(@RequestBody EmployeeDTO dto) {
        dao.update(dto.getId(), dto.getName(), dto.getSurname(), dto.getBirthdate());
        return ResponseEntity.ok().build();
    }

    // DELETE /employee?id=10
    // TODO: Delete - DELETE
    @DeleteMapping
    ResponseEntity clear(@RequestBody EmployeeDTO dto) {
        dao.delete(dto.getId());
        return ResponseEntity.ok().build();
    }
}


