package q9498;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt();
		sc.close();

//		System.out.println(score);

		// 1. if ~ else
//		if (90 <= score && score <= 100) {
//			System.out.println("A");
//		} else if (80 <= score && score < 90) {
//			System.out.println("B");
//		} else if (70 <= score && score < 80) {
//			System.out.println("C");
//		} else if (60 <= score && score < 70) {
//			System.out.println("D");
//		} else {
//			System.out.println("F");
//		}

		// 2. if ~ else
//		if (90 <= score && score <= 100) {
//			System.out.println("A");
//		} else if (80 <= score) {
//			System.out.println("B");
//		} else if (70 <= score) {
//			System.out.println("C");
//		} else if (60 <= score) {
//			System.out.println("D");
//		} else {
//			System.out.println("F");
//		}

		// 3. switch ~ case
		int s = score / 10;
		switch (s) {
		case 10:
		case 9:
			System.out.println("A");
			break;
		case 8:
			System.out.println("B");
			break;
		case 7:
			System.out.println("C");
			break;
		case 6:
			System.out.println("D");
			break;
		default:
			System.out.println("F");
		}
	}
}
