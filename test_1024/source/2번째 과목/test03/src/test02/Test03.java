package test02;

public class Test03 {
	public static void main(String[] args) {
		char a = 'a';
		int a1 = (int)a;
				
		do {
			System.out.print((char)a1+" ");
			a1 += 1;
		}while(a1<123);
	}
}
