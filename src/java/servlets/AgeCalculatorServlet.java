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
public class AgeCalculatorServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp")
                .forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        int agecal = 0;
        String age = request.getParameter("agec");
        String Message = "Your age next birthday will be ";
        
       try{
        if(age == null || age =="")
        {
            Message="You must enter an Input to know";
            request.setAttribute("message",Message);
            
            getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
            return;
        }
        agecal = Integer.parseInt(age);
        agecal++;
        request.setAttribute("agecalc",agecal);
        request.setAttribute("message",Message);
        
       }
       catch (Exception e)
       {
           Message="You must enter a Valid Age";
           request.setAttribute("message",Message);
       }
        getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
        }
        
 }

