import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Let's find out the leap year");
        System.out.print("Please enter year: ");
        int year = input.nextInt();

        if (year % 400 == 0 ) {
            System.out.println("Your year is leap year");
        } else if (year % 100 !=0 && year % 4 == 0) {
            System.out.println("Your year is leap year");
        } else {
            System.out.println("Your year is not leap year");
        }

        //or if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))
    }
}
