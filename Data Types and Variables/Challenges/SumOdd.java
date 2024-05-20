import java.util.Scanner;

public class SumOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Sum odd addition");
        System.out.print("Please enter your number: ");
        int num = input.nextInt();
        int sum = OddSum(num);
        System.out.println("Oddsum till " + num + " is " + sum);

    }

    public static int OddSum(int num) {
        int sum = 0;
        int i = 1;
        while (i <= num) {
            sum += i;
            i += 2;

        }
        return sum;
    }
}