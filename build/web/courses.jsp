<%-- 
    Document   : courses
    Created on : Oct. 30, 2020, 1:20:11 p.m.
    Author     : Marco
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Sheridan Academic Standing Calculator</title>
    </head>
    <body>
        
        <h1>Sheridan Academic Standing Calculator</h1>
        <br>
        
        <form action="GradesServlet" method="GET">
        <label for="grade" style="font-size: 16px">
            Course Grade
        </label>
        <select id="grade" name="grade">
            <option value="A+ (90-100%)">A+ (90-100%)</option>
            <option value="A (80-89%)">A (80-89%)</option>
            <option value="B+ (75-79%)">B+ (75-79%)</option>
            <option value="B (70-74%)">B (70-74%)</option>
            <option value="C+ (65-69%)">C+ (65-69%)</option>
            <option value="C (60-64%)">C (60-64%)</option>
            <option value="D (50-59%)">D (50-59%)</option>
            <option value="F (0-49%)">F (0-49%)</option>
        </select>
        <br>
        
        <input type="submit" name="addgrade" value="next" onclick="window.location='courses.jsp'">
        <input type="submit" name="addgrade" value="done" onclick="window.location='grades.jsp'">
        <input type="submit" name="addgrade" value="reset" onclick="window.location='index.jsp'">
        </form>
        
    </body>
</html>
