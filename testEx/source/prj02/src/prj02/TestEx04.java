package prj02;

import java.util.Scanner;

public class TestEx04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수를 입력하시오 >> ");
		int score = sc.nextInt();
		
		if(score>=60) {
			System.out.println("합격");
		} else {
			System.out.println("불합격");
		}
	}
}
