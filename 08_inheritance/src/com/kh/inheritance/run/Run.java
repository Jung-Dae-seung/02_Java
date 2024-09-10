package com.kh.inheritance.run;

import com.kh.inheritance.model.dto.BasicPhone;
import com.kh.inheritance.model.dto.SmartPhone;

public class Run {

	public static void main(String[] args) {
		
		// SmartPhone 객체 생성
		SmartPhone smPh = new SmartPhone("Samsung", "Galaxy S20", 2020, 1200000, "Android", 128);
		smPh.printInfo();
		
		System.out.println("====================================");
		
		// BasicPhone 객체 생성
		BasicPhone bsPh = new BasicPhone("Nokia", "3310", 2000, 100000, true);
		bsPh.printInfo();		// 오버라이딩 X
		bsPh.checkKeyboard();
		
	}
	
}
