package prj02;

import java.util.Scanner;

public class TestEx06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("주민번호를 입력하세요 >> ");
		String rn = sc.next();
		
		char gender = rn.charAt(7);
		if(gender=='1') {
			System.out.println("남자");
		} else {
			System.out.println("여자");
		}
	}
}
