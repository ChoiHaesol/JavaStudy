package ch09;

public class SaltyRamen extends Ramen{ // ��� �ڵ�
	public SaltyRamen(String name) {
		super.name = name;
	}
	// �������̵� �ڵ�
	@Override
	public String getTaste() {
		return  name + " => § ��� ��";
	}
}