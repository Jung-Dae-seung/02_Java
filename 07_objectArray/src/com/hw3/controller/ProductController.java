package com.hw3.controller;

import java.util.Scanner;

import com.hw3.model.vo.Product;

public class ProductController {

	// 초기화 블럭을 이용하여 10개의 Product 배열 크기 할당
	private Product[] pro = null;
	
	public static int count = 0;	// 현재 추가된 객체 수
	public static int pCount = 1;
	Scanner sc = new Scanner(System.in);
	
	{
		pro = new Product[10];
	}
	
	public void mainMenu() {
		
		int menuNum = 0;
		
		do {
			
			System.out.println("======제품 관리 메뉴======");
			System.out.println("1. 제품 정보 추가");
			System.out.println("2. 제품 전체 조회");
			System.out.println("3. 해당 제품 수정");
			System.out.println("4. 해당 제품 삭제");
			System.out.println("5. 제품 검색");
			System.out.println("0. 프로그램 종료");
			
			System.out.print("메뉴 입력 : ");
			menuNum = sc.nextInt();
			
			switch (menuNum) {
				case 1 :	
					productInput();
					break;
				case 2 :
					productPrint();
					break;
				case 3 :
					productPrint();
					break;
				case 4 :
					productDel();
					break;
				case 5 :
					productSearch();
					break;
				case 0 :
					System.out.println("프로그램 종료...");
					break;
				default: System.out.println("번호를 잘못 입력했습니다.");
			}
			
		} while (menuNum != 0);
		
	}
	
	// 제품 정보 추가
	public void productInput() {
		
		// 키보드로 도서 정보를 입력 받아 객체 생성
		// -> Product 생성자 내부에서 ProductController의 count클래스 변수 값이 1씩 증가
		// 현재 카운트 인덱스에 생성한 주소 저장
		
		System.out.println("\n======제품 정보 추가======");
		
		System.out.print("제품명 : ");
		String pName = sc.next();
		
		System.out.print("제품 가격 : ");
		int pPrice = sc.nextInt();
		
		System.out.print("제품 세금 :");
		double tax = sc.nextDouble();
		
		pro[count] = new Product(pCount, pName, pPrice, tax);
		count++;
		pCount++;
		
		System.out.println("제품 추가 완료");
		
	}
	
	// 제품 전체 조회
	public void productPrint() {
		
		System.out.println("\n======제품 전체 조회======");
		
		// 현재까지 기록된 도저 정보 모두 출력
		for(int i = 0 ; i < count; i++) {
			if(pro[i] != null) {
				System.out.println(pro[i].information());
			}
		}
		
	}
	
	public void productDel() {
		
		System.out.println("\n======해당 제품 삭제======");
		
		System.out.print("삭제하려는 제품명 : ");
		String delName = sc.next();
		
		// 제품을 삭제하기 위한 인덱스
	    int deleteIndex = -1;

	    // 제품을 찾는 루프
	    for(int i = 0; i < count; i++) {
	        if(pro[i].getpName().equals(delName)) {
	            deleteIndex = i;
	            break;
	            
	        }
	        
	    }

	    // 제품을 찾았을 경우
	    if(deleteIndex != -1) {
	        // 삭제할 위치 이후의 요소를 왼쪽으로 이동
	        for(int i = deleteIndex; i < count - 1; i++) {
	            pro[i] = pro[i + 1];
	            
	        }
	        
	        // 마지막 요소를 null로 설정 (선택 사항)
	        pro[count - 1] = null;
	        // 제품 수 감소
	        count--;
	        
	        System.out.println("해당 제품 삭제 완료.");
	        
	    } else {
	        System.out.println("해당 제품명이 없습니다.");
	        
	    }
		
	}
	
	// 제품 검색
	public void productSearch() {
		
		System.out.println("\n======제품 검색======");
		
		System.out.print("검색할 제품명 : ");
		String srchPname = sc.next();
		
		for(int i = 0; i < count; i++) {
			
			if(pro[i].getpName().equals(srchPname)) {
				System.out.println("\n검색한 제품명의 정보");
				System.out.println(pro[i].information());
				
			} else {
				System.out.println("해당 제품명이 없습니다.");
				
			}
				
			
		}
		
	}
	
}
