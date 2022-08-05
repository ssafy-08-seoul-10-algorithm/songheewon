package com.ssafy.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_분해합 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int answer = 0;
		for (int i = 1; i <= N; i++) {
			String str = String.valueOf(i);
			int generate = i;
			for (int j = 0; j < str.length(); j++) {
				generate += Integer.parseInt(str.charAt(j) + "");
			}

			if (generate == N) {
				answer = i;
				break;
			}
		}
		System.out.println(answer);
	}
}
