package edu.kh.oop.practice.snack.controller;

import edu.kh.oop.practice.snack.model.vo.Snack;

public class SnackController {

	Snack s = new Snack();
	
	public SnackController() {}
	
	// 입력한 데이터 저장이후 결과 반환
	public String saveData(String kind, String name, String flavor, int numOf, int price) {
		
		// 데이터를 setter를 이용해 저장
		s.setKind(kind);
		s.setName(name);
		s.setFlavor(flavor);
		s.setNumOf(numOf);;
		s.setPrice(price);
		
		// 저장완료 되었다는 결과를 반환
		return "저장 완료되었습니다.";
		
	}
	
	// 저장된 데이터를 반환하는 메소드
	public String confirmData() {
		
		return s.information();
		
	}
	
}
