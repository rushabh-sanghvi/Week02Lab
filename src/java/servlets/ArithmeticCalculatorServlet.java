/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 794466
 */
public class ArithmeticCalculatorServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp")
                .forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try{
        String firstnum = request.getParameter("first");
        String secondnum = request.getParameter("second");
        int firstn = Integer.parseInt(firstnum);
        int secondn = Integer.parseInt(secondnum);
        int total = 0;
        String Message = "";
        try {
            if ( firstnum == null|| secondnum == null || "".equals(firstnum) || "".equals(secondnum) ) {
                Message = "You must enter an Input to know";
                request.setAttribute("message", Message);

                getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
                return;
            }

           
            String mess = "Answer: ";
            String function = request.getParameter("button");

            if (function.equals("+")) {
                total = firstn + secondn;
            } else if (function.equals("-")) {
                total = firstn - secondn;
            }
            else if (function.equals("*")) {
                total = firstn * secondn;
            }
            else if (function.equals("/")) {
                total = firstn / secondn;
            }
            request.setAttribute("totaln", total);
            request.setAttribute("message", mess);
            
        } catch (IOException | ServletException e) {
            Message = "You must enter a Valid Value";
            request.setAttribute("message", Message);
        }
        }
        catch (Exception e)
       {
           String Message ="You must enter a Valid Value";
           request.setAttribute("message",Message);
       }
        
        
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
    }

}
