package Day_15_WrapperClass;

public class WrapperClass {
    public static void main(String[] args) {

        // Integer first = new Integer(55); //deprecated

        Integer num1 = Integer.valueOf(88);

        Integer num2 = 55; //autoboxing

        int num = num2; //unboxing

        num1 = Integer.valueOf(66);

        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num);

        
    }
}
