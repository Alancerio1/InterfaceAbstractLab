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
public class Start {

    public static void main(String[] args) {
        AdvancedJavaCourse advance = new AdvancedJavaCourse();
        IntroJavaCourse introJava = new IntroJavaCourse();
        IntroToProgrammingCourse Intro = new IntroToProgrammingCourse();
        
        ProgrammingCourse h = new AdvancedJavaCourse();

        System.out.print("course name:" + h.getCourseName() + "\n"
                + "course number:" + h.getCourseNumber() + "\n"
                + "credits:" + h.getCredits() + "\n"
                + "Prerequisites:" + h.getPrerequisites());

        /*
         This is a good way to qucikly add in alot of methods to every class.
         But then you have to worry about the dangers of inheritance.
         You do get the added benefit of being able to use polymorphism.
         */
    }
}
