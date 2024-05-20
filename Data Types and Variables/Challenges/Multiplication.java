import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
        System.out.println("Welcome to multiplication table");
        System.out.print("Please enter your number: ");
        int num = input.nextInt();
        PrintMultiplication(num);
    }

    public static void PrintMultiplication(int num) {
        int i = 1;
        while (i <= 10) {
            System.out.println(num + " X " + i + " =" + (num * i));
            i++;
        }

    }
}
