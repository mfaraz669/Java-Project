public class LearningIf {
    public static void main(String[] args) {
        boolean IsMale = false;
        String name = "Bob";

        System.out.println("before if");
        if (IsMale) {
            System.out.println("Mr " + name);
        } else {
            System.out.println("Ms " + name);
        }

        System.out.println("after if");

        boolean SeniorCitizen = false;
        boolean Adult = false;


        if (SeniorCitizen) {
            System.out.println("Hello old man");
        } else {
            if (Adult) {
                System.out.println("Hello Adult");
            } else {
                System.out.println("Hello Child");
            }
            
        }


    }
}
