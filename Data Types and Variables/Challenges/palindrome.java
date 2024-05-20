import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to palindrome number");
        System.out.print("Please enter your number: ");
        int num = input.nextInt();
        boolean isPalindrome =isPalindrome(num);
        if (isPalindrome) {
            System.out.println("Your number is Palindrome");
        } else {
            System.out.println("Your number is not Palindrome");
        }


    }
    public static boolean isPalindrome(int num) {
        return false;

    }

    public static int reverse(int num) {
        int newNum = 0;
        while (num > 0) {
            int digit = num % 10;
            newNum = newNum * 10 + digit;
            num /= 10;
        }


    }
}
