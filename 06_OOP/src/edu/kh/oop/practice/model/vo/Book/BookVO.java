package edu.kh.oop.practice.model.vo.Book;

public class BookVO {

	// 필드
	private String title;			// 도서명
	private int price;				// 가격
	private double discountRate;	// 할인률
	private String author;			// 저자명
	
	// 생성자
	public BookVO() {}
	
	// 매개변수생성자
	public BookVO(String title, int price, double discountRate, String author) {
		super();
		this.title = title;
		this.price = price;
		this.discountRate = discountRate;
		this.author = author;
	}
	
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public double getDiscountRate() {
		return discountRate;
	}
	
	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}

	
	// 메서드
	// 어노테이션 : 컴파일러용 주석
	// Overriding : 재정의(메서드)
	@Override
	public String toString() {
		return title + " / " + price + " / " + discountRate + " / " + author;
	}
	
	/**
	 * 	현실 객체 : 자신의 속성과 기능이 다른 것들과 구분되어 식별 가능한 것
		객체 지향 언어 : 현실 세계는 사물이나 개념처럼 독립되고 구분되는 각각의 객체로 이루어져 있으며 
						 발생하는 모든 사건들은 객체들의 상호작용이다.
		자바 객체 : 클래스에 정의된 내용대로 new 연산자를 통해 메모리 영역에 생성된 것
		class : 객체의 특성에 대한 정의를 한 것 
		new 연산자 : heap이라는 공간에 새롭게 할당해주는 연산자
		추상화 : 필요한 공통점을 추출하고 불필요한 부분을 제거하는 과정
		캡슐화 : 추상화를 통해 정리된 데이터들과 기능을 하나로 묶어관리
		캡슐화 원칙 : 1. 접근 권한은 private을 원칙한다.
					  2. 멤버 메소드는 클래스 내부에 작성한다.
					  3. 멤버 메소드는 public 으로 설정
		메서드/기능의 '정의'란 : 해당 메서드/기능 함수 안에 수행될 연산을 작성
		메서드의 '호출' 이란 : 정의된 메서드를 호출하여 함수 내에 작성된 연산 수행
		return : 해당 메서드를 종료하고 호출한 메서드로 돌아가는 예약어
		
		public String ex1() {
		    return "Hi";
		}
		
		위 메서드 상세히 해석 : 접근제한자 public 반환형 String의 ex1이라는 메서드를 생성
								반환값으로 Hi라는 문자열을 보낸다.
								ex1() 호출하게 되면 String형 Hi를 반환
		
	 */
	
}
