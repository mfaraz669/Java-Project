import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to factorial calculation");
        System.out.print("Please enter your number: ");
        int num = input.nextInt();
        long fact = 1;
        Factorial(num);

    }
    public static int Factorial(int num) {
        long fact = 1;
        for (int i=1; i<=num; i++) {
            fact = fact * i;
        }
        System.out.println("Factorial is " + fact);
        return num;
    }

}