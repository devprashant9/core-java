package Day_15_Challenge;

public class Concatenate {
    public static void main(String[] args) {
        concatenation("prashant", "kumar", "jha");
    }

    public static void concatenation(String... s) {
        String finalString = "";
                for (String s2 : s) {
                    finalString = finalString + s2 + " ";
        }
        System.out.println(finalString);
    }
}
