package ch07;

public class Triangle {
	float bottom;
	float height;

	public float getBottom() {
		return bottom;
	}

	public void setBottom(float bottom) {
		this.bottom = bottom;
	}

	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}

	// public void setBottom(float b) {
//		bottom = b;
//	}
//	public float getBottom() {
//		return bottom;
//	}
//	public void setHeight(float h) {
//		height = h;
//	}
//	public float getHeight () {
//		return height;
//	}
	public float getArea() {
		return bottom * height / 2;
	}

}
