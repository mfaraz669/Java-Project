import java.util.Scanner;

public class NumberGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to local calculator");
        System.out.print("Please enter your first number: ");
        int FirstNumber = input.nextInt();
        System.out.print("Please enter your second number: ");
        int SecondNumber = input.nextInt();
        int sum = FirstNumber + SecondNumber;
        System.out.println("Your total number is: " + sum);
    }
}
