package Lab02;

import java.util.Scanner;

public class Bai03 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Nhập số điện:");
		int SoDien = scanner.nextInt();

		if (SoDien <= 100) {
			int SoTien1 = SoDien * 1000;
			System.out.println("Số tiền, điện nhỏ hơn 100:" + SoTien1);
		} else {
			int SoTien2 = 100 * 1000 + (SoDien - 100) * 1500;
			System.out.println("Số tiền, điện lớn hơn 100:" + SoTien2);
		}
	}
}
