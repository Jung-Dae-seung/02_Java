package com.hw3.model.dto;

import java.util.Objects;

public class Book {

	private int bno;
	private String bookName;
	private String author;
	private int price;
	private String publisher;
	
	public Book() {}

	public Book(int bno, String bookName, String author, int price, String publisher) {
		super();
		this.bno = bno;
		this.bookName = bookName;
		this.author = author;
		this.price = price;
		this.publisher = publisher;
	}

	public int getBno() {
		return bno;
	}

	public void setBno(int bno) {
		this.bno = bno;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	@Override
	public int hashCode() {
		return Objects.hash(author, bno, bookName, price, publisher);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return Objects.equals(author, other.author) && bno == other.bno && Objects.equals(bookName, other.bookName)
				&& price == other.price && Objects.equals(publisher, other.publisher);
	}

	@Override
	public String toString() {
		return  bno + "번 도서 : [도서제목 : "+ bookName + 
				" / 도서저자 : " + author + 
				" / 도서가격 : " + price +
				"원 / 출판사 : " + publisher + "]";
	}
	
	
}
