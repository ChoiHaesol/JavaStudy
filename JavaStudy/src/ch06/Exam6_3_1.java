package ch06;

public class Exam6_3_1 {

	public static int checkGrade(int a) {
		int grade = 0;
		if (a > 10) {
			grade = 1;
		} else if (a > 7) {
			grade = 2;
		} else if (a > 4) {
			grade = 3;
		} else {
			grade = 4;
		}
		return grade;
	}

	public static void main(String[] args) {
		int n = checkGrade(8);
		System.out.println(n);

	}

}
