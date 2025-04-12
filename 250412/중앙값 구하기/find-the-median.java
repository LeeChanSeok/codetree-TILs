import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        
        
        int ans = A;
        if((A > B && B > C) || (C > B && B > A)){
            ans = B;
        } else if((A > C && C > B) || (B > C && C > A)){
            ans = C;
        } else if((B > A && A > C) || (C > A && A > B)){
            ans = A;
        }
        
        System.out.println(ans);
    }
}
