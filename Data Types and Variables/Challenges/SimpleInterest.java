import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Calculator of simple interest rate");
        System.out.print("Please enter your Principle amount: ");

        double Principle = input.nextDouble();
        System.out.print("Now, please enter your rate of interest: ");
        double rate = input.nextDouble();
        System.out.print("Please enter your time in years: ");
        double time = input.nextDouble();

        double SimpleInterest = (Principle * rate * time)/100;

        System.out.println("\nYour Simple Interest rate amount is: " + SimpleInterest);
    }
}
