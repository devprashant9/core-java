package Day_10_Encapsulation_2.in.knowledgegate;

import Day_10_Encapsulation_2.in.kgcoding.Protected;

public class TestProtected {
    public static void main(String[] args) {

        // can be accessed from different package like this
        Protected protected1 = new Protected(2546);
        System.out.println(protected1);

        // cannot be accessed from different package like this
        Protected protected2 = new Protected();
        // protected2.num = 456; // caanot find field
        System.out.println(protected2);
    }
}
