package ch12;

public class IndexOf {
	public static void main(String[] args) {
		String text = "Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.";

		int index = 0;
		while (true) {
			index = text.indexOf("ipsum", index + 1);
			System.out.println(index);
			if (index == -1) {
				break;
			}
		}

	}

}
