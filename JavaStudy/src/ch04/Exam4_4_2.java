package ch04;

public class Exam4_4_2 {
	public static void main(String[] args) {
		int sum = 0;
		for(int a = 1; a<=1000; a++) {
			if(a % 2 == 0 && a % 7 == 0) {
				System.out.println(a);
				sum = sum + a;
			}
			
		}
		System.out.println("");
		System.out.println("각 숫자들의 합 : "+sum);
	}

}
