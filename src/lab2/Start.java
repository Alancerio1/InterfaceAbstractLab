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
        AdvancedJavaCourse advance = new AdvancedJavaCourse();
        IntroJavaCourse introJava = new IntroJavaCourse();
        IntroToProgrammingCourse introProgramming = new IntroToProgrammingCourse();
        
       advance.courseName();
       advance.courseNumber();
       advance.credits();
       
       introJava.courseName();
       introJava.courseNumber();
       introJava.credits();
       
       introProgramming.courseName();
       introProgramming.courseNumber();
       introProgramming.credits();
       
       
       /*
       I like using interfaces alot more than I do abstarct classes.It's alot easier and claner 
       to pass everything thorugh because you don't have to worry about the danger of inheritance.
       
       You can't use the subsitution principle because the classes aren't a subtype of the interface.
       */
    }
  
}
