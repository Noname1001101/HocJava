package Lab02;

import java.util.Scanner;

public class Bai04 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println(">>>>>>> LỰA CHỌN TÍNH NĂNG <<<<<<");
		System.out.println("++ --------------------------- ++");
		System.out.println("| 1. Giải phương trình bậc nhất |");
		System.out.println("| 2. Giải phương trình bậc hai |");
		System.out.println("| 3. Tính số tiền điện |");
		System.out.println("| 4. Kết thúc |");
		System.out.println("++ --------------------------- ++");

		System.out.println("Hãy nhập một chức năng:");
		int nhap = scanner.nextInt();

		int a, b, c;
		switch (nhap) {

		case 1:
			System.out.println("Nhập a:");
			a = scanner.nextInt();

			System.out.println("Nhập b:");
			b = scanner.nextInt();
			System.out.printf("Giải phương trình bậc nhất %dx + %d = 0 \n", a, b);
			if (a == 0 && b == 0) {
				System.out.println("Phương trình có vô số nghiệm");
			} else if (a == 0 && b != 0) {
				System.out.println("Phương trình vô nghiêm");
			} else {
				float x = (float) -b / a;
				System.out.printf("Phương trình có nghiệm x = %.5f", x);
			}
			break;
		case 2:
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
			break;
		case 3:
			System.out.println("Tính tiền điện");
			System.out.println("Nhập số điện:");
			int SoDien = scanner.nextInt();

			if (SoDien <= 100) {
				int SoTien1 = SoDien * 1000;
				System.out.println("Số tiền, điện nhỏ hơn 100:" + SoTien1);
			} else {
				int SoTien2 = 100 * 1000 + (SoDien - 100) * 1500;
				System.out.println("Số tiền, điện lớn hơn 100:" + SoTien2);
			}
			break;

		default:
			System.out.println("Thoát chương trình thành công!");
			System.exit(0);

		}

	}
}
