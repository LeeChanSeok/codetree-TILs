import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

// 학생들의 정보를 나타내는 클래스 선언
class Point {
    int x, id;
    
	public Point(int x, int id) {
		super();
		this.x = x;		
		this.id = id;

	}
  
    
};

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 변수 선언 및 입력:
        int n = sc.nextInt();
        Point[] points = new Point[n];
        for(int i = 0; i < n; i++) {
            
            int x = sc.nextInt();
           

            // Student 객체를 생성해 리스트에 추가합니다.
            points[i] = new Point(x,i + 1);
        }

        // custom comparator를 활용한 정렬
        Arrays.sort(points, new Comparator<Point>() {  
            @Override
            public int compare(Point a, Point b) { // 키를 기준 오름차순 정렬합니다.
                
            	return a.x - b.x;
                
            }
        });

        int[] idx = new int[n + 1];
        for(int i = 1; i <= n; ++i) {
        	for(int j = 0; j < n; ++j) {
        		if(points[j].id == i) idx[i] = j + 1;
        	}
        }
        
        for (int i = 1; i <= n; i++){
            System.out.print(idx[i] + " ");
        }
    
    }
}