package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String[] temp = br.readLine().split(" ");
		int A = Integer.parseInt(temp[0]);
		int B = Integer.parseInt(temp[1]);
		int V = Integer.parseInt(temp[2]);
		if ((V - B) % (A - B) == 0) {
			sb.append((V - B) / (A - B));
		} else {
			sb.append((V - B) / (A - B) + 1);
		}
		System.out.println(sb);
	}
}
