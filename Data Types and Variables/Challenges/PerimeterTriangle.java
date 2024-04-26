import java.util.Scanner;

public class PerimeterTriangle {
    public static void main(String[] args) {
        System.out.println("Perimate of Rectangle Calculation");
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter value of A: ");
        int A = input.nextInt();
        System.out.print("Please enter value of B: ");
        int B = input.nextInt();
        System.out.print("Please enter value of C: ");
        int C = input.nextInt();
        System.out.print("Please enter value of D: ");
        int D = input.nextInt();

        System.out.println("Area of Rectangle is: " + (A+B+C+D));

        //in floating/double number
        System.out.println("Please enter your all four values of double: ");

        double X = input.nextDouble();
        double Y = input.nextDouble();
        double Z = input.nextDouble();
        double Q = input.nextDouble();

        System.out.println("Here is the Perimeter Triangle of double: " + (X+Y+Z+Q) + "cms");

    }
}
