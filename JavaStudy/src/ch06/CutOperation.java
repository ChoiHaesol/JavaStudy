package ch06;

public class CutOperation {
	public static void main(String[] args) {
		int[] stick = { 5, 4, 4, 2, 2, 8 };
		while (true) {
			// 1번 최소값 알아내기

			int min = Integer.MAX_VALUE;
			for (int i = 0; i < stick.length; i++) {
				// 감소된 요소 중 슴수가 존재하므로 최소값 조건 0초과 추가
				if (stick[i] < min && stick[i] > 0) {
					min = stick[i];
				}
			}
			// 2번 최소값으로 배열 요소 감소시키기
			for (int i = 0; i < stick.length; i++) {
				stick[i] = stick[i] - min;
			}
			// 3번 배열요소 중 0보다 큰 요소 개수 알아내기
			int count = 0;
			for (int i = 0; i < stick.length; i++) {
				if (stick[i] > 0) {
					count++;
				}
			}
			System.out.println(count);
			if (count == 0)
				break;
		}
	}

}
