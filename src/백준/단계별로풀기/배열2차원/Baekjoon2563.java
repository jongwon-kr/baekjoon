package 백준.단계별로풀기.배열2차원;

import java.io.*;
import java.util.StringTokenizer;

public class Baekjoon2563 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        int[][] field = new int[100][100];
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {
                    field[j+y][k+x] = 1;
                }
            }
        }

        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                if(field[i][j]==1){
                    cnt++;
                }
            }
        }
        bw.write(cnt + "\n");
        bw.flush();
        bw.close();
        br.close();
    }
}
