public class Factorial {
    public static void main(String[] args) {
        Factorial ob = new Factorial();
        int result =  ob.factorial(5, 1);
        System.out.println(result);
    }
    public int factorial(int num, int fact){
        if(num == 1 || num == 0) return fact;
        else {
            fact *= num;
        }
        return(factorial(num - 1, fact));
    }
}
