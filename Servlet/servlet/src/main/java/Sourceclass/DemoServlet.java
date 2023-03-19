package Sourceclass;
import jakarta.servlet.http.*;  
import jakarta.servlet.*;
//import jakarta.servlet.annotation.WebServlet;

import java.io.*;

//@WebServlet("/login")
public class DemoServlet extends HttpServlet{  
    public void doGet(HttpServletRequest req,HttpServletResponse res)  
    throws ServletException,IOException  
    {  
        res.setContentType("text/html");//setting the content type  
        PrintWriter pwriter = res.getWriter();//get the stream to write the data  
        
        //writing html in the stream  
        String name = req.getParameter("userName");
        String password = req.getParameter("userPassword");
        if(!((name.equals("sanhotara"))
        &&(password.equals("sang1011"))))
        {
            pwriter.println("Login failed!");
            pwriter.close();//closing the stream  
            return;
        }
        pwriter.println("Login successful!");
        pwriter.print("Hello here:"+name);
        pwriter.print(" Your Password is: "+password);
        //Creating two cookies
        Cookie c1=new Cookie("userName",name);
        Cookie c2=new Cookie("userPassword",password);
        //Adding the cookies to response header
        res.addCookie(c1);
        res.addCookie(c2);
        pwriter.print("<a href='welcomehere'>View Details</a>");
        pwriter.close();//closing the stream  
    }
}  