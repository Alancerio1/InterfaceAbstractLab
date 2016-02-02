/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

/**
 *
 * @author alancerio18
 */
public class Start {
    public static void main(String[] args) {
        //creating objects for the classes
        AdvancedJavaCourse advance = new AdvancedJavaCourse();
        IntroJavaCourse introJava = new IntroJavaCourse();
        IntroToProgrammingCourse introProgramming = new IntroToProgrammingCourse();
        //setting the varibales to be used
      advance.setCourseName("Advanced Java");
      advance.setCourseNumber("300");
      advance.setCredits(3);
      advance.setPrerequisites("intro to java, intro to programming");
      
      introJava.setCourseName("Intro to java");
      introJava.setCourseNumber("200");
      introJava.setCredits(2);
      introJava.setPrerequisites("Intro to programmming");
      
      introProgramming.setCourseName("Intro to programming");
      introProgramming.setCourseNumber("100");
      introProgramming.setCredits(1);
      introProgramming.setPrerequisites("none");
      //prinitng out everything
        System.out.println("course name:" +advance.getCourseName() + " \n" + "course number:" +
                advance.getCourseNumber() + "\n" + "Prerequisites:" + advance.getPrerequisites() + 
                " \n" + "credits:" + advance.getCredits()  );
        
        System.out.println("\n");
        
        System.out.println("course name:" +introJava.getCourseName() + " \n" + "course number:" +
                introJava.getCourseNumber() + "\n" + "Prerequisites:" + introJava.getPrerequisites() + 
                " \n" + "credits:" + introJava.getCredits()  );
        
        System.out.println("\n");
        
        System.out.println("course name:" +introProgramming.getCourseName() + " \n" + "course number:" +
                introProgramming.getCourseNumber() + "\n" + "Prerequisites:" + introProgramming.getPrerequisites() + 
                " \n" + "credits:" + introProgramming.getCredits()  );
        
        
       
       /*
       I like using interfaces alot more than I do abstarct classes.It's alot easier and claner 
       to pass everything thorugh because you don't have to worry about the danger of inheritance.
       
       You can't use the subsitution principle because the classes aren't a subtype of the interface.
       */
    }
  
}
