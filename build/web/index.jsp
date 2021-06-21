<%-- 
    Document   : index
    Created on : Oct. 29, 2020, 10:33:24 p.m.
    Author     : Marco
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="marco.sheridancollege.mainpc.javaweb.Grade"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Sheridan Academic Standing Calculator</title>
    </head>
    <body>
        <%
        //Refreshing array of Grade instances after user starts a new report
        ArrayList<Grade> grades = (ArrayList<Grade>) session.getAttribute("grades");
        if (grades != null) {
            grades.clear();
        }
        %>        
        <h1>Sheridan Academic Standing Calculator</h1>
        <br>
        
        <p style="font-size: 16px">Progress through our program and eligibility
            for the diploma is dependent<br> upon successful completion of ALL required
            program courses in good Academic Standing. <br>This calculator will let
            you know your Academic Standing based on the grades of your courses.<br>
            You will need to enter the grades for all the courses you took. </p>
        <br><br>
        <br><br>
        
        <p style="font-size: 16px">Click Start to begin.</p>
        <input type="submit" name="start" value="Start" onclick="window.location='courses.jsp'">
        <br>
        
        <p style="font-size: 16px">see 
            <a href=http://trantor.sheridanc.on.ca/webct/general/archdept_policies/academic_guidelines.html>
                academic guidelines</a>
            for details</p>
        <br>
        
        
    </body>
</html>

