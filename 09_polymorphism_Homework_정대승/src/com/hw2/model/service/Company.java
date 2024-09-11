package com.hw2.model.service;

import com.hw2.model.dto.Employee;
import com.hw2.model.dto.Person;

public class Company implements ManagementSystem{

	private Employee[] emp;				// 전체 직원 저장용 배열
	
	private int employeeCount = 0;		// 직원수 
	
	public Company(int size) {
		emp = new Employee[size];
		
	}
	
	@Override
	public void addPerson(Person person) {
		
		if(employeeCount != emp.length) {
			emp[employeeCount] = (Employee) person;
			System.out.println("직원이 추가되었습니다 - " + emp[employeeCount].getInfo());
			
			employeeCount++;
			
		} else {
			System.out.println("인원이 모두 충원되었습니다.");
			
		}
		
	}

	@Override
	public void removePerson(String id) {
		
		for(int i = 0; i < emp.length; i++) {
			
			if(emp[i].getId().equals(id)) {
				System.out.println("직원이 삭제되었습니다 - " + emp[i].getInfo());
				
				for (int j = i; j < emp.length - 1; j++) {
					emp[j] = emp[j + 1];
		        }
		        
				emp[emp.length - 1] = null;
				employeeCount--;
		        
		        break;
			}
			
		}
		
	}

	@Override
	public void displayAllPersons() {

		System.out.println("전체 직원 명단 : ");
		
		for(int i = 0; i < emp.length; i++) {
			
			if(emp[i] != null) {
				System.out.println( emp[i].getInfo() );
			}
			
		}
		
	}

}
