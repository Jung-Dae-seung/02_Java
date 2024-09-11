package com.hw2.run;

import com.hw2.model.dto.Employee;
import com.hw2.model.dto.Person;
import com.hw2.model.dto.Prisoner;
import com.hw2.model.service.Company;
import com.hw2.model.service.Prison;

public class Run {

	public static void main(String[] args) {

		// Company의 생성자를 이용하여 10칸 짜리 Employee 객체배열 생성하는
		// Company 객체를 생성하여 ManagmentSystem 자료형의 company에 주소를 저장
		Company com = new Company(10);
		
		// Prison의 생성자를 이용하여 10칸 짜리 Prisoner 객체배열 생성하는
		// Prison 객체를 생성하여 ManagementSystem 자료형 prison에 주소를 저장
		Prison pri = new Prison(10);
		
		// 2명 정도 직원 새로 등록하기
		Employee emp1 = new Employee("EMP001", "유재석", "기획팀");
		com.addPerson(emp1);
		
		Employee emp2 = new Employee("EMP002", "정형돈", "개발팀");
		com.addPerson(emp2);
		com.addPerson(emp1);
		
		
		// 등록된 전체 직원 조회
		com.displayAllPersons();
		System.out.println("=====================================================================");
		
		
		// 2명 정도 수감자 새로 등록하기
		Prisoner pri1 = new Prisoner("1205", "정준하", "밥도둑");
		pri.addPerson(pri1);
		
		Prisoner pri2 = new Prisoner("0705", "박명수", "웃음연쇄살인");
		pri.addPerson(pri2);
		
		// 등록된 전체 수감자 조회
		pri.displayAllPersons();
		System.out.println("=====================================================================");
		
		
		// EMP001 id를 가진 직원 삭제
		com.removePerson("EMP002");
		
		// 1205 id 를 가진 수감자 삭제
		pri.removePerson("1205");
		
		
		System.out.println("=====================================================================");
		
		
		// 현재 남은 직원 모두 조회
		com.displayAllPersons();
		
		// 현재 남은 수감자 모두 조회
		pri.displayAllPersons();
		
	}
	
}
