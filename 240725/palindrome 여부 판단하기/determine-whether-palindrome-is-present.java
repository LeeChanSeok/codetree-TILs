import java.util.*;

public class Main {
    public static boolean palindrome(String s) {
        
        int len = s.length();

        for(int i = 0; i <= len/2; ++i){
            if(s.charAt(i) != s.charAt(len - 1 - i)) return false;
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.next();


        String ans = "No";
        if(palindrome(str)) ans = "Yes";
        System.out.print(ans);
    }
}