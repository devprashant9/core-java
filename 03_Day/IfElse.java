public class IfElse {
    public static void main(String[] args) {
        boolean isMale = true;
        String name = "Bob";

        if(isMale) {
            System.out.println("Mr. " + name);
        }

        boolean isFemale = false;

        if(isFemale) {
            System.out.println("Ms. " + name);
        } else {
            System.out.println("Mr. " + name);
        }
    }
}
