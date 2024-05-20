import java.util.Scanner;

public class reverser {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n,r;
        n = input.nextInt();

        while (n > 0) {
            r = n % 10;
            n = n / 10;
            System.out.println("Reverse number is " + r);
        }
    }
}
