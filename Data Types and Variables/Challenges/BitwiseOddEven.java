import java.util.Scanner;

public class BitwiseOddEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Let's find out the odd/even with the help of bitwise operator");
        System.out.print("Please enter your first number: ");
        int first = input.nextInt();
        System.out.print("Please enter your second number: ");
        int second = input.nextInt();

        int result = first & second;

        System.out.println("Result is " + result);

        if (result % 2 ==0) {
            System.out.println("Bitwise is even");
        } else {
            System.out.println("Bitwise is odd");
        }


    }
}
