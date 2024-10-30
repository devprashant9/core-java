public class Function {
    public static void main(String[] args) {
        message1();

        String m2 = message2("Hello World Java");
        System.out.println(m2);
    }

    public static void message1(){
        System.out.println("Hello World");
    } // returns nothing

    public static String message2(String s){
        return(s);
    } // returns a String

}
