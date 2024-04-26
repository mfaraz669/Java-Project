import java.util.Scanner;

public class Arithmetic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your number : ");
        int x1 = input.nextInt();
        System.out.println(x1);
        System.out.print("Please enter your second number:");
        int x2 = input.nextInt();
        System.out.println(x2);
        System.out.println("Here is the addition: " + (x1+x2));
        System.out.println("Here is the multiplication: " + x1*x2);
        System.out.println("Here is the substraction: " + (x1-x2));
        System.out.println("Here is the division: " + (x1/x2));
        System.out.println("Here is the percentile: " + (x1%x2));

    }
}
