package CodeJava;

import java.util.Scanner;

public class Bai03 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Nhap canh cua khoi lap phuong:");
		int Canh = scanner.nextInt();

		System.out.println("The tich cua hinh lap phuong:" + Math.pow(Canh, 3));

	}
}
