package edu.kh.oop.practice.model.service.HeroService;

import edu.kh.oop.practice.model.vo.Hero.Hero;

public class HeroService {

	public void practice() {

		Hero he1 = new Hero("이구역짱", "전사", 200, 20, 1, 0);
		Hero he2 = new Hero("Zi존위자드", "마법사", 100, 100, 1, 0);

		System.out.println("============캐릭터 생성============");
		System.out.printf("%s 직업으로 '%s'님이 생성되었습니다.\n", he1.getJob(), he1.getNickname());
		System.out.println("현재 레벨 : " + he1.getLevel());
		System.out.println("현재 hp : " + he1.getHp());
		System.out.println("현재 mp : " + he1.getMp());
		System.out.println("현재 경험치 : " + he1.getExp());

		System.out.println("============캐릭터 생성============");
		System.out.printf("%s 직업으로 '%s'님이 생성되었습니다.\n", he2.getJob(), he2.getNickname());
		System.out.println("현재 레벨 : " + he2.getLevel());
		System.out.println("현재 hp : " + he2.getHp());
		System.out.println("현재 mp : " + he2.getMp());
		System.out.println("현재 경험치 : " + he2.getExp());

		System.out.printf("============%s 시점============\n", he1.getNickname());
		he1.attack(100);
		he1.attack(50.5);
		he1.attack(49.5);
		he1.dash();
		he1.dash();

		System.out.printf("============'%s'님의 정보============\n", he1.getNickname());
		System.out.println("- 현재 레벨 : " + he1.getLevel());
		System.out.println("- 현재 hp : " + he1.getHp());
		System.out.println("- 현재 mp : " + he1.getMp());
		System.out.println("- 현재 exp : " + he1.getExp());

		System.out.printf("============%s 시점============\n", he2.getNickname());
		he2.attack(300);
		he2.dash();
		he2.attack(300);
		he2.attack(300);

		System.out.printf("============'%s'님의 정보============\n", he2.getNickname());
		System.out.println("- 현재 레벨 : " + he2.getLevel());
		System.out.println("- 현재 hp : " + he2.getHp());
		System.out.println("- 현재 mp : " + he2.getMp());
		System.out.println("- 현재 exp : " + he2.getExp());

	}

}
