import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		char[] b = sc.next().toCharArray();
		int len = b.length;
		
        boolean isZero = false;
        for(int i = 0; i < len; ++i) {
        	if(b[i] == '0') {
        		b[i] = '1';
        		isZero = true;
        		break;
        	}
        }
        if(!isZero) b[len-1] = '0';
        
        int ans = 0;
        for(int i = 0; i < len; ++i) {
        	ans = ans * 2 + (b[i] - '0');
        }

		System.out.println(ans);
	}
}