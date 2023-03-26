package com.step.controller;

import com.step.model.Employee;
import com.step.model.EmployeeModel;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


// TODO: afisarea, adaugarea, editarea si stergerea

public class ListController extends HttpServlet {

    private EmployeeModel employeeModel = EmployeeModel.getInstance();

    // HTTP?
    // GET

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        // call DB
        // List<Employee>

        List<Employee> employeeList = EmployeeModel.getInstance().getEmployeeList();

        req.setAttribute("list", employeeList);

        req.getRequestDispatcher("list.jsp").forward(req, resp);
    }

    // POST
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }

}