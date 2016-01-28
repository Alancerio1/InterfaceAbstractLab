package lab2;

/**
 * Describe responsibilities here.
 *
 * @author      your name goes here
 * @version     1.00
 */
public class IntroJavaCourse implements ProgrammingCourse{
    
 


       IntroJavaCourse(){
            
        }

    public void courseName() {
        System.out.println("Intro to Java");
    }

    public void courseNumber() {
        System.out.println(200);
    }

    public void credits() {
        System.out.println(2);

    }
      public void prerequisites() {
        System.out.println("Intro to programming course");
    }
    
}
