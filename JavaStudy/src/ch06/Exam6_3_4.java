package ch06;

public class Exam6_3_4 {

	public static void dilemma(boolean a, boolean b) {
		if (a == true && b == true) {
			System.out.println("A,B �Ѵ� 5�� ����");
		} else if (a == true && b == false) {
			System.out.println("a����, b 10�� ����");
		} else if (a == false && b == true) {
			System.out.println("a 10�� ����, b ����");
		} else {
			System.out.println("a,b �Ѵ� 1�� ����");
		}

	}

	public static void main(String[] args) {
		dilemma(true, false);

	}
}