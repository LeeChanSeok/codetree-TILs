import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
            
        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();

        //                                1.  2.  3.  4.  5.  6.  7.  8.  9. 10. 11. 12.
        int[] num_of_days = new int[]{0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        int elapsedDays = -d1;
        for(int i = m1; i < m2; ++i){
            elapsedDays += num_of_days[i];
        }
        elapsedDays += d2;

        if(elapsedDays < 0) elapsedDays += (7 * 100);
        elapsedDays %= 7;

        String[] day = new String[]{"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun" };

        System.out.print(day[elapsedDays]);
    }
}