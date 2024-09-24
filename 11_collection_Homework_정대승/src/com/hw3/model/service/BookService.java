package com.hw3.model.service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

import com.hw3.model.dto.Book;

public class BookService {
	
	Scanner sc = new Scanner(System.in);
	
	private Set<Book> bookList = new HashSet<Book>();
	
	// 삭제/삽입이 빈번하게 일어나는 즐겨찾기 이므로
	// LinkedList로 초기화
	private List<Book> favoBook = new LinkedList<Book>();
	
	public BookService() {
		
		// 책 추가
		bookList.add(new Book(1111, "세이노의 가르침", "세이노", 6480, "데이원"));
		bookList.add(new Book(2222, "문과남자의 과학공부", "유시민", 15750, "돌베개"));
		bookList.add(new Book(3333, "역행자", "자청", 17550, "웅진지식하우스"));
		bookList.add(new Book(4444, "꿀벌의 예언", "베르나르 베르베르", 15120, "열린책들"));
		bookList.add(new Book(5555, "도둑맞은 집중력", "요한 하리", 16920, "어크로스"));
		
	}
	
	public void displayMenu() {
		
		System.out.println("===도서 목록 프로그램");
		int menuNum = 0;
		
		do {
			
			System.out.println("1. 도서 등록");
			System.out.println("2. 도서 조회");
			System.out.println("3. 도서 수정");
			System.out.println("4. 도서 삭제");
			System.out.println("5. 즐겨찾기 추가");
			System.out.println("6. 즐겨찾기 삭제");
			System.out.println("7. 즐겨찾기 조회");
			System.out.println("8. 추천도서 뽑기");
			System.out.println("0. 프로그램 종료");
			System.out.print("메뉴를 입력하세요 : ");
			menuNum = sc.nextInt();
			
			try {
				
				switch (menuNum) {
				case 1:
					insertBook();
					break;
				case 2:
					bookList();
					break;
				case 3:
					updateBook();
					break;
				case 4:
					delBook();
					break;
				case 5:
					addFavoBook();
					break;
				case 6:
					delFavoBook();
					break;
				case 7:
					srchFavoBook();
					break;
				case 8:
					pickBook();
					break;
				default:
					System.out.println("등록된 번호만 입력해주세요.");
					break;
				}
				
			} catch (InputMismatchException e) {
				System.out.println("\nerror : 입력형식이 유효하지 않습니다. 다시 시도해주세요");
				sc.nextLine();	
				
				menuNum = -1;	// 첫 반복 시 잘못력하는 경우 
				
			}
			
			
		} while (menuNum != 0);
		
	}

	/**
	 * 1. 도서 등록
	 */
	public void insertBook() {
		
		System.out.println("======도서 등록======");
		
		System.out.print("도서 번호 : ");
		int bno = sc.nextInt();
		sc.nextLine();
		
		System.out.print("도서 제목 : ");
		String bookName = sc.nextLine();
		
		System.out.print("도서 저자 : ");
		String author = sc.nextLine();
		
		System.out.print("도서 가격 : ");
		int price = sc.nextInt();
		sc.nextLine();
		
		System.out.print("도서 출판사 : ");
		String publisher = sc.nextLine();
		
		bookList.add(new Book(bno, bookName, author, price, publisher));
		
		System.out.println("등록 완료");
		
	}
	
	/**
	 * 2. 도서 조회 책 번호 오름차순으로 정렬
	 */
	public void bookList() {
		
		List<Book> list = new ArrayList<>(bookList);
		list.sort(Comparator.comparing(Book::getBno));
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		 
		
	}
	
	/**
	 * 3. 도서 수정 책이 있을경우 도서명, 저자, 가격, 출판사중
	 *    선택하여 수정 진행하고 없을시 책이 없다고 출력후 종료
	 */
	public void updateBook() {
		
		System.out.println("\n======도서 수정======");
		System.out.print("수정할 도서 번호를 입력하세요 : ");
		int bno = sc.nextInt();
		sc.nextLine();
		
		// Book 객체 생성
		Book updateBook = null;
		
		// bookList에서 해당 도서번호가 있을시
		// updateBook에 값을 넣어줌
		for(Book book : bookList) {
			if(bno == book.getBno()) {
				updateBook = book;
			}
		}
		
		// 해당 도서번호가 없을시 책이 없습니다 출력
		if(updateBook == null) {
			System.out.println("해당 도서번호의 책이 없습니다.");
			return;
		}
		
		System.out.println("1. 도서명");
		System.out.println("2. 도서 저자");
		System.out.println("3. 도서 가격");
		System.out.println("4. 도서 출판사");
		System.out.println("0. 수정 종료");
		System.out.print("어떤 정보를 수정하시겠습니까? ");
		int updateNum = sc.nextInt();
		
		try {
			// 입럭한 updateNum으로 해당 case 진행
			switch (updateNum) {
			case 1:
				System.out.println("=====도서명 수정");
				System.out.print("수정할 도서명을 입력하세요 : ");
				updateBook.setBookName(sc.next());
				
				break;
			case 2:
				System.out.println("=====도서 저자 수정");
				System.out.print("수정할 저자명을 입력하세요 : ");
				updateBook.setAuthor(sc.next());
				
				break;
			case 3:
				System.out.println("=====도서 가격 수정=====");
				System.out.print("수정할 가격을 입력하세요 : ");
				updateBook.setPrice(sc.nextInt());
				
				break;
			case 4:
				System.out.println("=====도서 출판사 수정=====");
				System.out.print("수정할 출판사명을 입력하세요 : ");
				updateBook.setPublisher(sc.next());
				
				break;
			case 0:
				break;
			default:
				System.out.println("등록된 번호만 입력해주세요.");
				break;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("수정 완료");
		
	}
	
	/**
	 * 4. 도서 삭제 해당되는 번호를 목록에서 조회해서
	 *    목록에 있을시 삭제 여부 확인후 삭제 진행
	 *    목록에 없을시 삭제 취소
	 */
	public void delBook() {
		
		System.out.println("\n=====도서 삭제=====");
		
		System.out.print("삭제할 도서의 번호를 입력하세오 : ");
		int bno = sc.nextInt();
		sc.nextLine();
		
		// 삭제하려는 book 데이터 넣기위한 변수
		Book delBook = null;
		
		// 입력한 도서번호가 목록에 있을경우 delbook에 넣기
		for(Book book : bookList) {
			if(book.getBno() == bno) {
				delBook = book;
			}
		}
		
		// delBook안에 아무것도 안들어 갔을경우 번호가 없음 출력
		if(delBook == null) {
			System.out.println("해당 번호가 없습니다");
			
		} else {
			System.out.print("정말 삭제하시겠습니까?(Y/N) : ");
			char check = sc.next().toUpperCase().charAt(0);
			
			if(check == 'N') {
				System.out.println("삭제를 진행하지 않습니다.");
				
			} else if(check == 'Y') {
				bookList.remove(delBook);
			} 
			
		}
			
		System.out.println("삭제 끝");
		
	}

	/**
	 * 5. 즐겨찾기 추가
	 */
	public void addFavoBook() {
		
		System.out.println("\n=====즐겨 찾기 등록=====");
		System.out.print("등록할 도서 번호 입력 : ");
		int bno = sc.nextInt();
		sc.nextLine();
		
		boolean check = false;
		
		// bookList를 반복자 Iterator book 변수에 초기화
		Iterator<Book> book = bookList.iterator();

		// bookList를 loop돌려서 입력한 도서 번호와 동일한 데이터가 있을시
		// 즐겨찾기 favoBook변수에 해당 도서 내용 넣기
		while(book.hasNext()) {
			Book addBook = book.next();
			
			if(addBook.getBno() == bno) {
				favoBook.add(addBook);
				check = true;
				break;
			} 
			
		}
		
		if(check) {
			System.out.println("등록성공");
			
		} else {
			System.out.println("해당되는 도서 번호가 없습니다.");
			
		}
		
	}

	/**
	 * 6. 즐겨찾기 삭제 즐겨찾기 컬렉션에서 입력한 도서 번호를 삭제
	 *    즐겨찾기가 비어있을 경우 등록된 도서가 없다고 출력
	 *    
	 */
	public void delFavoBook() {
		
		System.out.println("\n=====즐겨 찾기 삭제=====");
		boolean check = true;
		
		// favoBook 변수가 비어있을 경우
		if(favoBook.isEmpty()) {
			System.out.println("등록된 도서가 없습니다. 도서를 등록해주세요.");
			
		} else {
			System.out.print("즐겨찾기 삭제할 도서 번호를 입력하세요 : ");
			int bno = sc.nextInt();
			sc.nextLine();
			
			// loop를 돌려 입력한 도서번호가 즐겨찾기 목록에 있을경우
			// 해당 도서를 즐겨찾기에서 삭제
			for(int i = 0; i < favoBook.size(); i++) {
				if(favoBook.get(i).getBno() == bno) {
					favoBook.remove(i);
					check = false;
					break;
				}
				
			}
			
		}
		
		if(check) {
			System.out.println("해당 도서 번호의 도서가 없습니다.");
		}
		
	}

	/**
	 * 7. 즐겨 찾기 조회
	 */
	public void srchFavoBook() {
		if(favoBook == null) {
			System.out.println("등록된 도서가 없습니다. 도서를 등록해주세요.");
			
		} else {
			for(int i = 0; i < favoBook.size(); i++) {
				System.out.println(favoBook.get(i));
				
			}
			
		}

	}

	/**
	 * 8. 추천도서 뽑기 등록된 도서들 중에서 랜덤으로 
	 *    한개의 도서 제목을 가져오기
	 */
	public void pickBook() {
		
		List<Book> list = new ArrayList<Book>(bookList);
		Random random = new Random();
		
		// 도서 목록의 개수만큼 랜덤을 돌리고
		// 그중 한개의 값을 number변수에 대입
		int number = random.nextInt(list.size());
		
		System.out.println(list.get(number).getBookName());
		
	}
	
	
	
}
