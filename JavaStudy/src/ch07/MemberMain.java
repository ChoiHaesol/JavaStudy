package ch07;

public class MemberMain {	
	public static void printData(Member[] m) {
		for(int i = 0; i < m.length; i++) {
			printData(m[i]);                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      
		}
	}
	
	public static void printData(Member m) {
		System.out.println(m.id);
		System.out.println(m.name);
	}
	
	public static void main(String[] args) {

		Member[] m = new Member[2];
		
		Member m1 = new Member();
		m1.id = "mingd";
		m1.name = "kim";
		printData(m1);
		
		Member m2 = new Member();
		m2.id = "dory";
		m2.name = "choi";
		printData(m2);
		
		m[0] = m1; 
		m[1] = m2;
		
		printData(m);
	}
	
	
}
