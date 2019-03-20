package ch06;

public class Exam6_3_2 {
	public static int getBetweenSum(int a, int b) {
		int sum = 0;
		if (a < b) {
			for (int i = a; i <= b; i++) {
				sum = sum + i;
			}
		} else {
			for (int i = b; i <= a; i++) {
				sum = sum + i;
			}
		}
		return sum;

	}

	public static void main(String[] args) {
		int n = getBetweenSum(5, 3);
		System.out.println(n);
	}
}