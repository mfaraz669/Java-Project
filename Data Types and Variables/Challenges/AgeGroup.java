import java.util.Scanner;

public class AgeGroup {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Let's find out your Age Group\n");
        System.out.print("Please enter your age: ");
        int age = input.nextInt();

        if (age >= 60 && age <= 120) {
            System.out.println("You are senior citizen");
        } else if (age >= 20 && age <= 59) {
            System.out.println("You are adult");
        } else if (age >=13 && age <= 19) {
            System.out.println("You are Teen");
        } else if (age >= 120) {
            System.out.println("Your age is invalid");
        } else {
            System.out.println("You are Child");
        }
    }
}
