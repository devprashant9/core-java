package Day_15_VarArgs;

public class AfterVarArgs {
    public static void main(String[] args) {
        sum(4);
        sum(4, 5, 8, 10);
        sum(10, 90, 60, 40);
        sum(new int [] {10, 20, 60, 80});
    }

    public static void sum(int... a){
        int sum = 0;
        for (int i : a) {
            sum += i;
        }
        System.out.println(sum);
    }
}
