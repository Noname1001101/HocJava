package Lab02;

import java.util.Scanner;

public class Bai02 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Nhập a:");
		int a = scanner.nextInt();

		System.out.println("Nhập b:");
		int b = scanner.nextInt();

		System.out.println("Nhập c:");
		int c = scanner.nextInt();
		System.out.printf("Giải phương trình bậc hai %dx^2 + %dx + %d = 0 \n", a, b, c);
		if (a == 0 && b == 0 && c == 0) {
			System.out.println("Phương trình có vô số nghiệm");
		} else if (a != 0) {
			double delta = Math.pow(b, 2) - 4 * a * c;
			if (delta < 0) {
				System.out.println("Phương trình vô nghiệm");
			} else if (delta == 0) {
				float x = (float) -b / (2 * a);
				System.out.printf("Nghiệm kép x = %.3f", x);
			} else {
				double x1 = (-b + Math.sqrt(delta)) / (2 * a);
				double x2 = (-b - Math.sqrt(delta)) / (2 * a);
				System.out.printf("Có 2 nghiệm riêng biệt, x1 = %.3f, x2 = %.3f", x1, x2);

			}
		}

	}
}
