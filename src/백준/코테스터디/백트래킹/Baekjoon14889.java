package 백준.코테스터디.백트래킹;

import java.io.*;
import java.util.StringTokenizer;

public class Baekjoon14889 {

    public static int N;
    public static int[][] board;
    public static boolean[] visit;

    public static int min = Integer.MAX_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        N = Integer.parseInt(br.readLine());
        board = new int[N][N];
        visit = new boolean[N];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            for (int j = 0; j < N; j++) {
                board[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        combi(0, 0);
        bw.write(String.valueOf(min));
        bw.flush();
        bw.close();
        br.close();
    }

    static void combi(int idx, int cnt) {
        if(cnt == N / 2) {
            getMin();
        }else{
            for(int i = idx; i < N; i++) {
                if(!visit[i]) {
                    visit[i] = true;
                    combi(i + 1, cnt + 1);
                    visit[i] = false;
                }
            }
        }
    }

    static void getMin() {
        int start = 0;
        int link = 0;

        // (i,j), (j,i)에 있는 선수들의 능력치의 차
        for (int i = 0; i < N - 1; i++) {
            for (int j = i + 1; j < N; j++) {
                if (visit[i] == true && visit[j] == true) {
                    start += board[i][j];
                    start += board[j][i];
                }
                else if (visit[i] == false && visit[j] == false) {
                    link += board[i][j];
                    link += board[j][i];
                }
            }
        }
        int dif = Math.abs(start - link);

        min = Math.min(dif, min);
    }
}