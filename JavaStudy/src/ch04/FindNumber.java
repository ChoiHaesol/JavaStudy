package ch04;

import java.util.Scanner;

public class FindNumber {
	public static void main(String[] args) {
		// ���Ѳ� ����
		int random = (int) (Math.random() * 100) + 1 ;
		int count = 0;
		Scanner s = new Scanner(System.in);
		
		while(true) {
			int num = s.nextInt(); // ����ڷκ��� �Է�
			count++;
			if(random == num) {
				System.out.println("������");
				break;
			} else if (random > num) {
				System.out.println("�� ū���� �Է� �ϼ���.");
			} else {
				System.out.println("�� ���� ���� �Է��ϼ���.");
			}
		} System.out.println("�õ��� Ƚ�� : " + count);
	}

}