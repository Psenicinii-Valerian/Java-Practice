package edu.step.manager.controller.web;

import edu.step.manager.model.Employee;
import edu.step.manager.service.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller // Spring MVC
public class IndexController {
    @Autowired
    private EmployeeDao dao;
    @GetMapping
    public String index(Model model) {
        List<Employee> all = dao.findAll();
        model.addAttribute("list", all);
        return "index";
    }
}
