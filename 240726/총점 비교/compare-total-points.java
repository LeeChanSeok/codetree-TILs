import java.util.Arrays;
import java.util.Scanner;

class Student implements Comparable<Student> {
	String name;
    int kor, eng, math;
    int sum;

    public Student(String name, int kor, int eng, int math){
    	this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
        this.sum = kor + eng + math;
    }

    @Override
    public int compareTo(Student student) {        
        return this.sum - student.sum;	     
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