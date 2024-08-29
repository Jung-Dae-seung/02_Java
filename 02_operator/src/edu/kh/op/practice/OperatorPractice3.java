package edu.kh.op.practice;

import java.util.Scanner;

public class OperatorPractice3 {
	
	Scanner sc = new Scanner(System.in);

	public void practice1() {
		// 마트에서 고객에게 할인 혜택을 제공하려고 한다
		// 물건의 총 가격과 회원 여부를 입력받아, 
		// 회원이라면 10% 할인을 적용하고, 
		// 그렇지 않다면 5% 할인을 적용한 최종 가격을 출력해라
		
		System.out.print("가격을 입력 하세요 : ");
		int price = sc.nextInt();
		
		System.out.print("멤버십 있으세요? (있으면 true / 없으면 false 입력) : ");
		String member = sc.next();
		
		System.out.println(member);
		System.out.printf("할인을 포함한 최종금액 : %.1f", member.equals("true") ? (price * 0.9) : (price * 0.95) );
		
		
	}

	public void practice2() {
		// ATM에서 사용자가 원하는 금액을 입력하면
		// 5만원, 1만원, 5천원, 1천원 단위로 
		// 최소 개수의 지폐로 돈을 인출하라
		// ex) 사용자가 123000원을 입력하면
		// 5만원 2장, 1만원 2장, 5천원 0장, 1천원 3장
		
		System.out.print("출금할 금액 입력 : ");
		int price = sc.nextInt();
		
		System.out.printf("50000원 : %d\n", price / 50000);
		System.out.printf("10000원 : %d\n", price % 50000 / 10000);
		System.out.printf("5000원 : %d\n", price % 10000 / 5000);
		System.out.printf("1000원 : %d\n", price % 5000 / 1000);
		
	}
	
	public void practice3() {
		// 사용자로부터 두 개의 정수를 입력받아, 
		// 첫 번째 수가 두 번째 수의 배수인지 확인하고 결과를 출력해라
		// 만약 배수라면 "배수입니다"를 출력하고
		// 아니라면 "배수가 아닙니다"를 출력
		
		System.out.print("첫 번째 수 : ");
		int num1 = sc.nextInt();
		
		System.out.print("두 번째 수 : ");
		int num2 = sc.nextInt();
		
		System.out.printf( num1 % num2 == 0 ? ("배수입니다") : ("배수가 아닙니다") );
		
	}
}
