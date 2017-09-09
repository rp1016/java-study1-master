package com.lesson02.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Calculator" , urlPatterns = {"/Calculator"})
public class CalculatorServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String sumandoUno = request.getParameter("var1");
        String sumandoDos = request.getParameter("var2");

        Integer sum1 = sumandoUno.trim() != ""  ? Integer.parseInt(sumandoUno) : 0;
        Integer sum2 = sumandoDos.trim() != "" ? Integer.parseInt(sumandoDos) : 0;
        int result = sum1 + sum2;

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<h1> Resultado : </h1>" + result);
        out.flush();
    }
}
