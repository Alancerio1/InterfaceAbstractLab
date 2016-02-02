/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

/**
 *
 * @author alancerio18
 */
public abstract class ProgrammingCourse {
    //declared all the variables and gave them preset values.
   private final String courseName = "programming course";
   private final double credits = 0.0;
   private final int courseNumber = 000;
   private final String prerequisites = "classes";
   //Made them public so the other classes could grab them
    public String courseName() {
        return courseName;
    }
    public double credits(){
        return credits;
    }
    public int courseNumber(){
        return courseNumber;
    }
    public String prerequisites(){
        return prerequisites;
    }
   

}
