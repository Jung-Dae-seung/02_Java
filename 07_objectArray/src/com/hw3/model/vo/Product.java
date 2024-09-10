package com.hw3.model.vo;

public class Product {

	private int pId; 		// 제품 번호
	private String pName; 	// 제품명
	private int price; 		// 제품가격
	private double tax;		// 제품 세금
	
	public Product() {}

	public Product(int pId, String pName, int price, double tax) {
		this.pId = pId;
		this.pName = pName;
		this.price = price;
		this.tax = tax;
	}
	
	public String information() {
		
		String str = "";
		
		str += "제품 번호 : " + this.pId + "\n";
		str += "제품 명 : " + this.pName + "\n";
		str += "제품 가격 : " + this.price + "\n";
		str += "제품 세금 : " + this.tax + "\n";
		
		return str;
		
	}

	public int getpId() {
		return pId;
	}

	public void setpId(int pId) {
		this.pId = pId;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public double getTax() {
		return tax;
	}

	public void setTax(double tax) {
		this.tax = tax;
	}
	
	
}
