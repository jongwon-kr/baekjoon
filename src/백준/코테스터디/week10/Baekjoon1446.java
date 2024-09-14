package 백준.코테스터디.week10;

import java.io.*;
import java.util.StringTokenizer;

public class Baekjoon1446 {

    public static int N,D;
    public static int[][] ways;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        D = Integer.parseInt(st.nextToken());

        ways = new int[N][3];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 3; j++) {
                ways[i][j] = Integer.parseInt(st.nextToken());
            }
        }
    }
}
