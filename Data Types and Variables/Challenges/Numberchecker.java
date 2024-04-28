import java.util.Scanner;

public class Numberchecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your number: ");
        int number = input.nextInt();

        if (number < 0) {
            System.out.println("Your number is negative");
        } else if (number > 0) {
            System.out.println("Your number is positive");
        } else {
            System.out.println("Your number is zero");
        }
    }
}
