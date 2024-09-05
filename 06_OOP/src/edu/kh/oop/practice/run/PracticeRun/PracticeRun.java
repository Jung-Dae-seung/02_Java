package edu.kh.oop.practice.run.PracticeRun;

import edu.kh.oop.practice.model.service.BookService.BookService;
import edu.kh.oop.practice.model.service.HeroService.HeroService;

public class PracticeRun {

	public static void main(String[] args) {

		// bookVO 예제
		BookService service = new BookService();

		// service.practice();

		// hero 예제
		HeroService heroService = new HeroService();

		heroService.practice();

	}
}
