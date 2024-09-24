package com.hw4.model.service;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

import com.hw4.model.dto.Toy;

public class ToyFactory {

	Scanner sc = new Scanner(System.in);
	
	private Set<Toy> toyList = new HashSet<Toy>(); 
	private Map<Integer, String> ingreList = new HashMap<Integer, String>();
	
	// List.of() 방식 : (Java 9이상부터 사용가능) 가변인자를 받아 
	//                   전달받은 요소로 구성된 List 생성 후 반환 
	/* 
	List<Integer> list = List.of(1,2);
	Set<String> toy = new HashSet<String>();
	for(int num : list) {
		toy.add(ingreList.get(num));
	}
	*/
	
	
	// Arrays.asList() 방식 : (Java 8 이하 버전 사용 시)
	/*
	List<Integer> list = new ArrayList<Integer>(Arrays.asList(1,4));
	Set<String> toy = new HashSet<String>();
	for(int num : list) {
		toy.add(ingreList.get(num));
	}
	*/
	
	
	
	public ToyFactory() {
		
		// 재료 추가
		ingreList.put(1, "면직물");
		ingreList.put(2, "플라스틱");
		ingreList.put(3, "유리");
		ingreList.put(4, "고무");
		
		// 장난감 추가(ingrePrd 가변함수 이용)
		toyList.add(new Toy("마미롱레그", 8, 36000, "분홍색", 19950805, ingrePrd(1,4)));
		toyList.add(new Toy("허기위기", 5, 12000, "파란색", 19940312, ingrePrd(1,2)));
		toyList.add(new Toy("키시미시", 5, 15000, "분홍색", 19940505, ingrePrd(1,2)));
		toyList.add(new Toy("캣냅", 8, 27000, "보라색", 19960128, ingrePrd(1,2)));
		toyList.add(new Toy("파피", 12, 57000, "빨간색", 19931225, ingrePrd(1,2,4)));
	
		
	}
	
	/**
	 * 가변함수로 기본 생성자 재료 등록
	 * @param numbers
	 * @return toy
	 */
	public Set<String> ingrePrd(int... numbers) {
		Set<String> toy = new HashSet<String>();
		
		for(int num : numbers) {
			toy.add(ingreList.get(num));
		}
		
		return toy;
	}
	
	public void displayMenu() {
		
		int menuNum = 0;
		
		do {
			
			System.out.println("<< 플레이타임 공장 >>");
			System.out.println("1. 전체 장난감 조회하기");
			System.out.println("2. 새로운 장난감 만들기");
			System.out.println("3. 장난감 삭제하기");
			System.out.println("4. 장난감 제조일 순으로 조회하기");
			System.out.println("5. 연령별 사용 가능한 장난감 리스트 조회하기");
			System.out.println("6. 재료 추가");
			System.out.println("7. 재료 삭제");
			System.out.print("선택 : ");
			menuNum = sc.nextInt();
			
			try {
				
				switch (menuNum) {
					case 1: 
						allToyList();
						break;
					case 2:
						addToy();
						break;
					case 3:
						deleteToy();
						break;
					case 4:
						descToyList();
						break;
					case 5:
						ageDescList();
						break;
					case 6:
						addIngre();
						break;
					case 7:
						deleteIngre();
						break;
					default :
						System.out.println("\n지정된 번호만 입력해주세요.");
				}
					
			} catch (InputMismatchException e) {
				System.out.println("\nerror : 입력형식이 유효하지 않습니다. 다시 시도해주세요");
				sc.nextLine();	
				
				menuNum = -1;	// 첫 반복 시 잘못력하는 경우 
				
			} 
			
		} while (menuNum != 0);
		
	}

	/**
	 * 1. 전체 장난감 조회하기: 공장에 있는 모든 장난감의 정보를 출력
	 */
	public void allToyList() {
		
		System.out.println("\n<전체 장난감 목록>");
		
		// 장난감 번호값
		int index = 1;
		
		for(Toy list : toyList) {
			System.out.println(index + ". " + list);
			index++;
		}
	}
	
	/**
	 * 2. 새로운 장난감 만들기: 새로운 장난감을 추가하고, 
	 * 	  사용자가 입력한 정보로 객체 생성
	 */
	public void addToy() {
		
		// 장난감 목록(Set -> List로 초기화)
		List<Toy> resultList = new ArrayList<Toy>(toyList);
		
		// 추가될 장난감의 넣을 재료 set 변수 초기화
		Set<String> ingre = new HashSet<String>();
		
		System.out.println("<새로운 장난감 추가>");
		System.out.print("장난감 이름 : ");
		String name = sc.next();
		
		// 해당 장난감 List전체 조회시
		// 같은 이름의 장난감이 있을경우 중단
		for(int i = 0; i < resultList.size(); i++) {
			if(resultList.get(i).getName().equals(name)) {
				System.out.println("이미 같은 이름을 가진 장난감이 존재한다.");
				return;
			}
		}
		
		System.out.print("사용 가능 연령: ");
		int age = sc.nextInt();
		sc.nextLine();
		
		System.out.print("가격 : ");
		int price = sc.nextInt();
		sc.nextLine();
		
		System.out.print("색상 : ");
		String color = sc.next();
		
		System.out.print("제조일(YYYYMMDD 형식으로 입력) : ");
		int year = sc.nextInt();
		sc.nextLine();
		
		System.out.println("사용 가능한 재료 목록 : ");
		
		// Map 의 Key, Value 표현방식인 Entrt 사용
		for(Entry<Integer, String> entry : ingreList.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
			
		}
		
		// 추가할 재료 반복진행
		while(true) {
			
			// String 으로 받는 이유 Integer.parseInt는 String만 받기때문
			System.out.print("추가할 재료의 번호를 입력하세요 (종료하려면 'q'를 입력하세요) : ");
			String inputIngre = sc.next();
			
			if(inputIngre.equals("q")) {
				break;
			}
			
			// Map의 Key(Integer)값으로 받기 위한 세팅
			int ingreNum = Integer.parseInt(inputIngre);
			
			try {
				
				// 재료목록인 ingreList(Map)에서 해당 키값(ingreNum)에
				// 해당되는 재료명 가져오기
				String ingreString = ingreList.get(ingreNum);
				
				// 재료 목록에서 해당 키값이 있을 경우
				if(ingreList.containsKey(ingreNum)) {
					// 추가할 제품의 재료 목록에서 입력한 재료가 있을 경우
					if(ingre.contains(ingreString)) {
						System.out.println("이미 추가된 재료입니다. 다른 재료를 선택하세요.");
					
					// 추가할 제품의 재료 목록에서 입력한 재료가 없음 경우
					} else {
						ingre.add(ingreList.get(Integer.parseInt(inputIngre)));
						System.out.println("재료가 추가되었습니다 : " + ingreList.get(ingreNum));
						
					}
				// 재료 목록에서 해당 키값이 없을 경우
				} else {
					System.out.println("잘못된 번호입니다. 다시 입력해주세요.");
					
				}
				
			} catch (Exception e) {
				e.printStackTrace();
				
			}
			
		}
		
		toyList.add(new Toy(name, age, price, color, year, ingre));
		System.out.println("새로운 장난감이 추가되었습니다.");
		
	}
	
	/**
	 * 3. 장난감 삭제하기: 공장에서 장난감을 삭제
	 */
	public void deleteToy() {
		
		System.out.print("\n삭제할 장난감의 이름을 입력하세요 : ");
		String toyName = sc.next();
		
		// 장난감의 존재여부 확인 변수 
		boolean check = true;
		
		// Set을 출력하기 위한 반복자 Iterator 사용
		Iterator<Toy> it = toyList.iterator();
		
		while (it.hasNext()) {
			// 순서대로 장난감 내용 가져오기
			Toy toyInfo = it.next();
			
			// 입력한 장난감 이름과 같은 장난감이 있을 경우 삭제 진행
			if(toyInfo.getName().equals(toyName)) {
				it.remove();
				check = false;
				break;
			}
			
		}
		
		// 장난감이 있을경우 삭제되고 false로 바뀌었으니 아래 내용 진행
		if(check) {
			System.out.println("해당되는 장난감이 없습니다.");
			return;
		}
		
		System.out.println("장난감이 삭제되었습니다.");
		
	}
	
	/**
	 * 4. 장난감 제조일 순으로 조회하기: 장난감을 제조일에 따라 정렬하여 출력
	 */
	public void descToyList() {
		
		System.out.println("\n<제조일 순으로 장난감을 정렬>");
		
		// Comparator 쓰기위한 List 초기화 진행
		List<Toy> resultList = new ArrayList<>(toyList);
		
		// Comparator.comparing으로 제조일 순으로 정렬
		resultList.sort(Comparator.comparing(Toy::getYear));

		for(int i = 0; i < resultList.size(); i++) {
			System.out.println( (i+1) + ". " + resultList.get(i));
			
		}
		
	}
	
	/**
	 * 5. 연령별 사용 가능한 장난감 리스트 조회하기: 사용 가능한 연령을 입력받고, 
	 *    해당하는 장난감을 출력
	 */
	private void ageDescList() {
		
		System.out.println("\n<연령별로 사용 가능한 장난감>");
		
		// 장난감 목록 가져오기
		List<Toy> resultList = new ArrayList<>(toyList);
		
		// 장난감 목록에 있는 연령들 넣기 위한 변수 선언
		Set<Integer> ageList = new HashSet<Integer>();
		
		// 장난감 목록의 연령들 ageList에 넣기
		for(int i = 0; i < resultList.size(); i++) {
			ageList.add(resultList.get(i).getAge());
			
		}
		
		// 연령의 중복 제거를 위한 Iterator사용
		Iterator<Integer> age = ageList.iterator();
		
		while(age.hasNext()) {
			
			// 첫번째 부터 연령 값을 ageNum 변수값에 초기화
			int ageNum = age.next();
			
			System.out.println("[연령 : " + ageNum + "세]");
			
			// 장난감 번호값
			int index = 1;
			
			// 가져온 연령값과 목록에서의 연령과 동일할 경우만 출력
			for(int i = 0; i < resultList.size(); i++) {
				if(ageNum == resultList.get(i).getAge()) {
					System.out.println(index + ". " + resultList.get(i));
					index++;
				}
				
			}
			
		}
		
	}
	
	
	/**
	 * 6. 재료 추가: 새로운 재료를 등록하고, 장난감에 해당 재료를 추가
	 */
	public void addIngre() {
		
		System.out.println("\n<재료 추가>");
		System.out.println("***현재 등록된 재료***");
		
		// Map 의 Key, Value 표현방식인 Entrt 사용
		for(Entry<Integer, String> entry : ingreList.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
		System.out.println("***********************");
		
		System.out.print("재료 고유번호(key) 입력 : ");
		int keyNum = sc.nextInt();
		sc.nextLine();
		
		System.out.print("재료명 입력 : ");
		String ingreName = sc.next();
		
		// 입력한 키가 이미 등록되어 있을 경우
		if(ingreList.containsKey(keyNum)) {
			System.out.println("이미 해당키에 재료가 등록되어 있습니다.");
			System.out.print("덮어쓰시겠습니까?(Y/N)");
			char check = sc.next().toUpperCase().charAt(0);
			
			// 덮어쓰기(Y)를 원하는 경우
			if(check == 'Y') {
				// 해당 키에 다시 put으로 값을 대입
				ingreList.put(keyNum, ingreName);
				System.out.println("재료가 성공적으로 덮어쓰기 되었습니다.");
				
			} else {
				System.out.println("덮어쓰기가 취소되었습니다.");
				return;
			}
		
		// 입력한 키가 등록되어 있지 않을 경우
		} else {
			ingreList.put(keyNum, ingreName);
			System.out.println("새로운 재료가 성공적으로 등록되었습니다.");
			
		}
		
	}
	
	/**
	 * 7. 재료 제거: 등록된 재료를 삭제하고, 해당하는 재료를 
	 *               사용하는 장난감에서 제거
	 */
	public void deleteIngre() {
		
		System.out.println("\n<재료 삭제>");
		System.out.println("***현재 등록된 재료***");
		
		// Map 의 Key, Value 표현방식인 Entrt 사용
		for(Entry<Integer, String> entry : ingreList.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
		System.out.println("***********************");
		
		System.out.print("삭제할 재료명 입력 : ");
		String ingreName = sc.next();
		
		// 재료 목록중에 입력한 재료명이 있을 경우
		if(ingreList.containsValue(ingreName)) {
			// 해당 재료명의 데이터를 삭제
			ingreList.values().remove(ingreName);
			System.out.println("재료'" + ingreName + "'가 성공적으로 제거되었습니다.");
			
		// 재료 목록중에 입력한 재료명이 없을 경우
		} else {
			System.out.println("해당 이름의 재료가 존재하지 않습니다.");
		}
		
	}
	
}
