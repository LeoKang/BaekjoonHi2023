package q10828_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Stack<Integer> stk = new Stack<Integer>();
//		SJStack stk;
		try {
			String line = br.readLine();
			int cnt = Integer.parseInt(line);
//			stk = new SJStack(cnt);
			for (int i = 0; i < cnt; i++) {
				line = br.readLine();
				StringTokenizer st = new StringTokenizer(line);
				String cmd = st.nextToken();
//				System.out.println(cmd);

				if (cmd.equals("push")) {
					String cmd2 = st.nextToken();
//					System.out.println(cmd2);
					int p = Integer.parseInt(cmd2);
					stk.push(p);
				} else if (cmd.equals("pop")) {
					if (stk.size() > 0) {
						System.out.println(stk.pop());
					} else {
						System.out.println("-1");
					}
				} else if (cmd.equals("top")) {
//					stk.top();
					System.out.println(stk.peek());
				} else if (cmd.equals("size")) {
					System.out.println(stk.size());
				} else if (cmd.equals("empty")) {
					if (stk.empty()) {
						System.out.println("1");
					} else {
						System.out.println("0");
					}
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
