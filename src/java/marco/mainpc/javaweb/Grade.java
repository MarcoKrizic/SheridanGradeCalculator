/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package marco.mainpc.javaweb;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * This Java class is responsible for generating the grade attribute
 * derived from the user selecting their grades from the dropdown menu page.
 * These attributions are incorporated into an array through a servlet
 * that handles all grade calculation and relay tasks. 
 * @author Marco
 */
public class Grade implements Serializable {
    
    private String grade = "";
    public double gpa;
    
    /**
     * This method serves as the constructor for each new Grade instance created.
     */
    public Grade() {

    }
    
    /**
     * This method establishes a new grade to be registered from the web servlet
     * after the user has selected a grade entry from the web page.
     * @param grade Grade value selected by the user
     */
    public void setGrade (String grade) {
        this.grade = grade;
    }
    
    /** 
     * This method returns the String value associated with the selected grade value
     * so that it can be used and/or displayed on a web page.
     * @return Grade value
     */
    public String getGrade() {
        //gradesList.add(grade);
        return grade;
    }
    
    /**
     * This method establishes each grade-point average (GPA) value that corresponds 
     * to each grade value selected from the client end. This method is executed
     * when the user is done selecting grades and is ready to see results.
     * @param gpa GPA value generated by each of the user's grades
     */
    public void setGPAValue(double gpa) {
        if("A+ (90-100%)".equals(this.grade) || "A (80-89%)".equals(this.grade)) {
            gpa = 4;
        }
        else if("B+ (75-79%)".equals(this.grade)) {
            gpa = 3.5;
        }
        else if("B (70-74%)".equals(this.grade)) {
            gpa = 3;
        }
        else if("C+ (65-69%)".equals(this.grade)) {
            gpa = 2.5;
        }
        else if("C (60-64%)".equals(this.grade)) {
            gpa = 2;
        }
        else if("D (50-59%)".equals(this.grade)) {
            gpa = 1;
        }
        else if("F (0-49%)".equals(this.grade)) {
            gpa = 0;
        }
        this.gpa = gpa;
    }
    
    /** 
     * This method returns the double value associated with each GPA value
     * so that it can be used and/or displayed on a web page.
     * @return GPA values in the form of visible values
     */
    public double getGPAValue() {
        return gpa;
    }
    
}
