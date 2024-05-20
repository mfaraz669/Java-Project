import java.util.Scanner;

public class EvenSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to even odd calculation");
        System.out.print("Please enter your even number: ");
        int num = input.nextInt();
        int sum = EvenSum(num);
        System.out.println("Your even sum till " + num + " is " + sum);

    }

    public static int EvenSum(int num) {
        int sum = 0;
        int i = 2;
        while (i <= num) {
            sum += i;
            i += 2;
        }
        return sum;
    }
}
