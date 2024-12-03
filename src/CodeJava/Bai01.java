package CodeJava;

import java.util.Scanner;

public class Bai01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Hay nhap ten:");
		String name = scanner.nextLine();

		System.out.println("Hay diem trung binh:");
		int DTB = scanner.nextInt();

		System.out.println("Ten cua ban la:" + name);
		System.out.println("Co Diem la:" + DTB);
		scanner.close();
	}

}
