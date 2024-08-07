import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static class Data implements Comparable<Data>{
        int t, x, y;

		public Data(int t, int x, int y) {
			super();
			this.t = t;
			this.x = x;
			this.y = y;
		}

		@Override
		public int compareTo(Data o) {
			return this.t - o.t;
		}

        
    }

    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	
    	int N = sc.nextInt();
    	int K = sc.nextInt();
    	int P = sc.nextInt();
    	int T = sc.nextInt();
    	
    	int[] person = new int[N+1];
    	person[P] = 1;
    	
    	Data[] datas = new Data[T];
    	
    	for(int i = 0; i < T; ++i) {
    		
    		int t = sc.nextInt();
    		int x = sc.nextInt();
    		int y = sc.nextInt();
    		
    		datas[i] = new Data(t, x, y);
    	}
    	
    	Arrays.sort(datas);
    	
    	for(Data data : datas) {    		
    		
    		if(person[data.x] != 0 && person[data.y] != 0) {
    			if(person[data.x] <= K) ++person[data.x];
    			if(person[data.y] <= K) ++person[data.y];
    		}
    		else if(person[data.x] != 0) {
    			if(person[data.x] > K) continue;
    			++person[data.x];
    			person[data.y] = 1; 
    			
    		} else if(person[data.y] != 0) {
    			if(person[data.y] > K) continue;
    			++person[data.y];
    			person[data.x] = 1; 
    			
    		}
    	}
    	
    	for(int i = 1; i <= N; ++i) {
    		System.out.print((person[i] == 0)?'0':'1');
    	}
    	
    }
}