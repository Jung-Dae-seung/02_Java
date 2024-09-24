package com.hw2.model.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.hw2.model.dto.Animal;

public class Zoo {

	private List<Animal> animals = new ArrayList<Animal>();
	
	public Zoo() {};
	
	public void addAnimal(Animal animal) {
		animals.add(animal);
	}
	
	public void showAnimals() {
		
		System.out.println("동물들의 울음소리를 들어보세요: ");
		
		for(int i = 0; i < animals.size(); i++) {
			animals.get(i).sound();
			
		}
		
	}
	
	public void displayMenu() {
		
		Scanner sc = new Scanner(System.in);
		int num = 0;
		
		while (num != 2) {
			
			System.out.println("****** KH 동물원 ******");
			System.out.println("원하는 작업을 선택하세요 : ");
			System.out.println("1. 동물들의 울음소리 듣기");
			System.out.println("2. 종료");
			System.out.print("선택 : ");
			num = sc.nextInt();
			
			switch (num) {
				case 1:  
					showAnimals(); 
					break;
				case 2:
					System.out.println("프로그램을 종료합니다.");
					break;
			}
			
		}
		
	}
	
}
