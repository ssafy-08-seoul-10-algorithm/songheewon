package com.ssafy.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class BOJ_큐 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		Queue<Integer> q = new LinkedList<>();
		int lastElement = 0;
		for (int i = 0; i < N; i++) {
			String[] temp = br.readLine().split(" ");
			if (temp.length == 2) {
				q.offer(Integer.parseInt(temp[1]));
				lastElement = Integer.parseInt(temp[1]);
			} else {
				switch (temp[0]) {
				case "front":
					if (q.isEmpty()) {
						System.out.println(-1);
					} else {
						System.out.println(q.peek());
					}
					break;
				case "back":
					if (q.isEmpty()) {
						System.out.println(-1);
					} else {
						System.out.println(lastElement);
					}
					break;
				case "pop":
					if (q.isEmpty()) {
						System.out.println(-1);
					} else {
						System.out.println(q.poll());
					}
					break;
				case "size":
					System.out.println(q.size());
					break;
				case "empty":
					if (q.isEmpty()) {
						System.out.println(1);
					} else {
						System.out.println(0);
					}
					break;
				}
			}
		}
	}
}
