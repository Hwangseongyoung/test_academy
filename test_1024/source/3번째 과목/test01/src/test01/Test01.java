package test01;

import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("학년 >> ");
		int grd = sc.nextInt();
		System.out.print("점수 >> ");
		int score = sc.nextInt();
		
		if(score>=60) {
			if(grd==4 && score>=80) {
				System.out.println("졸업입니다.");
			} else if(grd==4 && score<80){
				System.out.println("재시험입니다.");
			} else {				
				System.out.println("합격입니다.");
			}
		} else {
			if(grd==4 && score<80) {
				System.out.println("재시험입니다.");
			} else {				
				System.out.println("불합격입니다.");
			}
		}
	}
}
