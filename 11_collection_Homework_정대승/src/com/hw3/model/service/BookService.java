package com.hw3.model.service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import com.hw3.model.dto.Book;

public class BookService {
	
	Scanner sc = new Scanner(System.in);
	
	private Set<Book> bookList = new HashSet<Book>();
	
	public BookService() {
		
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
	
	public void bookList() {
		
		List<Book> list = new ArrayList<>(bookList);
		list.sort(Comparator.comparing(Book::getBno));
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		 
		
	}
	
	public void updateBook() {
		
		System.out.println("======도서 수정======");
		System.out.print("수정할 도서 번호를 입력하세요 : ");
		int bno = sc.nextInt();
		sc.nextLine();
		
		System.out.println("1. 도서명");
		System.out.println("2. 도서 저자");
		System.out.println("3. 도서 가격");
		System.out.println("4. 도서 출판사");
		System.out.println("0. 수정 종료");
		System.out.print("어떤 정보를 수정하시겠습니까? ");
		int updateNum = sc.nextInt();
		
		Book updateBook = null;
		
		for(Book book : bookList) {
			if(bno == book.getBno()) {
				updateBook = book;
			}
		}
		
		if(updateBook == null) {
			System.out.println("해당 도서번호의 책이 없습니다.");
			return;
		}
		
		
		try {
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
	
}
