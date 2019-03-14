package ch04;

import java.util.Scanner;

public class Exam4_8_2 {
	public static void main(String[] args) {
		int count = 0;
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		for(int i = 1; i <= num; i++) {
			
			int n = i;
			
			while(n > 0) {
				
				int n2 = n % 10;
				if (n2 == 8) {
					count++;
				}
				n = n / 10 ;
			}
		}
		System.out.println(count);
	}

}
