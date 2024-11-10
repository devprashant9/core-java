package Day_15_VarArgs;

public class BeforeVarArgs {
    public static void main(String[] args) {
        sum(new int[] {4});
        sum(new int[] {4, 5});
        sum(new int[] {4, 5, 8, 10, 12, 45});
    }

    public static void sum(int[] a){
        int sum = 0;
        for (int i : a) {
            sum += i;
        }
        System.out.println(sum);
    }
}
