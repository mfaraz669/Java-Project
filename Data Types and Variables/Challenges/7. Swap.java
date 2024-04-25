import java.util.Scanner;

class Swap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to swapping");
        System.out.print("Please enter your A value: ");
        int a = input.nextInt();
        System.out.print("Please enter your B value: ");
        int b = input.nextInt();

        int c = a;
        a = b;
        b = c;


        System.out.println("Swapping done");
        System.out.println("Value of A is: " + a);
        System.out.println("Value of B is: " + b);

    }
}
