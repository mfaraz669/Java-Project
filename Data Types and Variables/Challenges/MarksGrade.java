import java.util.Scanner;

public class MarksGrade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Let's calculate the Grades of students");
        System.out.print("Dear Student please enter your marks in number out of 100: ");
        int marks = input.nextInt();

        if (marks >= 90 && marks <= 100) {
            System.out.println("Excellent you got 'A' Grade");
        } else if (marks >= 75 && marks <= 89) {
            System.out.println("Well done you got 'B' Grade");
        } else if (marks >= 60 && marks <= 74) {
            System.out.println("Good Job, you got 'C' Grade");            
        } else if (marks >= 30 && marks <= 59) {
            System.out.println("Just passed, you got 'D' Grade");
        } else if (marks >= 101) {
            System.out.println("Please enter valid marks");
        } else {
            System.out.println("You got 'E' Grade and you failed ");
        }
    }
}
