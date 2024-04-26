import java.util.Scanner;

public class FahrantoCelsius {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Temperature converter from Fahrenheit to Celsius.

        System.out.print("Please enter your temperature in Fahrenheit: ");
        float Fahrenheit = input.nextFloat();

        float converter = (Fahrenheit - 32) * 5/9;

        System.out.print("\nHere is your temperature in Celsius: " + converter);
    }
}
