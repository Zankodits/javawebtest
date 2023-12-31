package com.Controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet("/sign-out")
public class SignOutServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try (PrintWriter out = response.getWriter()) {
			if (request.getSession().getAttribute("signup") != null) {
				request.getSession().removeAttribute("signup");
				response.sendRedirect("View/home.jsp");
			}else {
				response.sendRedirect("View/home.jsp");
			}

		}
	}

}
