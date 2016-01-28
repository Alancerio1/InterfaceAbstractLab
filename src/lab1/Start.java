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
        ProgrammingCourse h = new IntroToProgrammingCourse();
        
        System.out.print("course name:" + h.getCourseName()+"\n" +
                           "course number:" + h.getCourseNumber() + "\n" +
                           "credits:"+ h.getCredits());
    }
}
