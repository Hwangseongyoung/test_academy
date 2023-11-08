package prj03;

import java.util.Scanner;

public class TestEx {
	public static void main(String[] args) {
		InsertDao insert = new InsertDao();
		SelectDao select = new SelectDao();
		
		while(true) {			
			System.out.println("================================================");
			System.out.println("1. 데이터베이스에 값 입력 | 2. 데이터베이스 출력 | 3. 종료");
			System.out.println("================================================");
			
			System.out.print("입력하세요 >> ");
			Scanner sc = new Scanner(System.in);
			
			int num = sc.nextInt();
			
			switch(num) {
			case 1:
				insert.insertDB();
				break;
				
			case 2:
				select.selectDB();
				break;
				
			case 3:
				System.out.println("시스템을 종료합니다.");
				System.exit(0);
				
			default :
				System.out.println("다시 입력해 주세요.");
				System.out.println();
			}
		}
	}
}
