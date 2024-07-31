package org.scoula.ex04;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/response_redirect")
public class ResponseRedirectServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       String username = (String) request.getSession().getAttribute("username");
       String useraddress = (String) request.getSession().getAttribute("useraddress");

       request.setAttribute("username", username);
       request.setAttribute("useraddress", useraddress);

       //forward
        RequestDispatcher rd = getServletContext().getRequestDispatcher("/response_redirect.jsp");
        rd.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
