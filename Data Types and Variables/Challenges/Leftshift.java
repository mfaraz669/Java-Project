import java.util.Scanner;

public class Leftshift {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Let's calculate the bitwise leftshift");
        System.out.print("Please enter your number: ");
        int first = input.nextInt();
        int result = first << 1;

        System.out.println("Result is " + result);
    }
}

