package q10845_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			String line = br.readLine();
			int n = Integer.parseInt(line);
			SJQueue q = new SJQueue(n + 1);
			for (int i = 0; i < n; i++) {
				line = br.readLine();
				StringTokenizer st = new StringTokenizer(line);
				String cmd = "";
				String value = "";
				cmd = st.nextToken();
				if (st.countTokens() == 2) {
					value = st.nextToken();
				}

				switch (cmd) {
				case "push":
					int v = Integer.parseInt(value);
					q.push(v);
					break;
				case "pop":
					q.pop();
					break;
				case "front":
					q.front();
					break;
				case "back":
					q.back();
					break;
				case "size":
					q.size();
					break;
				case "empty":
					q.empty();
					break;
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
