public class ArrayImplement {
    public static void main(String[] args) {
        int[] myArray = new int[5];
        int[] array = {45, 68, 98, 56};

        myArray[0] = 90; //initializing values to first array
        myArray[4] = 80;
        myArray[2] = 40;
        myArray[3] = 55;
        myArray[1] = 100;

        System.out.println(myArray[0]);
        System.out.println(myArray[2]);
        System.out.println(myArray[1]);
        System.out.println(myArray[4]);

        System.out.println("========");

        System.out.println(array[0]);
        System.out.println(array[3]);

        System.out.println("========");
        int index = 0;
        while(index < 5){
            System.out.println(myArray[index]); // printing using loops
            index++;
        }
    }
}