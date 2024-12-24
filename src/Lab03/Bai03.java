package Lab03;

import java.util.Arrays;
import java.util.Scanner;

public class Bai03 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int size;
		System.out.print("Nhap so luong phan tu cua mang:");
		size = scanner.nextInt();
		int[] a = new int[size];
		System.out.print("Nhap phan tu:");
		for (int i = 0; i < size; i++) {
			a[i] = scanner.nextInt();
		}
		System.out.println("Mang ban dau: " + Arrays.toString(a));
//		Arrays.sort(a);
//		System.out.println("Mang sap xep: " + Arrays.toString(a));
//		System.out.println("Max = " + a[a.length - 1]);
//		System.out.println("Min = " + a[0]);

		int max = a[0];
		for (int i = 0; i < a.length; i++) {
			max = Math.max(max, a[i]);

		}

		int min = a[0];
		for (int i = 0; i < a.length; i++) {
			min = Math.min(min, a[i]);

		}
		System.out.println("Max = " + max);
		System.out.println("Min = " + min);
	}
}
