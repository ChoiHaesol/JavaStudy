package ch04;

import java.util.Scanner;

public class FindNumber {
	public static void main(String[] args) {
		// 병뚜껑 숫자
		int random = (int) (Math.random() * 100) + 1 ;
		int count = 0;
		Scanner s = new Scanner(System.in);
		
		while(true) {
			int num = s.nextInt(); // 사용자로부터 입력
			count++;
			if(random == num) {
				System.out.println("맞췄음");
				break;
			} else if (random > num) {
				System.out.println("더 큰수를 입력 하세요.");
			} else {
				System.out.println("더 작은 수를 입력하세요.");
			}
		} System.out.println("시도한 횟수 : " + count);
	}

}
