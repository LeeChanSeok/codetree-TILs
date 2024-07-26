import java.util.Arrays;
import java.util.Scanner;

class Student implements Comparable<Student> {
	String name;
    int kor, eng, math;

    public Student(String name, int kor, int eng, int math){
    	this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    @Override
    public int compareTo(Student student) {
        if(this.kor == student.kor) {
        	if(this.eng == student.eng)         // 국어 점수가 일치한다면
                return student.math - this.math;  // 영어 점수를 기준으로 내림차순 정렬합니다.
        	return student.eng - this.eng;  // 영어 점수를 기준으로 내림차순 정렬합니다.
        }
        return student.kor - this.kor;	     // 국어 점수가 다르다면, 오름차순 정렬합니다.
    }
};

public class Main {
    public static void main(String[] args) {
    	
    	Scanner sc = new Scanner(System.in);
    	
    	int N = sc.nextInt();
    	
        Student[] students = new Student[N];
        
        for(int i = 0; i < N; ++i) {
        	students[i] = new Student(sc.next(), sc.nextInt(), sc.nextInt(), sc.nextInt());
        }
        Arrays.sort(students);

        for(int i = 0; i < N; i++)
            System.out.println(students[i]. name + " " + students[i].kor + " " + students[i].eng + " " + students[i].math);
    }
}