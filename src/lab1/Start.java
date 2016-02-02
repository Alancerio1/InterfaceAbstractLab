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
    
        //This allows for liskov substitution
        ProgrammingCourse h = new IntroJavaCourse();
      
        //printed out h to fit each variable
        System.out.print("course name: " + h.courseName() + "\n"
                        +"course credits: " + h.credits()+ "\n"
                        +"course number: " + h.courseNumber() +"\n"
                        +"prerequisites: " + h.prerequisites()
        );
              
        /*
         This is a good way to qucikly add in alot of methods to every class.
         But then you have to worry about the dangers of inheritance.
         You do get the added benefit of being able to use polymorphism.
         */
    }
}
