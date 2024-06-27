package 백준.코테스터디.dynamicPrograming;

import java.io.*;
import java.util.StringTokenizer;

public class Baekjoon15486 {

    public static int N = 0;
    public static int[] T;
    public static int[] P;
    public static int[] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        N = Integer.parseInt(br.readLine());

        T = new int[N + 1];
        P = new int[N + 1];
        dp = new int[N + 2];

        for (int i = 1; i <= N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            T[i] = Integer.parseInt(st.nextToken());
            P[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 1; i <= N; i++) {
            // 상담일수 + 현재 날짜가 7을 초과하지 않을 때
            if (i + T[i] <= N + 1) {
                dp[i + T[i]] = Math.max(dp[i + T[i]], dp[i] + P[i]);
            }
            dp[i + 1] = Math.max(dp[i + 1], dp[i]);
        }

        bw.write(String.valueOf(dp[N + 1]));
        bw.flush();
        bw.close();
        br.close();
    }
}
