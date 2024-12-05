package CodeJava;

import java.util.Scanner;

public class Bai02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Dai la:");
		int Dai = scanner.nextInt();

		System.out.println("Rong la:");
		int Rong = scanner.nextInt();

		int a = Dai, b = Rong;
		int c = (a + b) * 2;
		int d = (a * b);
		System.out.println("Chu vi hinh chu nhat la:" + c);
		System.out.println("Dien tich hinh chu nhat la:" + d);
		System.out.println("Canh nho nhat la:" + Math.min(a, b));
	}

}
