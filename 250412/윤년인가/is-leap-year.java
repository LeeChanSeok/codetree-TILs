import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int Y = sc.nextInt();
        
        
        String ans = "false";
        if(Y % 4== 0){
            if(Y % 100 == 0 && Y % 400 != 0) ans = "false";
            else ans = "true";
        }
        
        System.out.println(ans);
    }
}
