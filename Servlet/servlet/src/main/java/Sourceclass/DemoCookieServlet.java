package Sourceclass;
import java.io.*;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
//import jakarta.servlet.annotation.*;

//@WebServlet("/welcomehere")
public class DemoCookieServlet extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter pw = resp.getWriter();
        Cookie[] ck = req.getCookies();
        pw.println("Name: " + ck[0].getValue());
        pw.println("Password" + ck[1].getValue());
        pw.close();
    }
    
}
