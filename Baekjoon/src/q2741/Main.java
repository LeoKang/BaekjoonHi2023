package q2741;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();

//		System.out.println(N);

		// 1. for
		for (int i = 1; i <= N; i++) {
			System.out.println(i);
		}
		System.out.println("--------------");
		
		// 2. while
		int j = 1;
		while (j <= N) {
			System.out.println(j);
			j++;
		}
		System.out.println("--------------");
		
		// 3. do ~ while
		int k = 1;
		do {
			System.out.println(k);
			k++;
		}while(k <= N);
	}
}







