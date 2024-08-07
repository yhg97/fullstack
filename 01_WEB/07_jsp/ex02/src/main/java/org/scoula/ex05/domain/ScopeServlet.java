package org.scoula.ex05.domain;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/scope")
public class ScopeServlet extends HttpServlet {

    ServletContext sc;

    @Override
    public void init(ServletConfig config) throws ServletException {
        sc = config.getServletContext();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        sc.setAttribute("scopeName", "applicationScope 값"); // Application scope

        HttpSession session = request.getSession(); //Session Scope
        session.setAttribute("scopeName", "sessionScope 값");

        request.setAttribute("scopeName", "requestScope 값"); // request scope
        Member member = new Member("홍길동", "hong");
        request.setAttribute("member", member);

        request.getRequestDispatcher("scope.jsp").forward(request, response);
    }
}
