import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome to Oreoluwa's CGPA calculator");
        //loop through courses
        int totalPoint = 0;
        int totalUnit = 0;
        int numberOfCourses = 1;
        Courses newCourse = new Courses();
        for (;numberOfCourses <= 3; numberOfCourses ++) {
            System.out.println("\n-----------New Course------------\n");
            Scanner userInput = new Scanner(System.in);
            System.out.println("Enter Course title: ");
            String course = userInput.nextLine();
            System.out.println("Enter Grade in capital letter: ");
            String grade = userInput.nextLine();
            System.out.println("Enter unit: ");
            try {int unit = userInput.nextInt();
                if (unit <= 3){
                    totalUnit += unit;
                    /* Create Course Object */
                    newCourse.setCourse(course);
                    newCourse.setGrade(grade);
                    newCourse.setUnit(unit);
                    System.out.printf("you had a grade of %s in %s, a %d units course",newCourse.getGrade(),newCourse.getCourseTitle(),newCourse.getUnit());
                    totalPoint += calculatePoint(grade,unit);
                }
                else {
                    System.out.println("You can not use more than 3 units per course");
                    break;
                }
            }
            catch(Exception ex){
                System.out.println("\nTrying using a valid unit for this course\n"+ex.getMessage());
            }
        }
        double totalU = 5 * totalUnit;
        double newT = totalPoint/totalU;
        double cgpa = newT * 5;

        System.out.println("------------------ Generating your CGPA-------------------\n\n");
        System.out.printf("You CGPA is %.2f out of 5.00%n",cgpa);
        calculateGpDivision(cgpa);
    }
   public static int calculatePoint(String grade,int unit){
        int point = switch(grade){
            case "A" -> 5 * unit;
            case "B" -> 4 * unit;
            case "C" -> 3 * unit;
            case "D" -> 2 * unit;
            case "E" -> unit;
            case "F" -> 0;
            default -> throw new IllegalStateException("Unexpected value: " + grade);
        };
        return point;
   }
   public static void calculateGpDivision(double cgpa){
        if (cgpa >= 4.50)
            System.out.println("Great!, You have a first class cgpa");
        else if (cgpa >= 3.50)
            System.out.println("You have a second class upper grade");
        else if (cgpa < 3.50)
            System.out.println("Please put more effort"); // READ ON SOLID PRINCIPLES
   }
}