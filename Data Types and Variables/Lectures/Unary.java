public class Unary {
    public static void main(String[] args) {
        int x = 5;
        int y = -x;
        int z = 2-y;

        System.out.println(z);
        System.out.println(y);
        System.out.println(x);

        z++; //post increment

        System.out.println(z);
        ++z; //preincrement
        System.out.println(z);

        --z; // pre decrement
        System.out.println(z);

        System.out.println(z++);
        System.out.println(z);

        System.out.println(++z);
        System.out.println(z);
    }
}
