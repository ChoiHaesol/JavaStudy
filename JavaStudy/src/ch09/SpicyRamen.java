package ch09;

public class SpicyRamen extends Ramen { // 상속 코드
	public SpicyRamen(String name) {
		super.name = name;
	}
	// 오버라이드 코드
	@Override
	public String getTaste() {
		return name +" => 매운 라면 맛";
	}
}
	
