package lab1;

import javax.swing.JOptionPane;

/**
 * Describe responsibilities here.
 *
 * @author      your name goes here
 * @version     1.00
 */
public class AdvancedJavaCourse extends ProgrammingCourse {
    //initalized all my varibales so thet advanced java course has it.
    private String courseName = "Advanced Java";
    private double credits = 4.0;
    private int courseNumber = 400;
    private String prerequisites = "Intro java course and intro to programming";
    //added an override method so that it will fit to the class.
    @Override
    public String courseName(){
        return courseName;
    }
    @Override
    public double credits(){
        return credits;
    }
    @Override
    public int courseNumber(){
        return courseNumber;
    }
    public String prerequisites(){
        return prerequisites;
    }
    
    
    

   

   
    
}
