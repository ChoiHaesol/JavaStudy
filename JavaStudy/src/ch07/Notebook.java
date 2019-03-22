package ch07;

// 자료형의 목적으로 만드는 클래쓰
// 반드시 변수가 존재
// 그 변수의 값을 수정할수 있는 메소드가 존재
public class Notebook {
	int price;
	String brand;
	float size;
	
	public void print() {
		System.out.println(price + brand + size);
	}
	
	// Java Bean (POJO : Plain Old Java Object)
	// set 역할 메소드, get 역할 메소드
	public void setPrice(int p) {
		price = p;
	}

	public int getPrice() {
		return price;
	}

	public void setBrand(String s) {
		brand = s;
	}

	public String getBrand() {
		return brand;
	}

	public void setSize(float s) {
		size = s;
	}

	public float getSize() {
		return size;
	}
	

	}


