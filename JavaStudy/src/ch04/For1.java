package ch04;

public class For1 {
	public static void main(String[] args) {
		// 1.시작값 2.끝값(조건) 3.증감식
		
		int total =0;
		int realTotal = 0;
		// 1 +(1+2)+ (1+2+3)....
		for(int start = 1; start <=10; start ++) {
//			System.out.println("출력" + start);
			total = total + start;
			realTotal = realTotal + total;
			System.out.println(realTotal);
			
		}
//		for(int start = 1; start <=10; start ++) {
////			System.out.println("출력" + start);
//			total = total + start;
//			System.out.println(total);
//		}

//		for(int end = 10; end >=1; end--) {
//			System.out.println("감소 출력" + end);
//		}
//		
//		
//		for(int idx = 1; idx <= 10; idx++) {
//			System.out.println(idx);
//		}
//		System.out.println("출력");
//		System.out.print("한줄출력");
//		System.out.print("또 한줄 출력");
//		System.out.println();
//		System.err.println("에러 출력");
	}

}
