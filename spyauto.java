/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 *
 * @author mahen
 */
@WebServlet(urlPatterns = {"/spyauto"})
public class spyauto extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            String a = request.getParameter("t1");
            String b = request.getParameter("t2");

        try {
            int n1 = Integer.parseInt(a);

            if (b.equals("auto")) 
            {
                int sq = n1 * n1;
                if ((sq % 10 == n1) || (sq % 100 == n1) || (sq % 1000 == n1)) {
                    out.println("It is an automorphic number");
                } else {
                    out.println("It is not an automorphic number");
                }
            } else if (b.equals("spy"))
            {
                int remainder, result = 0, product = 1;
                int m = n1;

                while (n1 > 0) {
                    remainder = n1 % 10;
                    result = result + remainder;
                    product = product * remainder;
                    n1 = n1 / 10;
                }

                if (result == product)
                {
                    out.println(m + " is a spy number");
                } else 
                {
                    out.println(m + " is not a spy number");
                  }
                } else 
                {
                    out.println("Invalid option");
                }
                } catch (NumberFormatException e) {
                    out.println("Invalid number");
                }
            
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
