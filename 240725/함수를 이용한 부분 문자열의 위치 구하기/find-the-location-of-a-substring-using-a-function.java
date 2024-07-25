import java.util.*;

public class Main {

    static String str1, str2;

    public static int f() {
        
        int n = str1.length();
        int m = str2.length();

        for(int i = 0; i <= n - m; ++i){
            boolean isSub = true;
            
            for(int j = 0, k = i; j < m; ++j, ++k){
                if(str1.charAt(k) != str2.charAt(j)){
                    isSub = false;
                    break;
                }
            }
            if(isSub) return i;
        }
        
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        str1 = sc.next();
        str2 = sc.next();
        int idx = f();
        System.out.println(idx);
    }
}