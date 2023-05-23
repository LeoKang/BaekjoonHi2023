package q10871;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int seq[];
		int N = sc.nextInt();
		int X = sc.nextInt();
		seq = new int[N];
		for (int i = 0; i < seq.length; i++) {
			seq[i] = sc.nextInt();
		}
		sc.close();

//		System.out.println(N + " " + X);
//		for (int i = 0; i < seq.length; i++) {
//			System.out.print(seq[i] + " ");
//		}

		for (int i = 0; i < seq.length; i++) {
			if (seq[i] < X) {
				System.out.print(seq[i] + " ");
			}
		}
	}
}
