package ch06;

public class Exam6_3_4 {

	public static void dilemma(boolean a, boolean b) {
		if (a == true && b == true) {
			System.out.println("A,B 둘다 5년 복역");
		} else if (a == true && b == false) {
			System.out.println("a석방, b 10년 복역");
		} else if (a == false && b == true) {
			System.out.println("a 10년 복역, b 석방");
		} else {
			System.out.println("a,b 둘다 1년 복역");
		}

	}

	public static void main(String[] args) {
		dilemma(true, false);

	}
}