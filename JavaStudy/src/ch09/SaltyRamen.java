package ch09;

public class SaltyRamen extends Ramen{ // 상속 코드
	public SaltyRamen(String name) {
		super.name = name;
	}
	// 오버라이드 코드
	@Override
	public String getTaste() {
		return  name + " => 짠 라면 맛";
	}
}