package com.step.controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class LoginController extends HttpServlet {

    private String defaultId = "id";
    private String defaultUser = "admin";
    private String defaultPassword = "pass";

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("login.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String user = req.getParameter("user");
        String password = req.getParameter("password");

        // call DB
        // validate user

        System.out.println(user + "  " + password);

        if (user.equalsIgnoreCase(defaultUser) && password.equalsIgnoreCase(defaultPassword)) {
            // Save login information
            HttpSession session = req.getSession();
            session.setAttribute("userId", defaultId);
            session.setAttribute("userName", user);
            session.setMaxInactiveInterval(60*120);

            resp.sendRedirect("list");

        } else {
            resp.sendRedirect("login");
        }
    }
}
