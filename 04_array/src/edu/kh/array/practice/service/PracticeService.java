package edu.kh.array.practice.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class PracticeService {
	
	Scanner sc = new Scanner(System.in);

	public void practice1() {
		
		// 길이가 9인 배열을 선언 및 할당하고, 
		// 1부터 9까지의 값을 반복문을 이용하여
		// 순서대로 배열의 각 인덱스 요소에 대입하고 출력한 후
		// 짝수 번째 인덱스 값의 합을 출력하세요. (0 번째 인덱스는 짝수로 취급)
		
		int[] array = new int[9];
		int sum = 0;
		
		for(int i = 0; i < array.length; i++) {
			
			array[i] = i + 1;
			
		}
		
		for(int i = 0; i < array.length; i++) {
			
			System.out.print(array[i] + " ");
			
			if(i % 2 == 0) {
				sum += array[i];
			}
			
		}
		System.out.println();
		
		System.out.println("짝수 번째 인덱스 합 : " + sum);
		
	}
	
	public void practice2() {
		
		// 길이가 9인 배열을 선언 및 할당하고, 
		// 9부터 1까지의 값을 반복문을 이용하여
		// 순서대로 배열의 각 인덱스 요소에 대입하고 출력한 후
		// 홀수 번째 인덱스 값의 합을 출력하세요. (0 번째 인덱스는 짝수로 취급)
		
		int[] array = new int[9];
		int sum = 0;
		
		for(int i = 8; i >= 0; i--) {
			
			array[i] = i + 1;
			
		}
		
		for(int i = 8; i >= 0; i--) {
			
			System.out.print(array[i] + " ");
			
			if(i % 2 != 0) {
				sum += array[i];
			}
			
		}
		System.out.println();
		
		System.out.println("홀수 번째 인덱스 합 : " + sum);
		
	}
	
	public void practice3() {
		
		// 사용자에게 입력 받은 양의 정수만큼 배열 크기를 할당하고
		// 1부터 입력 받은 값까지 배열에 초기화한 후 출력하세요.
		
		System.out.print("양의 정수 : ");
		int input = sc.nextInt();
		
		int[] array = new int[input];
		
		for(int i = 0; i < input; i++) {
			
			array[i] = i + 1;
			
		}
		
		for(int i = 0; i < array.length; i++) {
			
			System.out.print(array[i] + " ");
			
		}
		
		
	}
	
	public void practice4() {
		// 정수 5개를 입력 받아 배열을 초기화 하고
		// 검색할 정수를 하나 입력 받아 배열에서 같은 수가 있는 
		// 인덱스를 찾아 출력.
		// 배열에 같은 수가 없을 경우 “일치하는 값이 존재하지 않습니다“ 출력

		int[] arr = new int[5];
		
		for(int i = 0; i < 5; i++) {
			
			System.out.printf("입력 %d : ", i);
			arr[i] = sc.nextInt();
			
		}
		
		System.out.print("검색할 값 : ");
		int srch = sc.nextInt();
		int index = 0;
		
		boolean flag = false;
		
		for(int i = 0; i < arr.length; i++) {
			
			if(arr[i] == srch) {
				flag = true;
				
				index = i;
				
			}
			
		}
		
		if( flag ) {
			System.out.println("인덱스 : " + index);
			
		} else {
			System.out.println("일치하는 값이 존재하지 않습니다.");
			
		}
		
	}
	
	public void practice5() {
		
		// 문자열을 입력 받아 문자 하나하나를 배열에 넣고 
		// 검색할 문자가 문자열에 몇 개 들어가 있는지
		// 개수와 몇 번째 인덱스에 위치하는지 인덱스를 출력하세요.
		
		System.out.print("문자열 : ");
		String str = sc.nextLine();
		
		System.out.print("문자 : ");
		char input = sc.next().charAt(0);
		
		int count = 0;
		String index = "";
		
		for(int i = 0; i < str.length(); i++) {
			
			if(str.charAt(i) == input) {
				
				count++;
				index += i + " ";
				
			}
			
		}
		
		System.out.printf("%s에 %c가 존재하는 위치(인덱스) : %s\n", str, input, index);
		System.out.printf("%c 개수 : %d", input, count);
		
	}
	
	public void practice6() {
		
		// 사용자가 배열의 길이를 직접 입력하여 
		// 그 값만큼 정수형 배열을 선언 및 할당하고
		// 배열의 크기만큼 사용자가 직접 값을 입력하여 
		// 각각의 인덱스에 값을 초기화 하세요.
		// 그리고 배열 전체 값을 나열하고 각 인덱스에 저장된 값들의 합을 출력하세요.
		
		System.out.print("정수 : ");
		int number = sc.nextInt();
		
		int[] arr = new int[number];
		int sum = 0;
		
		for(int i = 0; i < number; i++) {
			
			System.out.printf("배열 %d번째 인덱스에 넣을 값 : ", i);
			arr[i] = sc.nextInt();
			
		}
		
		for(int i = 0; i < arr.length; i++) {
			
			System.out.print(arr[i] + " ");
			sum += arr[i];
			
		}
		
		System.out.println();
		System.out.println("총 합 : " + sum); 
		
	}
	
	public void practice7() {
		
		// 주민등록번호 번호를 입력 받아 
		// 성별을 나타내는 숫자 이후부터 *로 가리고 출력하세요.
		
		System.out.print("주민등록번호(-포함) : ");
		String pass = sc.nextLine();
		char[] result = new char[pass.length()];
		
		for(int i = 0; i < pass.length(); i++) {
			
			if(i >= 8) {
				result[i] = '*';
			} else {
				result[i] = pass.charAt(i);
			}
		
		}
		
		System.out.println(result);
		
	}
	
	public void practice8() {
		
		// 3이상인 홀수를 입력 받아 배열의 중간까지는 
		// 1부터 1씩 증가하여 오름차순으로 값을 넣고,
		// 중간 이후부터 끝까지는 1씩 감소하여 
		// 내림차순으로 값을 넣어 출력하세요.
		// 단, 입력한 정수가 홀수가 아니거나 3 미만일 경우 
		// “다시 입력하세요”를 출력하고
		// 다시 정수를 받도록 하세요.
		
		int input = 0;
		
		while(true) {
			
			System.out.print("정수 : ");
			int number = sc.nextInt();
			
			if(number % 2 == 0 || number < 3) {
				System.out.println("다시 입력하세요");
			} else {
				input = number;
				break;
			}
			
		}
		
		int[] arr = new int[5];
		int count = 0;
		
		for(int i = 0; i <= 4; i++) {
			
			if(i > 2) {
				count--;
				arr[i] = count;
			} else {
				count++;
				arr[i] = count;
			}
			
			System.out.print(arr[i] + " ");
			
		}

		/*
		int[] arr = new int[input * 2 - 1];
		int count = input;
		
		for(int i = 0; i < arr.length; i++) {
			
			if(i > input-1) {
				arr[i] = count - 1;
				count -= 1;
			} else {
				arr[i] = i + 1;
			}
			
			System.out.print(arr[i] + " ");
			
		}
		*/
		
	}
	
	public void practice9() {
		
		// 10개의 값을 저장할 수 있는 정수형 배열을 선언 및 할당하고,
		// 1~10 사이의 난수를 발생시켜 배열에 초기화한 후 출력하세요.
		
		int[] arr = new int[10];
		
		for(int i = 0; i < arr.length; i++) {
			
			arr[i] = (int) (Math.random() * 10 + 1);
			
		}
		
		System.out.print("발생한 난수 : ");
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
 		
	}
	
	public void practice10() {
		
		// 10개의 값을 저장할 수 있는 정수형 배열을 선언 및 할당하고,
		// 1~10 사이의 난수를 발생시켜 배열에 초기화 후
		// 배열 전체 값과 그 값 중에서 최대값과 최소값을 출력하세요.
		
		int[] arr = new int[10];
		
		for(int i = 0; i < arr.length; i++) {
			
			arr[i] = (int) (Math.random() * 10 + 1);
			
		}
		
		int max = 0;
		int min = 10;
		
		
		System.out.print("발생한 난수 : ");
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
			
			if(max < arr[i]) {
				max = arr[i];
			}
			
			if(min > arr[i]) {
				min = arr[i];
			}
			
		}
		
		System.out.println();
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
		
	}
	
	public void practice11() {
		
		// 10개의 값을 저장할 수 있는 정수형 배열을 선언 및 할당하고
		// 1~10 사이의 난수를 발생시켜 중복된 값이 없게 
		// 배열에 초기화한 후 출력하세요.
		
		int[] arr = new int[10];
		
		for(int i = 0; i < arr.length; i++) {
			
			int random = (int) (Math.random() * 10 + 1);
			
			arr[i] = random;
			
			for(int x = 0; x < i; x++) {
				
				if(arr[x] == random) {
					i--;
					break;
				}
				
			}
			
		}
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
	}
	
	public void practice12() {
		
		// 로또 번호 자동 생성기 프로그램을 만들기.
		// (중복 값 없이 오름차순으로 정렬하여 출력하세요.)
		
		int[] arr = new int[6];
		
		for(int i = 0; i < arr.length; i++) {
			
			int random = (int) (Math.random() * 45 + 1);
			
			arr[i] = random;
			
			for(int x = 0; x < i; x++) {
				
				if(arr[x] == random) {
					i--;
					break;
				}
				
			}
			
		}
		
		Arrays.sort(arr);
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
	}
	
	public void practice13() {
		
		// 문자열을 입력 받아 문자열에 어떤 문자가 들어갔는지 배열에 저장하고
		// 문자의 개수와 함께 출력하세요.
		
		System.out.print("문자열 : ");
		String str = sc.nextLine();
		
		char[] index = new char[str.length()];
		
		
		for(int i = 0; i < str.length(); i++) {
			
			boolean flag = true;
			char mes = str.charAt(i);
						
			for(int x = 0; x < i; x++) {
				
				if(index[x] == mes) {
					flag = false;
					break;
				} 
				
			}
			
			if(flag) {
				index[i] = mes;
			}
			
		}
		
		String result = "";
		int count = 0;
		
		
		for(int i = 0; i < index.length; i++) {
			
			if(index[i] != 0) {
				result += index[i] + ", ";
				count++;
			}
			
		}
		
		System.out.println("문자열에 있는 문자 : " + result);
		System.out.println("문자 개수 : " + count);
		
	}
	
	public void practice14() {
		
		// 사용자가 입력한 배열의 길이만큼의 문자열 배열을 선언 및 할당하고
		// 배열의 인덱스에 넣을 값 역시 사용자가 입력하여 초기화 하세요.
		// 단, 사용자에게 배열에 값을 더 넣을지 물어보고 몇 개를 더 입력할 건지,
		// 늘린 곳에 어떤 데이터를 넣을 것인지 받으세요.
		// 사용자가 더 이상 입력하지 않겠다고 하면 배열 전체 값을 출력하세요.
		
		int number = 0;
		int input = 0;
		
		// 초기 배열 크기 입력
		System.out.print("배열의 크기를 입력하세요 : ");
		number = sc.nextInt();
		
		// nextInt는 가장 마지막 문자인 엔터를 제거하지 않는다
		// 1. nextLine()을 nextInt()이후에 추가
		// 2. nextLine()으로 받아서 parseInt로 변경해서 사용
		sc.nextLine();
		
		String[] strArr = new String[number];
		
		for(int i = 0; i < number; i++) {
			
			System.out.printf("%d번째 문자열 : ", i + 1);
			strArr[i] = sc.nextLine();
			
		}
		
		// 무한반복 수행문
		while(true) {
			
			System.out.print("더 값을 입력하시겠습니까?(Y/N) : ");
			String check = sc.nextLine();
			
			if(check.toUpperCase().equals("Y")) {
				System.out.print("더 입력하고 싶은 개수 : ");
				input = sc.nextInt();
				sc.nextLine();
				
				// 기존에 입력한 배열 복사
				String[] strCopy = Arrays.copyOf(strArr, strArr.length + input);
				
				for(int i = number; i < number + input; i++) {
					
					System.out.printf("%d번째 문자열 : ", i + 1);
					strCopy[i]= sc.nextLine();
					
				}
				
				// 복사한 배열 내용을 초기 설정 배열에 초기화
				strArr = strCopy;
				
				// 배열의 크기 누적진행
				number += input;
				
			}
			
			if(check.toUpperCase().equals("N")) {
				break;
			}
				
			
		}
		
		System.out.println( Arrays.toString(strArr) );
		
	}
	
}
