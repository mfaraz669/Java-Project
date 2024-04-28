import java.util.Scanner;

public class Logical {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Delhi Metro Ticket Online Counter");
        System.out.print("Please enter your age: ");
        int age = input.nextInt();
        System.out.print("Are you female True/False: ");
        boolean IsFemale = input.nextBoolean();

        if (age < 5) {
            System.out.println("You are eligible for free ticket");
        } else if (IsFemale) {
            System.out.println("You are eligible for 50% off");
        } else if (age > 60 && !IsFemale) {
            System.out.println("You are eligible for 25% off");
        } else {
            System.out.println("You are not eligible for any discount");
        }

    }
}
