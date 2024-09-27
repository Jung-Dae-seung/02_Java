package project_정대승.kh.model.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import project_정대승.kh.model.dto.Book;
import project_정대승.kh.model.dto.Member;

public class BookStoreService extends ObjectService{
	
	private Scanner sc = new Scanner(System.in);
	private List<Book> bookList = new ArrayList<Book>();
	private Member loginMember = null;
	
	public BookStoreService() {
		bookList = bookInputData();
		
	}

	public int displayMenu(Member member) {
		
		loginMember = member;
		int checkNum = 0;
		
		try {
			
			int menuNum = 0;
			
			do {
				
				if(member.getName().equals("관리자")) {
				
					System.out.println("===도서 목록 프로그램===");
					System.out.println("1. 도서 등록");
					System.out.println("2. 도서 조회");
					System.out.println("3. 도서 수정");
					System.out.println("4. 도서 삭제");
					System.out.println("5. 도서 구매");
					System.out.println("6. 로그아웃");
					System.out.println("0. 프로그램 종료");
	
					System.out.print("메뉴를 입력하세요 : ");
					
					menuNum = sc.nextInt();
					
					switch(menuNum) {
					case 6 : 
						logOut();
						checkNum = 1;
						menuNum = 0;
						break;
					case 0 : System.out.println("종료되었습니다."); break;
					default : System.out.println("메뉴에 있는 번호만 입력하세요!"); break;
					}
					
				} else {
					break;
				} 
				
				
			} while(menuNum != 0);
			
		} catch (Exception e) {
			e.printStackTrace(); 
			
		}
		
		return checkNum;
		
	}
	
	public void totalList() {
		
		System.out.println("\n<전체 도서 조회>");
		
		for(Book list : bookList) {
			System.out.println(list);
		}
		
		System.out.println();
		
	}
	
	public void logOut() {
		
		System.out.println("<로그아웃 진행>");
		loginMember = null;
		
	}
}
