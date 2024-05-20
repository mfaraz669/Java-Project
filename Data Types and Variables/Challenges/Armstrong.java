import java.util.Scanner;
//3 digit armstrong number

public class Armstrong {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Let's find out the number whether it's armstrong or not");
        System.out.print("Please enter your number: ");
        int num = input.nextInt();
        int rem, arm=0, c;
        c=num;

        while (num > 0) {
            rem = num % 10;
            arm = (rem * rem * rem) + arm;
            num = num / 10;
        }
        if (c==arm) {
            System.out.println("Armstrong number");
        } else {
            System.out.println("Not Armstrong number");
        }


    }
}
