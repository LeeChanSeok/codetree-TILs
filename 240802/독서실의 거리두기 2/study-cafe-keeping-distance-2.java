import java.util.Scanner;

public class Main {
    public static final int INT_MAX = Integer.MAX_VALUE;

    public static int n;
    public static char[] seats;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        seats = sc.next().toCharArray();

        int maxDist = 0;
        int maxI = 0, maxJ = 0;
        for(int i = 0; i < n; i++) {
            if(seats[i] == '1') {
                for(int j = i + 1; j < n; j++)
                    if(seats[j] == '1') {
                        if(j - i > maxDist) {
                            maxDist = j - i;

                            maxI = i;
                            maxJ = j;
                        }

                        break;
                    }
            }
        }

        int d1 = INT_MAX;
        seats[(maxI + maxJ) / 2] = '1';
        for(int i = 0; i < n; i++) {
            if(seats[i] == '1') {
                for(int j = i + 1; j < n; j++)
                    if(seats[j] == '1') {
                        d1 = Math.min(d1, j - i);
                        
                        break;
                    }
            }
        }
        seats[(maxI + maxJ) / 2] = '0';
        
        int d2 = 0;
        if(seats[0] == '0') {
        	d2 = INT_MAX;
        	seats[0] = '1';
        	for(int i = 0; i < n; i++) {
                if(seats[i] == '1') {
                    for(int j = i + 1; j < n; j++)
                        if(seats[j] == '1') {
                            d2 = Math.min(d2, j - i);
                            
                            break;
                        }
                }
            }
        	seats[0] = '0';
        }
        
        int d3 = 0;
        if(seats[n-1] == '0') {
        	d3 = INT_MAX;
        	seats[n-1] = '1';
        	for(int i = 0; i < n; i++) {
                if(seats[i] == '1') {
                    for(int j = i + 1; j < n; j++)
                        if(seats[j] == '1') {
                            d3 = Math.min(d3, j - i);
                            
                            break;
                        }
                }
            }
        	seats[n-1] = '0';
        }
        
        int ans = Math.max(d1, Math.max(d2, d3));
        System.out.print(ans);
    }
}