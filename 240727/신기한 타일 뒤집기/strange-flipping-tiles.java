import java.util.Scanner;

public class Main {    
    public static final int OFFSET = 100000;
    public static final int MAX_R = 200000; 
    
    
    public static int n;
    public static int[] a = new int[MAX_R + 1];   
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 입력
        n = sc.nextInt();
        
        // 현재 위치
        int cur = OFFSET;
        
        int l = MAX_R, r = 0;
        for(int i = 0; i < n; i++) {
            int distance = sc.nextInt() - 1;
            char direction = sc.next().charAt(0);
            
            if(direction == 'L') {
                a[cur] = 1;                
                for(int j = 0; j < distance; ++j){
                    a[--cur] = 1;                    
                }
                l = Math.min(l, cur);
            }
            else {
                a[cur] = 2;                
                for(int j = 0; j < distance; ++j){
                    a[++cur] = 2;                    
                }
                r = Math.max(r, cur);
            }           
        }
        
        int bcnt = 0;
        int wcnt = 0;        
        for(int i = l; i <= r; i++){
            if(a[i] == 1) ++wcnt;
            else if(a[i] == 2) ++bcnt;            

        }
        
        System.out.print(wcnt + " " + bcnt);
    }
}