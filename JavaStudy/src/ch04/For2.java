package ch04;

public class For2 {
	public static void main(String[] args) {
		//구구단 만들기
		for(int y = 1; y <= 9; y++) {
			for(int x = 2; x<=5; x++) {
				System.out.print(
						x + " * " + y + " = " + (x*y) +  "\t");
			}
			//System.out.println();
			System.out.print("\n");//예외 문자 "\n"
		}
		
		
//		for(int a = 1; a <=3; a++) {
//			for(int b = 1; b <= 2; b++) {
//				//1 1, 1 2, 2 1, 2 2, 3 1, 3 2
//				System.out.println(a + "," + b);
//			}
//		}
	}

}
