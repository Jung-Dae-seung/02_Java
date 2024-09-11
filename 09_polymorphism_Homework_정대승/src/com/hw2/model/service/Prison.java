package com.hw2.model.service;

import com.hw2.model.dto.Person;
import com.hw2.model.dto.Prisoner;

public class Prison implements ManagementSystem{
	
	private Prisoner[] pri;		// 전체 수용자 저장용 배열
	
	private int prisonerCount;			// 수용자수
	
	
	public Prison(int size) {
		pri = new Prisoner[size];
		
	}

	@Override
	public void addPerson(Person person) {
		
		if(prisonerCount != pri.length) {
			pri[prisonerCount] = (Prisoner) person;
			System.out.println("수감자가 추가되었습니다 - " + pri[prisonerCount].getInfo());
			
			prisonerCount++;
			
		} else {
			System.out.println("인원이 모두 충원되었습니다.");
			
		}
		
	}

	@Override
	public void removePerson(String id) {
		
		for(int i = 0; i < pri.length; i++) {
			
			if(pri[i].getId().equals(id)) {
				System.out.println("수감자가 삭제되었습니다 - " + pri[i].getInfo());
				
				for (int j = i; j < pri.length - 1; j++) {
		            pri[j] = pri[j + 1];
		        }
		        
		        pri[pri.length - 1] = null;
		        prisonerCount--;
		        
		        break;
			}
			
		}
		
	}

	@Override
	public void displayAllPersons() {
		
		System.out.println("전체 수감자 명단 : ");
		
		for(int i = 0; i < pri.length; i++) {
			
			if(pri[i] != null) {
				System.out.println( pri[i].getInfo() );
			}
			
		}
		
	}

}
