package codingTest04;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Test01 {
	

		public static void main(String[] args) {
		Random ran = new Random();
		Scanner sc = new Scanner(System.in);
		
		int stunum = ran.nextInt(10)+1;
			
		Student stu[] = new Student[stunum];
		
		System.out.println(stunum);
		for(int i=0; i<stunum; i++) {
			System.out.print("이름 : ");
			String name = sc.nextLine();
			int score = ran.nextInt(100)+1;
			stu[i] = new Student(name, score);
		}
		
		Arrays.sort(stu);
		
		for(Student stu1 : stu) {
			System.out.println(stu1.name+" : "+stu1.score);
		}
		}
		
		
	}
class Student implements Comparable<Student>{
	String name;
	 int score;
	
public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getScore() {
		return score;
	}


	public void setScore(int score) {
		this.score = score;
	}


public Student(String name, int score) {
		super();
		this.name = name;
		this.score = score;
	}
	

	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return  o.score - score;
	}
	
	
}
