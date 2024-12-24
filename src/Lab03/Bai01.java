package Lab03;

import java.util.Scanner;

public class Bai01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhap mot so nguyen:");
		int n = scanner.nextInt();
		int count = 0;
		for (int i = 2; i < n - 1; i++) {
			if (n % i == 0) {
				System.out.println("Uoc so khac:" + i);
				count++;
				break;
			}
		}
		if (count == 0) {
			System.out.printf("%d la so nguyen to", n);

		} else {
			System.out.printf("%d khong la so nguyen to", n);
		}
		scanner.close();
	}
}
