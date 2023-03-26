package com.step.controller;

import com.step.model.Address;
import com.step.model.Employee;
import com.step.model.EmployeeModel;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalDate;

// TODO: De adaugat:
//  1. Legatura dintre clasa Employee si Address, Department
//  2. Atunci cand adaugam obiect de tip Employee, sa se creeze si adresa.
//  3. De adaugat pagina de configurare a departamentelor.
//  4. Cand cream un angajat, sa existe un element in pagina, care permite selectarea departamentului.

public class AddController extends HttpServlet {

    // Implicit, servletele nu raspund la nici un tip de apeluri
    // GET, POST, PUT, DELETE, PATCH


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        // resp.sendRedirect("add.jsp"); - nu este foarte eficient deoarece redirectionam user-ul pe o alta pagina!

        // RequestDispatcher dispatcher = req.getRequestDispatcher("add.jsp");
        // dispatcher.forward(req, resp); - aceeasi functie realizeaza ca cea de mai jos doar ca e in 2 randuri

        req.getRequestDispatcher("add.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        String surname = req.getParameter("surname");
        String birthdate = req.getParameter("birthdate");
        String street = req.getParameter("street");

        // aici se citesc restul campurilor din Address
        Address address = new Address();
        address.setStreet(street);

        // setarea restul campurilor
        System.out.println(name + surname + birthdate);

        EmployeeModel model = EmployeeModel.getInstance();
        Employee employee = new Employee(name, surname, LocalDate.parse(birthdate));
        employee.setAddress(address);
        model.add(employee);

        req.getRequestDispatcher("add.jsp").forward(req, resp);
    }
}
