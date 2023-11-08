package prj01;

import java.util.Scanner;

public class TestEx01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("배수를 구할 숫자 >> ");
		int num = sc.nextInt();
		
		System.out.print("개수 >> ");
		int kk = sc.nextInt();
		
		System.out.print(num+"의 배수("+kk+"개) : ");
		for(int i=1;i<(kk+1);i++) {
			int mul = num*i;
			if(i==kk) {
				System.out.println(mul);
			} else {				
				System.out.print(mul+", ");
			}
		}
	}
}