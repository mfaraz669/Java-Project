import java.util.Scanner;

public class Bitwise {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Let's caculate bitwise number\n");
        System.out.print("Please enter your number: ");
        int first = input.nextInt();
        System.out.print("Please enter your second number: ");
        int second = input.nextInt();

        int result = first & second;

        System.out.println("Result is " + result);
    }
}
