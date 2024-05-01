public class Function {
    public static void main(String[] args) {
        System.out.println("Good Morning");
        greetIng();
        System.out.println("Method completed");
    }

    public static void greetIng() { //doesn't show message if we dont use static
        System.out.println("Good afternoon");
    }
}
