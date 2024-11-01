import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String str = sc.nextLine();
        System.out.println(palindromeString(str));

        sc.close();
    }
    public static boolean palindromeString(String str){
        if(str.length() <= 1) return(true);
        if(str.charAt(0) != str.charAt(str.length() - 1)) return(false);
        return(palindromeString(str.substring(1, str.length() - 1)));
    }
}
