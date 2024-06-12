package 백준.단계별로풀기.배열2차원;

import java.io.*;
import java.util.StringTokenizer;

public class Baekjoon2566 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int[][] arr = new int[9][9];
        int max = 0;
        int x = 0, y = 0;
        for (int i = 0; i < 9; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 9; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        max = arr[0][0];
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (max < arr[i][j]) {
                    max = arr[i][j];
                    x = j;
                    y = i;
                }
            }
        }
        bw.write(max + "\n");
        bw.write((y + 1) + " " + (x + 1));
        bw.flush();
        bw.close();
        br.close();
    }
}
