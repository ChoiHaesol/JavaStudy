package ch07;

// �ڷ����� �������� ����� Ŭ����
// �ݵ�� ������ ����
// �� ������ ���� �����Ҽ� �ִ� �޼ҵ尡 ����
public class Notebook {
	int price;
	String brand;
	float size;
	
	public void print() {
		System.out.println(price + brand + size);
	}
	
	// Java Bean (POJO : Plain Old Java Object)
	// set ���� �޼ҵ�, get ���� �޼ҵ�
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


