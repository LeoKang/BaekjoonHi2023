package q10828;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		SJStack stk;
		try {
			String line = br.readLine();
			int cnt = Integer.parseInt(line);
			stk = new SJStack(cnt);
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
					stk.pop();
				} else if (cmd.equals("top")) {
					stk.top();
				} else if (cmd.equals("size")) {
					stk.size();
				} else if (cmd.equals("empty")) {
					stk.empty();
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
