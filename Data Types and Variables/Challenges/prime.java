import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to prime number");
        System.out.print("Please enter your number: ");
        int num = input.nextInt();
        boolean isprime = isprime(num);
        if (isprime) {
            System.out.println("Your number is prime");
        } else {
            System.out.println("Your number is not prime");

        }

    }
    public static boolean isprime(int num) {
        int i =2;
        while (i < num) {
            if (num % i == 0) {
                return false;
            }
            i++;
        }

        return true;
    }
}
