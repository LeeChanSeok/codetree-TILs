import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        LinkedList<Integer> list = new LinkedList<>();
        
        for(int i = 0; i < N; ++i) {
        	String cmd = sc.next();
        	
        	if(cmd.equals("push_front")) list.addFirst(sc.nextInt());
        	else if(cmd.equals("push_back")) list.addLast(sc.nextInt());
        	else if(cmd.equals("pop_front")) System.out.println(list.pollFirst());
        	else if(cmd.equals("pop_back")) System.out.println(list.pollLast());
        	else if(cmd.equals("size")) System.out.println(list.size());
        	else if(cmd.equals("empty")) {
        		if(list.isEmpty())
        			System.out.println(1);
        		else 
        			System.out.println(0);
        	}
        	else if(cmd.equals("front")) System.out.println(list.peekFirst());
        	else if(cmd.equals("back")) System.out.println(list.peekLast());
        	
        }
    }
}