import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        LinkedList<Character> list = new LinkedList<>();
        String str = sc.next();
        
        for(int i = 0; i < N; ++i) {
        	list.add(str.charAt(i));
        }
        
        ListIterator<Character> iter = list.listIterator(N);
        for(int i = 0; i < M; ++i) {
        	char cmd = sc.next().charAt(0);
        	
        	if(cmd == 'L') {
        		if(iter.hasPrevious()) iter.previous();
        	} else if(cmd == 'R') {
        		if(iter.hasNext()) iter.next();
        	} else if(cmd == 'D') {
        		if(iter.hasNext()) {        
        			iter.next();
        			iter.remove();
        		}
        	}else if(cmd == 'P') {
        		iter.add(sc.next().charAt(0));
        	}
        }
        
        iter = list.listIterator();
        while(iter.hasNext()) {
        	System.out.print(iter.next());
        }
    }
}