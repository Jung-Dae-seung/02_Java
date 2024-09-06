package edu.kh.oop.method.service;

import java.util.Scanner;

import edu.kh.oop.method.vo.Member;


public class MemberService {

	// 속성 (필드)
	private Scanner sc = new Scanner(System.in);
	
	private Member memberInfo = null;	// 가입한 회원의 정보를 저장할 변수
	private Member loginMember = null;	// 로그인한 회원의 정보를 저장할 변수
	
	// 기능 (생성자, 메서드)
	
	// 메뉴 화면 출력 기능
	public void displayMenu() {
		
		int menuNum = 0;	// 메뉴 선택용 변수
		
		do {
			System.out.println("======회원 정보 관리 프로그램=====");
			System.out.println("1. 회원 가입");
			System.out.println("2. 로그인");
			System.out.println("3. 회원 정보 조회");
			System.out.println("4. 회원 정보 수정");
			System.out.println("0. 프로그램 종료");
			
			System.out.print("메뉴 입력 : ");
			menuNum = sc.nextInt();
			sc.nextLine();	// 입력 버퍼에 남은 개행문자 제거용
			
			switch(menuNum) {
			
			case 1 : System.out.println( signUp() ); break;  
			case 2 : System.out.println( login() ); break;
			case 3 : System.out.println( inquriy() ); break;
			case 4 : System.out.println( regist() ); break;
			case 0 : System.out.println("프로그램 종료... "); break;
			default : System.out.println("잘못 입력하셨습니다.. 메뉴에 있는 번호만 입력해주세요!");
			}
			
			
		} while(menuNum != 0);	// menuNum이 0이면 반복 종료
		
	}
	
	// 회원 가입 기능
	public String signUp() {
		
		System.out.println("\n*******회원 가입*******");
		
		System.out.print("아이디 : ");
		String memberId = sc.next();
		
		System.out.print("비밀번호 : ");
		String memberPw = sc.next();
		
		System.out.print("비밀번호 확인 : ");
		String memberPw2 = sc.next();
		
		System.out.print("이름 : ");
		String memberName = sc.next();
		
		System.out.print("나이 : ");
		int memberAge = sc.nextInt(); 
		
		// 비밀번호, 비밀번호확인이 일치하면 회원가입
		// 일치하지 않으면 회원가입 실패
		if( memberPw.equals(memberPw2) ) {	// 일치하는 경우
			
			memberInfo = new Member(memberId, memberPw2, memberName, memberAge);
			
			return "회원 가입 성공!!!";
		} else {	// 일치하지 않는 경우
			return "회원 가입 실패!! (비밀번호 불일치)";
		}
		
		
	}
	
	// 로그인 기능
	public String login() {
		
		System.out.println("\n*******로그인*******");
		
		// 회원가입을 했는지부터 확인
		// == memberInfo가 객체를 참조하고 있는지 확인 (null 인지 아닌지 확인)
		
		if(memberInfo == null) {	// 회원가입을 안한 경우
			// null : 아무것도 참조하고 있지 않음
			return "회원가입 부터 진행해주세요!";
			
		} 
		
		// 회원가입 했다면, 로그인 기능 수행
		
		System.out.print("아이디 : ");
		String memberId = sc.next();
		
		System.out.print("비밀번호 : ");
		String memberPw = sc.next();
		
		// 회원 가입 정보(memberInfo 가 참조하는 Member객체)에
		// 저장된 아이디, 비밀번호가 
		// 입력한 아이디, 비밀번호와 같으면 "로그인 성공"
		// 같이 않으면 "아이디 또는 비밀번호 불일치" 리턴
		
		// 아이디, 비밀번호가 모두 일치할 경우
		if( memberId.equals(memberInfo.getMemberId()) &&
				memberPw.equals(memberInfo.getMemberPw())) {
			// 로그인하려고 입력받은 memberId와
			// memberInfo 필드에서 참조중인 Member객체의 memberId가 같은지 확인
			// &&
			// 로그인하려고 입력받은 memberPw와
			// memberInfo 필드에서 참조중인 Member객체의 memberPw가 같은지 확인
			
			// loginMember에 memberInfo가 참조하고 있는 객체의 주소 대입
			loginMember = memberInfo;
			// 얕은 복사
			
			// 회원가입 정보를 loginMember에 대입하여
			// 어떤 회원이 로그인했는지를 구분할 수 있게 함
			return loginMember.getMemberName() + "님 환영합니다.";
			
		} else {
			
			return "아이디 또는 비밀번호가 일치하지 않습니다!";
		}
		
		
		
		
	}
	
	// 회원 정보 조회 기능
	// -> 조회하려면?
	// -> 로그인을 했나 안했나 따져보기
	// 1. 로그인했으면? 현재 로그인한 사람의 정보를 저장하고 있는 객체에서
	// 정보 꺼내오기(이름, 아이디, 나이)
	// 2. 로그인 안했으면? 로그인후 이용해라..
	public String inquriy() {
		
		System.out.println("\n********회원 정보 조회********");
		
		if(loginMember == null) {
			return "로그인후 이용하세요.";
			
		} else {
			return "이름: " + loginMember.getMemberName() + 
					"\n아이디 : " + loginMember.getMemberId() + 
					"\n나이 : " + loginMember.getMemberAge();
			
		}
		
	}
	
	
	// 회원 정보 수정 기능
	public String regist() {
		
		System.out.println("\n********회원 정보 수정********");
		
		if(loginMember == null) {
			return "로그인후 이용하세요.";
			
		} else {
			System.out.print("아이디 : ");
			String memberId = sc.next();
			
			System.out.print("이름 : ");
			String memberName = sc.next();
			
			System.out.print("나이 : ");
			int memberAge = sc.nextInt();
			
			System.out.print("비밀번호 확인 : ");
			String memberPw = sc.next();
			
			if(memberPw.equals(loginMember.getMemberPw())) {
				loginMember.setMemberId(memberId);
				loginMember.setMemberName(memberName);
				loginMember.setMemberAge(memberAge);
				
				return "회정 정보 수정이 완료되었습니다.";
				
			} else {
				return "비밀번호가 틀려서 수정되지 않았습니다";
				
			}
			
			
		}
		
	}
	
	
}
