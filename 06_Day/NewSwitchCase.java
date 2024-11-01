public class NewSwitchCase {
    public static void main(String[] args) {
        int a = 2;
        String output = switch(a) {
            case 1 -> "One";
            case 2 -> "Two";
            case 3 -> "Three";
            case 4 -> "Four";
            default -> "Wrong Choice";
        };
        System.out.println(output);
    }
}
