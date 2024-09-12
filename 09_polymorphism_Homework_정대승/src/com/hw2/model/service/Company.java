package com.hw2.model.service;

import com.hw2.model.dto.Employee;
import com.hw2.model.dto.Person;

public class Company implements ManagementSystem{

	private Employee[] emp;				// 전체 직원 저장용 배열
	
	private int employeeCount;		// 직원수 
	
	public Company(int size) {
		emp = new Employee[size];
		employeeCount = 0;
	}
	
	@Override
	public void addPerson(Person person) {
		
		// 매개변수로 들어온 person이 Employee인지 체크
		// emp 객체배열에 공간이 있는지 확인
		if(employeeCount < emp.length && person instanceof Employee) {
			emp[employeeCount] = (Employee) person;
			System.out.println("직원이 추가되었습니다 - " + emp[employeeCount].getInfo());
			
			employeeCount++;
			
		} else {
			System.out.println("인원이 모두 충원되었습니다.");
			
		}
		
	}

	@Override
	public void removePerson(String id) {
		
		for(int i = 0; i < employeeCount; i++) {
			
			if(emp[i].getId().equals(id)) {
				System.out.println("직원이 삭제되었습니다 - " + emp[i].getInfo());
				emp[i] = null;
				
				for (int j = i; j < employeeCount - 1; j++) {
					emp[j] = emp[j + 1];
		        }
		        
				emp[--employeeCount] = null;
		        
		        return;
			}
			
		}
		
		System.out.println("ID : " + id + "인 직원을 찾을 수 없습니다.");
		
	}

	@Override
	public void displayAllPersons() {

		System.out.println("전체 직원 명단 : ");
		
		for(int i = 0; i < employeeCount; i++) {
			System.out.println( emp[i].getInfo() );
			
		}
		
	}

}
