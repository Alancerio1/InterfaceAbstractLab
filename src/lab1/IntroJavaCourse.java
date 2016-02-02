package lab1;

/**
 * Describe responsibilities here.
 *
 * @author      your name goes here
 * @version     1.00
 */
public class IntroJavaCourse extends ProgrammingCourse{
    //initalized all my varibales so thet intro to java course has it.
    private String courseName = "Intro to java course";
    private double credits = 3.0;
    private int courseNumber = 300;
    private String prerequisites ="intro to programming course";
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
