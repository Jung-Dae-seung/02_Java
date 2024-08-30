package edu.kh.control.practice;

import java.util.Scanner;

public class ConditionPractice {

	Scanner sc = new Scanner(System.in);
	
	public void practice1() {
		// 키보드로 입력 받은 정수가 
		// 양수이면서 짝수일 때만 “짝수입니다.”출력하고
		// 짝수가 아니면 “홀수입니다.“를 출력하세요.
		// 양수가 아니면 “양수만 입력해주세요.”를 출력하세요.
		
		System.out.print("숫자 한 개 입력하세요 : ");
		int number = sc.nextInt();
		
		if(number > 0) {
			if(number % 2 == 0) {
				System.out.println("짝수입니다.");
			} else {
				System.out.println("홀수입니다.");
			}
		} else {
			System.out.println("양수만 입력해주세요.");
		}
		
	}
	
	public void practice2() {
		// 국어, 영어, 수학 세 과목의 점수를 키보드로 입력 받고 
		// 합계와 평균을 계산하고
		// 합계와 평균을 이용하여 합격 / 불합격 처리하는 기능을 구현하세요.
		// (합격 조건 : 세 과목의 점수가 각각 40점 이상이면서 
		//	평균이 60점 이상일 경우)

		// 합격 했을 경우 과목 별 점수와 합계, 평균, “축하합니다, 합격입니다!”를 출력하고
		// 불합격인 경우에는 “불합격입니다.”를 출력하세요.
		
		System.out.print("국어점수 : ");
		int kor = sc.nextInt();
		
		System.out.print("수학점수 : ");
		int math = sc.nextInt();
		
		System.out.print("영어점수 : ");
		int end = sc.nextInt();
		
		int sum = kor + math + end;
		float avg = sum / 3;
		
		if(kor >= 40 && math >= 40 && end >= 40 && avg >= 60) {
			
			System.out.printf("국어 : %d\n", kor);
			System.out.printf("수학 : %d\n", math);
			System.out.printf("영어 : %d\n", end);
			System.out.printf("합계 : %d\n", sum);
			System.out.printf("평균 : %.1f\n 축하합니다, 합격입니다!", avg);
			
		} else {
			System.out.println("불합격입니다.");
		}
		
	}
	
	public void practice3() {
		// 1~12 사이의 수를 입력 받아 해당 달의 일수를 출력하세요.
		// (2월 윤달은 생각하지 않습니다.)
		// 잘못 입력한 경우 “OO월은 잘못 입력된 달입니다.”를 출력하세요. 
		// (switch문 사용)
		
		System.out.print("1~12 사이의 정수 입력 : ");
		int month = sc.nextInt();
		
		String result;
		
		switch (month) {
			case 1, 3, 5, 7, 8, 10, 12: { 
				result = month+"월은 31일까지 있습니다.";	
				break;
			}
			case 2, 4, 6, 9, 11: {
				result = month+"월은 30일까지 있습니다.";	
				break;
			}
			default: result = month+"월은 잘못 입력된 달입니다.";
		}
		
		System.out.println(result);
		
	}
	
	public void practice4() {
		// 키, 몸무게를 double로 입력 받고 BMI지수를 계산
		// 저체중/정상체중/과체중/비만을 출력하세요.
		
		System.out.print("키(m)를 입력해 주세요 : ");
		double hei = sc.nextDouble();
		
		System.out.print("몸무게(kg)를 입력해 주세요 : ");
		double wei = sc.nextDouble();
		
		double bmi = wei / (hei * hei);
		String result;
		
		if(bmi < 18.5) {
			result = "저체중";
			
		} else if(bmi < 23) {
			result = "정상체중";
			
		} else if(bmi < 25) {
			result = "과체중";
			
		} else if(bmi < 30) {
			result = "비만";
			
		} else {
			result = "고도 비만";
			
		}
		
		System.out.println("BMI 지수 : "+ bmi);
		System.out.println(result);
		
		
	}
	
	
	public void practice5() {
		
		// 중간고사, 기말고사, 과제점수, 출석횟수를 입력하고 
		// Pass 또는 Fail을 출력하세요.
		
		// 평가 비율은 중간고사 20%, 기말고사 30%, 과제 30%, 출석 20%로 이루어져 있고
		// 이 때, 출석 횟수는 총 강의 횟수 20회 중에서 
		// 출석한 날만 따진 값으로 계산하세요.
		
		// 70점 이상일 경우 Pass, 70점 미만이거나 
		// 전체 강의에 30% 이상 결석 시 Fail을 출력하세요.
		
		System.out.print("중간 고사 점수 : ");
		int mid = sc.nextInt();
		
		System.out.print("기말 고사 점수 : ");
		int high = sc.nextInt();
		
		System.out.print("과제 점수 : ");
		int rep = sc.nextInt();
		
		System.out.print("출석 횟수 : ");
		int att = sc.nextInt();
		
		float midSco = (float) (mid * 0.2);
		float highSco = (float) (high * 0.3);
		float repSco = (float) (rep * 0.3);
		float attSco = (float) (mid * 0.2);
		
		float absence = 20 - att;
		
		float sumSco = midSco + highSco + repSco + attSco;
		
		String result = "";

		System.out.println("================= 결과 =================");
		
		if(absence < 20 * 0.3) {
			result += "중간 고사 점수(20) : " + midSco + "\n";
			result += "기말 고사 점수(30) : " + highSco + "\n";
			result += "과제 점수	 (30) : " + repSco + "\n";
			result += "출석 점수	 (20) : " + attSco + "\n";
			result += "총점 : " + sumSco + "\n";
			
			if(sumSco >= 70.0) {
				result += "PASS\n";
			} else {
				result += "Fail [점수 미달]\n";
			}
			
		} else {
			result = "Fail [출석 횟수 부족 (" + att + "/20)]";
			
		}
		
		System.out.printf(result);
		
		
	}
}
