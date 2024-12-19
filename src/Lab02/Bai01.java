package Lab02;

import java.util.Scanner;

public class Bai01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a, b;
		System.out.println("Nhập a:");
		a = scanner.nextInt();

		System.out.println("Nhập b:");
		b = scanner.nextInt();
		System.out.printf("Giải phương trình bậc nhất %dx + %d = 0 \n", a, b);
		if (a == 0 && b == 0) {
			System.out.println("Phương trình có vô số nghiệm");
		} else if (a == 0 && b != 0) {
			System.out.println("Phương trình vô nghiệm");
		} else {
			float x = (float) -b / a;
			System.out.printf("Phương trình có nghiệm x = %.5f", x);
		}
	}
}
