package prj01;

import java.util.Scanner;

public class TestEx02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		boolean run = true;
		
		do {
			System.out.print("대문자로 바꿀 단어 >> ");
			String s = sc.next();
			
			if(s.equals("exit")) {
				System.out.println("종료합니다.");
				System.exit(0);
			}
			System.out.println("대문자로 변경된 문자 : "+s.toUpperCase());
		} while(run);
	}
}
