package ch06;

import java.util.Calendar;

public class Exam6_3_3 {
	
	public static int getLastYear(int a) {
		int date = 0;
		if(a == 1 ||a == 3 ||a == 5 ||a == 7 ||a == 8 ||a == 10 ||a == 12) {
			date = 31;
		} else if(a == 4 ||a == 6 ||a == 9 ||a == 11) {
			date = 30;
		} else { 
			date = 28;
		}
		return date;
	}

	// calendar 라이브러리 이용
	public static int getLastYear2(int a) {
		Calendar cal = Calendar.getInstance();
		cal.set(2019, a - 1, 1); // 지정된 날짜로 달력 변경
		int lastDate = cal.getActualMaximum(Calendar.DATE);
		
		return lastDate;
		
	}
	public static void main(String[] args) {
		int n = getLastYear(11);
		int n2 = getLastYear2(2);
		System.out.println(n);
		System.out.println(n2);
		
	}

}