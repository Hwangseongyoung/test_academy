package test02;

public class Test02 {
	public void avg() {
		int num[] = new int[] {8, 3, 1, 6, 2, 4, 5, 9};
		int sum = 0;
		double avg = 0;
		
		
		
		for(int i=0;i<num.length;i++) {
			sum += num[i];
			avg = ((double)sum/(double)num.length);
		}
		System.out.printf("평균 : %.2f", avg);
	}
	
	public static void main(String[] args) {
		Test02 test02 = new Test02();
		test02.avg();
	}
}
