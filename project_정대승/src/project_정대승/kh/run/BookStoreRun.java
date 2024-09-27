package project_정대승.kh.run;

import project_정대승.kh.model.service.MemberService;
import project_정대승.kh.model.service.ObjectService;

public class BookStoreRun {

	public static void main(String[] args) {

		new ObjectService().dataSet();
		// new BookStoreService().displayMenu();
		new MemberService().displayMenu();
		
	}
	

}
