package lab1;

import javax.swing.JOptionPane;

/**
 * Describe responsibilities here. NOTE: this class has NO PREREQUISITES! Do not
 * change this fact.
 *
 * @author your name goes here
 * @version 1.00
 */
public class IntroToProgrammingCourse extends ProgrammingCourse {
    //initalized all my varibales so thet intro programming course has it.
    private String courseName = "Intro to programming course";
    private double credits = 1.0;
    private int courseNumber = 100;
    private String prerequisites = "none";
        //added an override method so that it will fit to the class.

    @Override
    public String courseName() {
        return courseName;
    }

    @Override
    public double credits() {
        return credits;
    }

  
    @Override
    public int courseNumber() {
        return courseNumber;
    }


    @Override
    public String prerequisites() {
        return prerequisites;
    }


   
    

}
