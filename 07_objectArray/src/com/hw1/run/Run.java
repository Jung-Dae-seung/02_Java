package com.hw1.run;

import java.util.Arrays;

import com.hw1.model.vo.Employee;

public class Run {

	public static void main(String[] args) {
		
		// 객체배열을 크기 3으로 할당 한 뒤 3개의 생성자를 각각 이용하여
		// 객체 생성 후 출력
		Employee[] emp = new Employee[3];
		
		emp[0] = new Employee(0, null, null, null, 0, ' ', 0, 0.0, null, null);
		emp[1] = new Employee(1, "홍길동", null, null, 19, 'M', 0, 0.0, "01022223333", "서울 잠실");
		emp[2] = new Employee(2, "강말순", "교육부", "강사", 20, 'F', 1000000, 0.01, "01011112222", "서울 마곡");
		
		for(int i = 0; i < emp.length; i++) {
			
			if(emp[i] != null) {
				System.out.println("emp[" + i + "] : " + emp[i].information());
			}
			
		}
		
		System.out.println("========================================================================");
		
		// 3개의 객체 중 값이 없는 필드에 각각 값을 넣은 뒤 출력
		for(int i = 0; i < emp.length; i++) {
			
			if(emp[i].getJob() == null) {
				if(i == 0) {
					emp[0].setEmpName("김말똥");
					emp[0].setDept("영업부");
					emp[0].setJob("팀장");
					emp[0].setAge(30);
					emp[0].setGender('M');
					emp[0].setSalary(3000000);
					emp[0].setBonusPoint(0.2);
					emp[0].setPhone("01055559999");
					emp[0].setAddress("전라도 광주");
					System.out.println("emp[" + i + "] : " + emp[i].information());
				}
				
				if(i == 1) {
					emp[1].setDept("기획부");
					emp[1].setJob("부장");
					emp[1].setAge(19);
					emp[1].setGender('M');
					emp[1].setSalary(4000000);
					emp[1].setBonusPoint(0.3);
					System.out.println("emp[" + i + "] : " + emp[i].information());
				}
				
			}
			
		}
		
		System.out.println("========================================================================");
		
		
		// 직원 각각의 보너스가 적용된 1년 연봉을 계산하여 출력
		// 연봉  = (급여 + (급여 * 보너스포인트)) * 12
		
		int empSum = 0;
		
		for(int i = 0; i < emp.length; i++) {
			
			int sum = (int) ((emp[i].getSalary() + (emp[i].getSalary() * emp[i].getBonusPoint())) * 12);
			
			System.out.println(emp[i].getEmpName() + "의 연봉 : " + sum + "원");
			
			empSum += sum;
		}
		
		System.out.println("========================================================================");
		
		// 3명의 직원의 연봉 평균을 구하여 출력
		System.out.println("직원들의 연봉의 평균 : " + empSum / emp.length + "원");
	}
	
}
