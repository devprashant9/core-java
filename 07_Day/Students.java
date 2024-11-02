public class Students {
    String name = "Prashant";
    int age = 24;

    @Override
    public String toString() {
        return("Name is: " +name+ " and Age is: " +age);
    }
    public static void main(String[] args) {
        Students ob = new Students();
        System.out.println(ob);
        System.out.println(ob.toString());
    }
}
