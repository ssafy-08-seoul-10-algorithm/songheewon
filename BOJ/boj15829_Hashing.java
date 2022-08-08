package com.ssafy.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class BOJ_Hashing {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		String s = br.readLine();
		BigInteger answer = new BigInteger("0");
		for (int i = 0; i < N; i++) {
			BigInteger temp = BigInteger.valueOf(s.charAt(i) - 'a' + 1).multiply(BigInteger.valueOf(31).pow(i));
			answer = answer.add(temp);
		}
		System.out.println(answer.remainder(BigInteger.valueOf(1234567891)));
	}
}
