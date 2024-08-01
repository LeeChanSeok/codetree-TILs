import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

	static int X;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		X = sc.nextInt();
		
		int cur_pos = 0;
		int cur_speed = 1;
		int time = 0;
		
		while(true) {
			cur_pos += cur_speed;
			++cur_speed;
			++time;
			
			if(cur_pos == X) break;
			
			int sum = cur_speed * (cur_speed + 1) / 2;
			if(cur_pos + sum > X) --cur_speed;
			
			sum = cur_speed * (cur_speed + 1) / 2;
			if(cur_pos + sum > X) --cur_speed;
			
		}
		
		System.out.println(time);
	}


}