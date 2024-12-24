package Lab03;

import java.util.Scanner;

public class Bai02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Nhap mot so nguyen:");
		int x = scanner.nextInt();
		System.out.println("Bang cuu chuong so " + x);

		for (int i = 1; i <= 10; i++) {
			System.out.printf("%d x %d = %d \n", x, i, x * i);
		}

	}
}
