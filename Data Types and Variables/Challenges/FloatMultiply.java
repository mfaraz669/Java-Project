import java.util.Scanner;

public class FloatMultiply {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your float one: ");
        float one = input.nextFloat();
        System.out.print("Please enter your float two: ");
        float two = input.nextFloat();

        float multi = one * two;

        System.out.println("Here is the multiplication " + multi);
    }
}
