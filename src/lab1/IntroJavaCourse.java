package lab1;

/**
 * Describe responsibilities here.
 *
 * @author      your name goes here
 * @version     1.00
 */
public class IntroJavaCourse extends ProgrammingCourse{

    public String getCourseName(){
        return"Intro java";
        }
    public  double getCredits(){
        return 3;
    }
    public int getCourseNumber(){
        return 200;
    }
    public String getPrerequisites(){
      return "Intro to programming";
   }

   

   

        public void setCredits(double credits) {
        if(credits < 0 || credits > 5.0) {
            System.out.println(
                    "Error: credits must be in the range 0.5 to 4.0");
            System.exit(0);
        }
        this.setCredits(credits);
    }

}
