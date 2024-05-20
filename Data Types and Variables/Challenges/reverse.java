import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        int num, reverse;

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your number to reverse it: ");
        num = input.nextInt();

        while (num > 0) {
            reverse = num % 10;
            System.out.print(reverse);
            num = num / 10;
        }
    }
}