package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj1463_1로만들기 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] dp = new int[N + 1];
		dp[0] = 0;
		dp[1] = 0;
		for (int i = 2; i < N + 1; i++) {
			dp[i] = dp[i - 1] + 1; // 기본적으로 1 작은 수보다 한 번 더 계산을 해야함
			// 왜냐면 이전 수가 1로 만들어질 때까지 걸리는 횟수가 m이라면
			// 현재 수가 2로 만들어질 때까지 걸리는 걸리는 횟수가 2인 것이니까
			// 최대 걸리는 횟수는 자동으로 (1 작은 수가 걸리는 횟수+ 1) 이 된다.
			if (i % 2 == 0) { // 근데 만약 2로 나누어 떨어지는 수라면
				// 1 작은 수가 아니라 2로 나누었을 때 수가 1로 만들어질 때까지 걸리는 횟수에 1을 더한 값이 될 수도 있다.
				// 그러니까 두 수를 비교!!
				dp[i] = dp[i] < dp[i / 2] + 1 ? dp[i] : dp[i / 2] + 1;
			}
			if (i % 3 == 0) { // 3으로 나누어 떨어지는 수도 마찬가지로 조건문을 구현한다.
				dp[i] = dp[i] < dp[i / 3] + 1 ? dp[i] : dp[i / 3] + 1;
			} 
		}
		System.out.println(dp[N]);
	}
}
