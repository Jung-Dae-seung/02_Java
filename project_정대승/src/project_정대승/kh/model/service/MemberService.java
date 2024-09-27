package project_정대승.kh.model.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import project_정대승.kh.model.dto.Member;

public class MemberService extends ObjectService{
	
	private Scanner sc = new Scanner(System.in);
	private List<Member> memberList = new ArrayList<Member>();
	private Member loginMember = null;
	
	public MemberService() {
		memberList = memberInputData();
		
	}
	
	public void displayMenu() {
		
		try {
			int checkNum = 0;
			int menuNum = 0;
			
			do {
				
				if(loginMember == null) {
				
					System.out.println("=== 도서구매 프로그램 ===");
					System.out.println("1. 회원가입");
					System.out.println("2. 로그인");
					System.out.println("3. 전체 회원 조회");
					System.out.println("4. 비밀번호 찾기");
					System.out.println("0. 프로그램 종료");
					
					System.out.print("메뉴 입력 : ");
					menuNum = sc.nextInt();
					sc.nextLine();
					
					switch(menuNum) {
					case 2 : loginMember(); break;
					case 3 : allMember(); break;
					case 0 : System.out.println("프로그램 종료..."); break;
					default : System.out.println("잘못 입력하셨습니다. 다시 입력하세요!");
					
					}
					
				} else {
					checkNum = new BookStoreService().displayMenu(loginMember);
					if(checkNum != 0) {
						loginMember = null;
					}
					
				}
				
			} while (menuNum != 0);
		
		} catch (Exception e) {
			e.printStackTrace();
			
		}
			
		sc.close();
		
	}
	
	public void loginMember() {
		
		System.out.println("\n<로그인>");
		
		System.out.print("아이디 입력 : ");
		String id = sc.next();
		
		System.out.print("비밀번호 입력 : ");
		String pw = sc.next();
		
		for(int i = 0; i < memberList.size(); i++) {
			
			if(memberList.get(i) != null) {	// 회원정보가 있을 경우
				if( memberList.get(i).getId().equals(id) && 
						memberList.get(i).getPw().equals(pw)) {
					
					loginMember = memberList.get(i);
					break;	
				}
				
			}
			
		}
		
		// 4) 로그인 성공/실패 여부에 따라 결과 값 반환
		if(loginMember == null) {	// 로그인 실패
			System.out.println("아이디 또는 비밀번호가 일치하지 않습니다.");
			
		} else {	// 로그인 성공
			System.out.println(loginMember.getName() + "님 환영합니다!");
			
		}
		
		
	}
	
	public void allMember() {
		
		System.out.println("\n<전체 회원 조회>");
		
		for(Member list : memberList) {
			System.out.println(list.getList());
			
		}
		
		System.out.println();
		
	}
	
}
