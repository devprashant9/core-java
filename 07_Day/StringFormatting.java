public class StringFormatting {
    public static void main(String[] args) {
        String name = "Prashant";
        int marks = 90;
        System.out.println("Name: " + name + " Marks: " + marks);
        System.out.printf("Name: %s and Marks: %d \n", name, marks);
        System.out.println("========================");
        System.out.printf("%10s \n", "Java");
        System.out.printf("%0-10s \n", "Java");
        System.out.printf("%10S \n", "Java");

    }
}
