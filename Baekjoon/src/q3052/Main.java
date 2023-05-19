package q3052;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] inp = new int[10];
		for (int i = 0; i < inp.length; i++) {
			inp[i] = sc.nextInt();
		}
		sc.close();

		// 1단계
//		for (int i = 0; i < inp.length; i++) {
//			System.out.print(inp[i] + " ");
//		}
//		System.out.println();

		// 2단계
		int[] rem = new int[10];
		for (int i = 0; i < inp.length; i++) {
			rem[i] = inp[i] % 42;
		}
//		for (int i = 0; i < rem.length; i++) {
//			System.out.print(rem[i] + " ");
//		}

		// 3단계 : 숫자 counting
		int cnt = 0;
		for (int i = 0; i < 42; i++) {
			boolean chk = false;
			for (int j = 0; j < rem.length; j++) {
				if(i == rem[j]) {
					chk = true;
				}
			}
			
			if(chk == true) {
				cnt++;
			}
		}
		System.out.println(cnt);
	}
}
