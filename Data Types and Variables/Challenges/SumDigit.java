import java.util.Scanner;

public class SumDigit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("\nWelcome to SumDigit Calculator\n");
        System.out.print("Please enter your number: ");
        int num = input.nextInt();
        SumDigit(num);

    }

    public static int SumDigit(int num) {
        int sum = 0;
        int r;
        while (num > 0) {
            r = num % 10;
            sum = r + sum;
            num = num / 10;

        }
        System.out.println("\nSum of Digit is: "+ sum);
        return sum;
    }
}