package org.scoula.ex05;

import org.scoula.ex05.domain.Member;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       String userid = request.getParameter("userid");
       String password = request.getParameter("passwd");

       request.setAttribute("userid", userid);
       request.setAttribute("passwd", password);

       request.getRequestDispatcher("login.jsp").forward(request, response);
    }

}
