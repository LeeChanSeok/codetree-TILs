import java.util.*;

public class Main {

    public static boolean f(String str){

        char c = str.charAt(0);
        int len = str.length();

        for(int i = 1; i < len; ++i){
            if(str.charAt(i) != c) return true;
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        
        String ans = "No";
        if(f(str)) ans = "Yes";

        System.out.println(ans);
    }
}