package ch09;

public class Exam10_2 {
	public static void main(String[] args) {
		Exam10_2 e = new Exam10_2();
		e.print(10);
		e.print("JAVA");
		e.print(new Data(10, "ABC"));
	}

	// [ 오버로딩 메소드 코드 작성 ]
	public void print(int n) {
		System.out.println(n + "입니다.");
	}

	public void print(String s) {
		System.out.println(s + "입니다.");
	}

	public void print(Data d) {
		System.out.println(d);
	}

}

class Data {
// [ 변수 ]
	int n;
	String s;
// [ 생성자 ]
	Data(int n, String s) {

	}
// [ toString 오버라이딩 ]
	// source => generate toString
	@Override
	public String toString() {
		return "Data [n=" + n + ", s=" + s + "]";
	}
}