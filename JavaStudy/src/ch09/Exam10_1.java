package ch09;

public class Exam10_1 {
	public static void main(String[] args) {
		Ramen ramen1 = new SpicyRamen("불 라면");
		String taste1 = ramen1.getTaste();
		System.out.println(taste1);

		Ramen ramen2 = new SaltyRamen("소금 라면");
		String taste2 = ramen2.getTaste();
		System.out.println(taste2);
	}
}