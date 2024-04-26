import java.util.Scanner;

public class AreaofTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Let's calculate Area of Triangle: ");
        System.out.print("Please enter your base value: ");
        int B = input.nextInt();
        System.out.print("Please enter your height value: ");
        int H = input.nextInt();
        float a = 0.5f;
        System.out.println("Your Area of Triangle is: " + a*B*H);


    }
}
