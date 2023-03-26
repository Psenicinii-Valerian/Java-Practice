package com.step.controller;

import com.step.model.Employee;
import com.step.model.EmployeeModel;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalDate;

public class EditController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String requestId = req.getParameter("id");

        int id = Integer.parseInt(requestId);

        Employee employee = EmployeeModel.getInstance().get(id);
        req.setAttribute("name", employee.getName());
        req.setAttribute("surname", employee.getSurname());
        req.setAttribute("birthdate", employee.getBirthdate());

        req.getRequestDispatcher("edit.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String requestId = req.getParameter("id");

        int id = Integer.parseInt(requestId);
        Employee employee = EmployeeModel.getInstance().get(id);

        String name = req.getParameter("name");
        String surname = req.getParameter("surname");
        LocalDate birthdate = LocalDate.parse(req.getParameter("birthdate"));

        employee.setName(name);
        employee.setSurname(surname);
        employee.setBirthdate(birthdate);

        req.setAttribute("name", employee.getName());
        req.setAttribute("surname", employee.getSurname());
        req.setAttribute("birthdate", employee.getBirthdate());

        req.getRequestDispatcher("edit.jsp").forward(req, resp);
    }
}
