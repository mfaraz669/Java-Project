import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your Principle amount: ");
        int principle = input.nextInt();
        System.out.print("Please enter your rate of interest: ");
        float rate = input.nextFloat();
        System.out.print("Please enter your number of years: ");
        float time = input.nextFloat();
        //float partial = (1 + rate)/100;

        //float Compound_Interest = principle * partial * time;
        double Compound_Interest = principle * Math.pow((1 + rate / 100), time);
        System.out.println("\nYour compound interest rate is :" + Compound_Interest);

    }
}
