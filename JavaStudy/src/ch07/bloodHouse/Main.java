package ch07.bloodHouse;

public class Main {
	public static void main(String[] args) {
		/* ������ ���� */
		Human human = new Human();
		human.setName("����");
		human.setType('O');
		human.setAge(16);

		/* BloodHouse ��ü ���� */
		BloodHouse b = new BloodHouse();
		
		String result = ""; // action() �޼ҵ� ȣ�� ��� ����
		/* action() �޼ҵ带 ȣ���ϸ鼭 �Ű������� ������ ���� �Ѱ��� */
		/* action() �޼ҵ� ȣ�� ��� ��� */
		result = b.action(human);
		System.out.println(result);
	}
}
