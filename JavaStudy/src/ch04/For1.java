package ch04;

public class For1 {
	public static void main(String[] args) {
		// 1.���۰� 2.����(����) 3.������
		
		int total =0;
		int realTotal = 0;
		// 1 +(1+2)+ (1+2+3)....
		for(int start = 1; start <=10; start ++) {
//			System.out.println("���" + start);
			total = total + start;
			realTotal = realTotal + total;
			System.out.println(realTotal);
			
		}
//		for(int start = 1; start <=10; start ++) {
////			System.out.println("���" + start);
//			total = total + start;
//			System.out.println(total);
//		}

//		for(int end = 10; end >=1; end--) {
//			System.out.println("���� ���" + end);
//		}
//		
//		
//		for(int idx = 1; idx <= 10; idx++) {
//			System.out.println(idx);
//		}
//		System.out.println("���");
//		System.out.print("�������");
//		System.out.print("�� ���� ���");
//		System.out.println();
//		System.err.println("���� ���");
	}

}