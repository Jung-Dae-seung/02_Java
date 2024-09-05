package edu.kh.oop.practice.model.service.BookService;

import edu.kh.oop.practice.model.vo.Book.BookVO;

public class BookService {

	public void practice() {
		
		// 1) 기본 생성자를 이용하여 첫 번째 Book 객체 생성
		BookVO book = new BookVO();
		
		// 2) 매개변수 생성자를 이용하여 두 번째 Book 객체 생성 (사용 데이터 참고)
		BookVO book2 = new BookVO("자바의정석", 30000, 0.2, "남궁성");
		
		// 3) 객체가 가진 필드 값을 toString()을 이용하여 출력
		System.out.println(book.toString());
		System.out.println(book2.toString());
		
		System.out.println("=============================");

		// 4) 첫 번째 객체가 가진 값을 setter를 이용하여 수정
		book.setTitle("C언어");
		book.setPrice(30000);
		book.setDiscountRate(0.1);
		book.setAuthor("홍길동");
		
		// 5) 수정된 객체의 필드 값을 toString() 메소드를 이용하여 출력
		System.out.println(book.toString());
		System.out.println("=============================");

		// 6) 각 객체의 할인율을 적용한 책 가격을 계산해서 출력
		int price = book.getPrice();
		int price2 = book2.getPrice();
		
		price = (int) (price - (price * book.getDiscountRate()));
		price2 = (int) (price2 - (price2 * book2.getDiscountRate()));
		
		
		// 7) 할인된 가격 = 가격 - (가격 * 할인율)
		
		
		System.out.println("도서명 : " + book.getTitle());
		System.out.printf("할인된 가격 : %d원\n", price);
		System.out.println("도서명 : " + book2.getTitle());
		System.out.printf("할인된 가격 : %d원\n", price2);
		
		
		
	}
}
