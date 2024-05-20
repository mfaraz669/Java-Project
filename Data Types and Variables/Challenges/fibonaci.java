import java.util.Scanner;

public class fibonaci {
    public static void main(String[] args) {
        int term, a=0, b=1, c;
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your term: ");
        term = input.nextInt();

        for (int i = 1; i<= term; i++) {
            System.out.print(a + " ");
            c = a+b;
            a = b;
            b = c;
        }
    }
}
