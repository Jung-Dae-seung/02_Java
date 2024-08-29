package edu.kh.op.practice;

import java.util.Scanner;

public class OperatorPractice2 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("당신의 나이는 ? :");
		int age = sc.nextInt();
		
		
		System.out.printf( age >= 20 ? ("저는 성인입니다\n") : ("저는 미성년 입니다\n"));
		System.out.printf("청소년 입니까? %b\n", (age >= 13) && (age <= 19) ? true : false);
		System.out.printf("노인이거나 어린이 입니까? %b\n", (age >= 65) || (age <= 12) ? true : false);
		
		
	}
}
