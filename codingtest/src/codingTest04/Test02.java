package codingTest04;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

import codingTest04.Test02.Student;

public class Test02 {
	
	class Student implements Comparable<Student>{
		private String name; 
		private int score;
		
		
		public Student(String name, int score) {
			this.name = name;
			this.score = score;
		}
		
		String getName() {
			return name;
		}
		void setName(String name) {
			this.name = name;
		}
		int getScore() {
			return score;
		}
		void setScore(int score) {
			this.score = score;
		}

		@Override
		public int compareTo(Student o) {
			
			return score-o.score;
		}
		
	}
	
	public static void main(String[] args) {
	Random ran = new Random();
	Scanner sc = new Scanner(System.in);
	int num = ran.nextInt(100000)+1;
	Student stu[] = new Student[num];
	System.out.println("학생수: "+ num);
	
	for(int i=0; i<num; i++) {
		System.out.print((i+1)+"번째 학생 이름: ");
		String name =sc.nextLine();
		int rannum = ran.nextInt(100)+1;
		//stu[i]= new Student(name, rannum);	
	}
	Arrays.sort(stu);
	
	for(Student stu1 : stu) {
		System.out.print(stu1.name+" ");
		System.out.println(stu1.score);
	}
	
	}

	
	}

