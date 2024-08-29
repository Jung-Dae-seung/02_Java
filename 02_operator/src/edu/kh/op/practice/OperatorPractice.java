package edu.kh.op.practice;

import java.util.Scanner;

public class OperatorPractice {
	
	Scanner sc = new Scanner(System.in);

	public void practice1() {
		// 모든 사람이 사탕을 골고루 나눠가지려고 한다. 
		// 인원 수와 사탕 개수를 키보드로 입력 받고
		// 1인당 동일하게 나눠가진 사탕 개수와 나눠주고 
		// 남은 사탕의 개수를 출력하세요.
		
		System.out.print("인원 수 : ");
		int person = sc.nextInt();
		
		System.out.print("사탕 개수 : ");
		int canddy = sc.nextInt();
		
		System.out.printf("1인당 사탕 개수 : %d\n", canddy / person);
		System.out.printf("남은 사탕 개수 : %d\n", canddy % person);
		
	}
	
	public void practice2() {
		// 키보드로 입력 받은 값들을 변수에 기록하고 
		// 저장된 변수 값을 화면에 출력하여 확인하세요.
		
		System.out.print("이름 : ");
		String name = sc.next();
		
		System.out.print("학년(정수만) : ");
		int hac = sc.nextInt();
		
		System.out.print("반(정수만) : ");
		int ban = sc.nextInt();
		
		System.out.print("번호(정수만) : ");
		int num = sc.nextInt();
		
		System.out.print("성별(남학생/여학생) : ");
		String gender = sc.next();
		
		System.out.print("성적(소수점 아래 둘째 자리까지) : ");
		double score = sc.nextDouble();
		
		System.out.printf("%d학년 %d반 %d번 %s %s의 성적은 %.2f이다.", hac, ban, num, name, gender, score);
	}

	public void practice3() {
		// 국어, 영어, 수학에 대한 점수를 키보드를 이용해 정수로 입력 받고,
		// 세 과목에 대한 합계(국어+영어+수학)와 평균(합계/3.0)을 구하세요.
		
		System.out.print("국어 : ");
		int kor = sc.nextInt();
		
		System.out.print("영어 : ");
		int eng = sc.nextInt();
		
		System.out.print("수학 : ");
		int math = sc.nextInt();
		
		System.out.printf("합계 : %d\n", kor + eng + math);
		System.out.printf("평균 : %.1f\n", (kor + eng + math) / 3.0);
	}
}
