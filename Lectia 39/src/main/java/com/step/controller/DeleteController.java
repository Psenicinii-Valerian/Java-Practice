package com.step.controller;

import com.step.model.Employee;
import com.step.model.EmployeeModel;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class DeleteController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        // sau facem delete-ul printr-o pagina speciala si avem nevoie de tot codul cu tot cu doPost metod (astfel facem tot in Java)
        String requestId = req.getParameter("id");

        if (requestId == null) {
            resp.sendRedirect("list");
        } else {

            Employee employee = EmployeeModel.getInstance().get(Integer.parseInt(requestId));
            req.setAttribute("fullName", employee.getName() + " " + employee.getSurname());
            req.getRequestDispatcher("delete.jsp").forward(req, resp);
        }


        // sau facem prin doGet id + functia confirmDelete() din JavaScript (script din list.jsp) + remove din EmployeeModel
//        String requestId = req.getParameter("id");
//
//        if (requestId != null) {
//            EmployeeModel.getInstance().remove(Integer.parseInt(requestId));
//            resp.sendRedirect("list");
//        }


    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String requestId = req.getParameter("id");

        if (requestId != null) {
            EmployeeModel.getInstance().remove(Integer.parseInt(requestId));
            resp.sendRedirect("list");
        }

    }
}
