import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to LCM");
        System.out.print("Please enter your first number: ");
        int first = input.nextInt();
        System.out.print("Please enter your second number: ");
        int second = input.nextInt();
//        int lcm = lcm(first, second);
//        System.out.println("LCM of two numbers is: " + lcm);
        lcm(first,second);
    }

    public static int lcm(int first, int second) {
        int lcm = Math.max(first, second);
        while (true) {
            if (lcm % first ==0 && lcm % second==0) {
                System.out.println("LCM of number is: " + lcm);
                break;
            }
            ++lcm;

        }
        return lcm;
    }
}
