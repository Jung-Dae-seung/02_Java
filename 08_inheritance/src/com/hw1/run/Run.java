package com.hw1.run;

import java.util.Scanner;

import com.hw1.model.vo.Employee;
import com.hw1.model.vo.Student;

public class Run {

	public static void main(String[] args) {
		
		// 3명의 학생 정보를 기록할 수 잇게 객체 배열 할당
		Student[] std = new Student[3];
		
		// 사용데이터 참고하여 3명의 학생 정보 초기화
		std[0] = new Student("홍길동", 20, 178.2, 70.0, 1, "정보시스템공학과");
		std[1] = new Student("김말똥", 21, 187.3, 80.0, 2, "경영학과");
		std[2] = new Student("강개순", 23, 167.0, 45.0, 4, "정보통신공학과");
		
		// 위의 학생 정보 모두 출력
		/*
		for(int i = 0;  i < std.length; i++) {
			System.out.println(std[i].information());
			
		}
		*/
		
		// 향상된 for문
		/* 자바에서 배열, 컬렉션과 같은 데이터를 순차적으로 간단하게 반복할 수 있는
		 * 구조를 제공
		 * 일반적인 for문 보다 코드가 더 간결하고 가독성이 좋아서
		 * 반복 작업을 더 쉽게 할 수 있음
		 * 
		 * for(데이터 타입 변수명 : 배열 또는 컬렉션){
		 * 		// 반복해서 실행할 코드
		 * }
		 * 
		 */
		
		for(Student stds : std) {
			
			System.out.println(stds.information());
		}
		
		
		System.out.println("==================================");
		
		
		// 최대 10명의 사원 정보를 기록할 수 있게 배열을 할당
		Employee[] emp = new Employee[10];
		int count = 0;
		
		Scanner sc = new Scanner(System.in);
		
		// 사원들의 정보를 키보드로 계속 입력 받고
		// --> while(true) 무한 반복문을 통해
		// 계속 추가할 것인지 물어보고, 대소문자 상관없이
		// 'y'이면 계속 객체 추가
		// 한 명씩 추가 될 때마다 카운트함
		while(true) {
			
			System.out.print("이름 : ");
			String name = sc.next();
			
			System.out.print("나이 : ");
			int age = sc.nextInt();
			
			System.out.print("신장 : ");
			double height = sc.nextDouble();
			
			System.out.print("몸무게 : ");
			double weight = sc.nextDouble();
			
			System.out.print("급여 : ");
			int sal = sc.nextInt();
			
			System.out.print("부서 : ");
			String dept = sc.next();
			
			emp[count] = new Employee(name, age, height, weight, sal, dept);
			count++;
			
			System.out.print("계속 추가하시겠습니까? (y/n) : ");
			String check = sc.next();
			
			if(check.toUpperCase().equals("N")) {
				break;
			} else if(check.toUpperCase().equals("Y")) {
				continue;
			}
			
		}
		
		for(Employee list : emp) {
			
			// 만약에 list 가 null 이면 반복 멈추기
			if(list == null) {
				break;
			}
			
			System.out.println(list.information());
			
		}
		
		
	}
}
