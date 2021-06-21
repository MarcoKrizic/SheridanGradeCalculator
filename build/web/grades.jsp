<%-- 
    Document   : grades
    Created on : Oct. 31, 2020, 12:31:38 p.m.
    Author     : Marco
--%>


<%@page import="marco.sheridancollege.mainpc.javaweb.Grade"%>
<%@page import="java.util.ArrayList" %>
<%@page import="java.util.stream.DoubleStream"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Sheridan Academic Standing Calculator</title>
    </head>
    <body>
        <%
            //Initializing array of Grade instances before loading the results page
            ArrayList<Grade> grades = (ArrayList<Grade>) session.getAttribute("grades");
        %>
          
        <h1>Sheridan Academic Standing Calculator</h1>
        <br>
        
        <h2>Grades</h2>
        <% 
            //If no grades are present in the Grade array list, display this phrase
            if (grades == null || grades.size() == 0) {
        %> 
            There are currently no grades present.
        <% }
            else {
            //Setting up variables needed for displaying Academic Standing
                String standing = "";
                double total = 0;
                double average = 0;
            //First for loop calling the grades and GPA values
                for (Grade grade: grades) {
            //Grade values must be set before they can be transferred from the input
                grade.setGPAValue(grade.gpa);
                
        %>
        <ul>
            <li><%=grade.getGrade() + " - " + grade.getGPAValue()%></li>
        </ul>
        
        
            <%  }
                //Second for loop that adds up each GPA value tied to corresponding grades
                for (Grade grade: grades) {
                    grade.setGPAValue(grade.gpa);
                    total += grade.getGPAValue();
                }

                //Calculating average
                average = total / grades.size();
                
                //Academic Standing conditionals
                if (average <= 4.0 && average >= 3.8) {
                    standing = "Academic Scholar";
                }
                else if (average < 3.8 && average >= 3.5) {
                    standing = "Honours";
                }
                else if (average < 3.5 && average >= 2.0) {
                    standing = "Good";
                }
                else if (average < 2.0 && average >= 1.8) {
                    standing = "Conditional Pass";
                }
                else if (average < 1.8 && average >= 1.2) {
                    standing = "Academic Probation";
                }
                else if (average < 1.2 && average >= 0)  {
                    standing = "Cannot Continue";
                }
         
        %>
         <br>
         <h1>Your Academic Standing is: <%=standing%></h1>
        <%}%>
        
        <p style="font-size: 16px">
            <a href="index.jsp">start over</a>
        </P>
        
        
    </body>
</html>
