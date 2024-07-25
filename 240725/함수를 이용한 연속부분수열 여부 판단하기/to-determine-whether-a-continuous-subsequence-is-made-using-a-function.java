import java.util.*;

public class Main {

    static int n1, n2;
    static int[] A, B;

    public static boolean f(){
        if(n1 < n2) return false;

        for(int i = 0; i < n1; ++i){
            boolean isTrue = true;
            for(int j = 0, k = i; j < n1 - n2; ++j, ++k){
                if(A[k] != B[j] ){
                    isTrue = false;
                    break;
                }

            }
            if(isTrue) return true;
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n1 = sc.nextInt();
        n2 = sc.nextInt();

        A = new int[n1];
        B = new int[n2];

        for(int i = 0; i < n1; ++i){
            A[i] = sc.nextInt();
        }

        for(int i = 0; i < n2; ++i){
            B[i] = sc.nextInt();
        }
        String ans = "No";
        if(f()) ans = "Yes";

        System.out.println(ans);
    }
}