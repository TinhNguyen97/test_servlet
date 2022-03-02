package com;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import static java.awt.Color.red;

@WebServlet(name = "HelloServlet", value = "/display-discount")
public class HelloServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String descripition = request.getParameter("descripition");
        int price = Integer.parseInt(request.getParameter("price"));
        int discount = Integer.parseInt(request.getParameter("discount"));
        double discountAmount=price*discount;
        double discountPrice=price-discountAmount;
        PrintWriter printWriter=response.getWriter();
        printWriter.write("<html>");
        printWriter.write("<h3>discount amount:"+discountAmount+"</h3>");
        printWriter.write("<h3>discountPrice:"+discountPrice+"</h3>");
        printWriter.write("</html>");
        printWriter.close();
    }
}
