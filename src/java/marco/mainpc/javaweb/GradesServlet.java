/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package marco.mainpc.javaweb;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import marco.mainpc.javaweb.Grade;

/**
 *
 * @author Marco
 */
public class GradesServlet extends HttpServlet {

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
            
            //Grade is retrieved in the form of String value selected by user
            String gradeInputs = request.getParameter("addgrade");
            //When a grade is selected and the "next" button is hit...
            if (gradeInputs.equals("next")) {
                HttpSession session = request.getSession();
                
                //Initialize the ArrayList of created Grade instances in the results page ('grades.jsp')
                ArrayList<Grade> grades = (ArrayList<Grade>) session.getAttribute("grades");
                //If no such ArrayList exists (i.e. there are no grades), make it so
                if (grades == null ) {
                    grades = new ArrayList<Grade>();
                }
                
                //For each new Grade class created
                Grade newgrade = new Grade();
                newgrade.setGrade(request.getParameter("grade"));
                //Add new Grade to the ArrayList so it can be used later
                grades.add(newgrade);
                
                //Set grades so that it is consistently updated with each refresh of 'courses.jsp'
                //Also the selection page
                session.setAttribute("grades", grades);
                response.sendRedirect("courses.jsp");
            }
            //When a grade is selected and the "done" button is hit...
            else if (gradeInputs.equals("done")) {
                //Bring up the results page
                response.sendRedirect("grades.jsp");
            }
            //When a grade is selected and the "reset" button is hit...
            else {
                //Start the grade reporting process over
                response.sendRedirect("index.jsp");
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

        /*response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            // TODO output your page here. You may use following sample code. 
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet GradesServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet GradesServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }*/
