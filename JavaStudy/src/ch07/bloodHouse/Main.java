package ch07.bloodHouse;

public class Main {
	public static void main(String[] args) {
		/* 헌혈자 정보 */
		Human human = new Human();
		human.setName("민지");
		human.setType('O');
		human.setAge(16);

		/* BloodHouse 객체 생성 */
		BloodHouse b = new BloodHouse();
		
		String result = ""; // action() 메소드 호출 결과 저장
		/* action() 메소드를 호출하면서 매개변수로 헌혈자 정보 넘겨줌 */
		/* action() 메소드 호출 결과 출력 */
		result = b.action(human);
		System.out.println(result);
	}
}
