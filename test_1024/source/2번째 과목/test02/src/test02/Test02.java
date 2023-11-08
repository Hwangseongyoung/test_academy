package test02;

import java.util.Scanner;

public class Test02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		
		while(run) {
			System.out.println("A(a). 입력 | B(b). 종료");
			System.out.print("선택 > ");
			String sel = sc.next();
			
			if(sel.equals("A") || sel.equals("a")) {
				System.out.println();
				System.out.print("영어입력(띄어쓰기 없이) > ");
				String up = sc.next();
				
				System.out.println(up.toUpperCase());
				
			}else if(sel.equals("B") || sel.equals("b")) {
				System.out.println();
				System.out.println("프로그램 종료");
				System.exit(0);
			}else {
				System.err.println();
				System.out.println("잘못된 메뉴 선택입니다.");
			}
		}	
	}
}
