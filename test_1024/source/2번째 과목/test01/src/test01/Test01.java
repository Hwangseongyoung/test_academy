package test01;

public class Test01 {
	public static void main(String[] args) {
		int length = 333;
		int tr[] = new int[length];
		int fv[] = new int[length];
		int num[] = new int[1000];
		
		for(int i=0;i<length;i++) {
			do {
				tr[i] = 3*(i+1);
			} while(tr[i]>1000);
		}
		
		for(int i=0;i<1000;i++) {
			num[i] = i+1;
			System.out.println(num[i]);
		}

//		if(num[] != tr[]) {
//			
//		}
		
//		for(int i=0;i<length;i++) {
//			do {
//				fv[i] = 5*(i+1);
//			} while(fv[i]>1001);
//		}
		
		
		
//		for(int k=0;k<fv.length;k++) {
//			System.out.println(fv[k]);
//		}		
	}
}
