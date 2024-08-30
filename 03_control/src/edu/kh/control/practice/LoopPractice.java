package edu.kh.control.practice;

import java.util.Scanner;

public class LoopPractice {

	Scanner sc = new Scanner(System.in);
	
	public void practice1() {
		
		// 사용자로부터 한 개의 값을 입력 받아 
		// 1부터 그 숫자까지의 숫자들을 모두 출력하세요.
		// 단, 입력한 수는 1보다 크거나 같아야 합니다.
		// 만일 1 미만의 숫자가 입력됐다면
		// “1 이상의 숫자를 입력해주세요“를 출력하세요.
		
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();
		
		if(num < 1) {
			System.out.println("1 이상의 숫자를 입력해주세요");
			
		} else {
			for(int i = 1; i <= num; i++) {
				System.out.print(i + " ");
			}
		}
		
	}
	
	public void practice2() {
		// 사용자로부터 한 개의 값을 입력 받아 
		// 1부터 그 숫자까지의 모든 숫자를 거꾸로 출력하세요.
		// 단, 입력한 수는 1보다 크거나 같아야 합니다.
		
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();
		
		if(num < 1) {
			System.out.println("1 이상의 숫자를 입력해주세요");
			
		} else {
			for(int i = 0; i < num; i++) {
				System.out.print(num-i + " ");
			}
		}
	}
	
	public void practice3() {
		// 1부터 사용자에게 입력 받은 수까지의 
		// 정수들의 합을 for문을 이용하여 출력하세요.
		
		System.out.print("정수를 하나 입력하세요 : ");
		int num = sc.nextInt();
		int sum = 0;
		
		for(int i = 1; i <= num; i++) {
			sum += i;
			if(i == num) {
				System.out.print(i);
				System.out.print(" = " + sum);
				
			} else {
				System.out.print(i + " + ");
				
			}
		}
		
	}
	
	public void practice4() {
		// 사용자로부터 두 개의 값을 입력 받아 
		// 그 사이의 숫자를 모두 출력하세요.
		// 만일 1 미만의 숫자가 입력됐다면 
		// “1 이상의 숫자를 입력해주세요“를 출력하세요.
		
		System.out.print("첫 번째 숫자 : ");
		int num1 = sc.nextInt();
		
		System.out.print("두 번째 숫자 : ");
		int num2 = sc.nextInt();
		
		int max, min;
		
		if(num1 < 1 || num2 < 1) {
			System.out.println("1 이상의 숫자를 입력해주세요");
			
		} else {
			if(num1 > num2) {
				max = num1;
				min = num2;
			} else {
				max = num2;
				min = num1;
			}
			
			
			for(int i = min; i <= max; i++) {
				System.out.print(i + " ");
			}
		}
	}
	
	public void practice5() {
		// 사용자로부터 입력 받은 숫자의 단을 출력하세요.
				
		System.out.print("숫자 : ");
		int num = sc.nextInt();
		
		if(num < 1) {
			System.out.println("1 이상의 숫자를 입력해주세요");
		} else {
			System.out.println("===== "+ num + "단 =====");
			for(int j = 1; j <= 9; j++) {
				System.out.printf("%d x %d = %d\n", num, j, num * j);
			}
		}
	}
	
	public void practice6() {
		
		// 사용자로부터 입력 받은 숫자의 단부터 9단까지 출력하세요.
		// 단, 2~9를 사이가 아닌 수를 입력하면 
		// “2~9 사이 숫자만 입력해주세요”를 출력하세요.
		
		System.out.print("숫자 : ");
		int num = sc.nextInt();
		
		if(num < 1) {
			System.out.println("1 이상의 숫자를 입력해주세요");
		} else {
			
			for(int i = num; i <= 9; i++) {
				System.out.println("===== "+ i + "단 =====");
				for(int j = 1; j <= 9; j++) {
					System.out.printf("%d x %d = %d\n", i, j, i * j);
				}
			}
		}
	}
	
	public void practice7() {
		// 다음과 같은 실행 예제를 구현하세요.
		// *
		// **
		// ***
		// ****
		
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		for(int i = 1; i <= num; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	
	public void practice8() {
		// 다음과 같은 실행 예제를 구현하세요.
		// ****
		// ***
		// **
		// *
		
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		for(int i = num; i >= 1; i--) {
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public void practice9() {
		// 다음과 같은 실행 예제를 구현하세요.
		//     *
		//    **
		//   ***
		//  ****
		
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		for(int i = 1; i <= num; i++) {
			for(int j = num; j >= 1; j--) {
				if(j > i) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			} 
			System.out.println();
		}
	}
	
	public void practice10() {
		// 다음과 같은 실행 예제를 구현하세요.
		// *
		// **
		// ***
		// **
		// *
		
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		for(int i = 1; i <= num; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			} 
			System.out.println();
		}
		
		for(int k = 1; k <= num; k++) {
			for(int l = num-1; l >= k; l--) {
				System.out.print("*");
			} 
			System.out.println();
		}
		
	}
	
	public void practice11() {
		// 다음과 같은 실행 예제를 구현하세요.
		// 	   *
		//	  ***
		//	 *****
		//  *******
		
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		for (int i = 0; i < num; i++) {
            for (int j = 0; j < num - i - 1; j++) {
                System.out.print(' ');
            }
            
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print('*');
            }
			System.out.println();
		}
		
	}
	
}
