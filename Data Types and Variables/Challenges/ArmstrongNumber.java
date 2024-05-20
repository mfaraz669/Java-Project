import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Let's find out the armstrong number");
        System.out.print("Please enter your number: ");
        int num = input.nextInt();
        boolean isArmstrong = isArmstrong(num);
        if (isArmstrong) {
            System.out.println("Your number is Armstrong");
        } else {
            System.out.println("Not Armstrong");
        }
    }
    public static boolean isArmstrong(int num) {
        int rem = num;
        int noOfDigits = noOfDigits(num);
        System.out.println("Number of digits are: " + noOfDigits);
        int finalNumber = 0;
        while (num > 0) {
            int lastDigit = num % 10;
            num /= 10;
            finalNumber += pow(lastDigit, noOfDigits);

        }

        return finalNumber == rem;
    }

    public static int pow(int num1, int num2) {
        int result = num1;
        int i = 1;
        while (i < num2) {
            result *= num1;
            i++;
        }
        return result;
    }

    public static int noOfDigits(int num) {
        int digits = 0;
        while (num > 0) {
            digits++;
            num /= 10;
        }

        return digits;
    }
}
