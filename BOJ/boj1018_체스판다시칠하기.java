package com.ssafy.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_체스판다시칠하기 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String[] temp = br.readLine().split(" ");
		int H = Integer.parseInt(temp[0]);
		int W = Integer.parseInt(temp[1]);
		char[][] basic = { { 'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B' }, { 'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W' },
				{ 'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B' }, { 'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W' },
				{ 'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B' }, { 'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W' },
				{ 'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B' }, { 'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W' } };
		char[][] basic2 = { { 'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W' }, { 'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B' },
				{ 'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W' }, { 'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B' },
				{ 'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W' }, { 'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B' },
				{ 'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W' }, { 'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B' } };

		char[][] board = new char[H][W];
		for (int i = 0; i < H; i++) {
			board[i] = br.readLine().toCharArray();
		}

		int answer = Integer.MAX_VALUE;
		for (int i = 0; i < board.length - 7; i++) {
			for (int j = 0; j < board[0].length - 7; j++) {
				char[][] cutBoard = Cut(board, i, j);
				int cnt = DiffCount(cutBoard, basic);
				if (cnt < answer) {
					answer = cnt;
				}
				cnt = DiffCount(cutBoard, basic2);
				if (cnt < answer) {
					answer = cnt;
				}
			}
		}
		System.out.println(answer);
	}

	static char[][] Cut(char[][] board, int x, int y) {
		char[][] ret = new char[8][8];
		for (int i = x; i < x + 8; i++) {
			for (int j = y; j < y + 8; j++) {
				ret[i - x][j - y] = board[i][j];
			}
		}
		return ret;
	}

	static int DiffCount(char[][] board, char[][] basic) {
		int ret = 0;
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				if (board[i][j] != basic[i][j]) {
					ret++;
				}
			}
		}
		return ret;
	}
}
