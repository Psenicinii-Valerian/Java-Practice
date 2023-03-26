package com.step.filter;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class AuthentificationFilter implements Filter {
    @Override
        public void init(FilterConfig filterConfig) throws ServletException {
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest) request;
        HttpServletResponse resp = (HttpServletResponse) response;
        String adress = req.getRequestURI();

        HttpSession session = req.getSession(false);
        String userId = null;
        String userName = null;

        if (session != null) {
            userId = (String) session.getAttribute("userId");
            userName = (String) session.getAttribute("userName");
        }

        if (adress.endsWith("login") || (session != null && userId != null && userName != null)) {
            chain.doFilter(request, response); // REQUESTUL A FOST VALIDAT CU SUCCES
        } else {
            System.out.println(" RESTRICTED ACCES! REDIRECTING TO LOGIN!");
            resp.sendRedirect("login");
        }
    }

    @Override
    public void destroy() {

    }

}
