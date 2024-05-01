import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        int num = 1;
        while (num <= 100) {
            System.out.println(num);
            num = num + 1; //or num -= 1
        }

//        int numb = 500;
//        while (numb >= 200) {
//            System.out.println(numb);
//            numb = numb - 1;
//        }

         Scanner input = new Scanner(System.in);
         int i = 0;
         while (i < 5) {
             int inp = input.nextInt();
             System.out.println("\nNumber is " + inp);
             i = i + 1; //or i++
         }


    }
}
