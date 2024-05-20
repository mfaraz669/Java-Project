public class Parameter {
    public static void main(String[] args) {
        System.out.println(sumTwoNumber(4,7));
        System.out.println(sumTwoNumber(5,9));


    }
    public static int sumTwoNumber (int first, int second) {
        System.out.println("First number received: " + first);
        System.out.println("Second number received: " + second);
        return first + second;
    }

}
