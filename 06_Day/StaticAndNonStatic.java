public class StaticAndNonStatic {
    String name = "Prashant Kumar";
    int age1 = 24;
    static int age = 18;

    public boolean isVoter(){
        return(this.age1 >= age); //non static method can access static variables
    }
    public static void main(String[] args) {
        StaticAndNonStatic ob = new StaticAndNonStatic();
        String myName = ob.name; //accessing non-static variables
        System.out.println(myName);
        // name2 = name; //error: cannot acces non static though static reference

        System.out.println(age); //now we can access if we use static keyword in class
    }
}
