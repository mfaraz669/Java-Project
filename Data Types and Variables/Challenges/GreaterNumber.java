import java.util.Scanner;

public class GreaterNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Let's find the greatest number from 3");
        System.out.print("Please enter your first number: ");
        int first = input.nextInt();
        System.out.print("Please enter your second number: ");
        int second = input.nextInt();
        System.out.print("Please enter your third number: ");
        int third = input.nextInt();

        if (first >= second && first>=third) {
            System.out.println("First is greater than others");
        } else if (second >=third) {
            System.out.println("Second is greater than others");

        } else {
            System.out.println("Third is greater");
        }


    }
}