package ch04;

import java.util.Scanner;

public class Game {
	public static void main(String[] args) {
		System.out.println("°¡À§:0,¹ÙÀ§:1,º¸:2");
		Scanner s = new Scanner(System.in);
		boolean isContinue = true;
		while(isContinue) {
				int player = s.nextInt();
				int com = (int)(Math.random() * 3);
				
				if(player + 1 % 3 == com) {
					System.out.println("À¯Àú Áü");
				} else {
					if(player == com) {
						System.out.println("ºñ±è");
					} else {
						System.out.println("À¯Á®ÀÌ±è");
						isContinue = false;
					}
				}
		}
	}
}
