package com.example.ejb;

import java.io.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    private HelloWorld msg;

    public void init() {
        msg = new HelloWorldBean();
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + msg.sayHello() + "</h1>");
        out.println("</body></html>");
    }

    public void destroy() {
    }
}