package ch06;

public class MethodTest2 {
	// 메소드 생성 규칙
	// 반드시 클래스 내에 표현되어야 한다
	// 메소드 내에 표현할 수 없다
	// 위치 상관 없음
	
	public static int firstMethod() {
		//2번,4번
		int a = 100;
		
		return a;
	}
	public static void main(String[] args) {
		//1번
		System.out.println(firstMethod());
		
		//3번
		int num = firstMethod();
		//5번
		System.out.println(num * 6);
		
		
	}

}
