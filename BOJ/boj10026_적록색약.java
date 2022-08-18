package com.ssafy.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_적록색약 {
	static boolean[][] visited;
	static char[][] board;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		board = new char[N][N];
		visited = new boolean[N][N];
		for (int i = 0; i < N; i++) {
			board[i] = br.readLine().toCharArray();
		}
		int normal = 0;
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (!visited[i][j]) {
					dfs(i, j);
					normal++;
				}
			}
		}
		int notNormal = 0;
		visited = new boolean[N][N];
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (board[i][j] == 'G') {
					board[i][j] = 'R';
				}
			}
		}
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (!visited[i][j]) {
					dfs(i, j);
					notNormal++;
				}
			}
		}
		System.out.println(normal + " " + notNormal);
	}

	static void dfs(int r, int c) {
		visited[r][c] = true;
		int[] dr = { -1, 0, 0, 1 };
		int[] dc = { 0, -1, 1, 0 };
		char current = board[r][c];
		for (int i = 0; i < 4; i++) {
			int nextR = r + dr[i];
			int nextC = c + dc[i];

			if (nextR < 0 || nextC < 0 || nextR >= board.length || nextC >= board.length) {
				continue;
			}

			if (!visited[nextR][nextC] && board[nextR][nextC] == current) {
				dfs(nextR, nextC);
			}
		}
	}
}
