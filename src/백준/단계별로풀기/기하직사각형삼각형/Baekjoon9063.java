package 백준.단계별로풀기.기하직사각형삼각형;

import java.io.*;
import java.util.StringTokenizer;

public class Baekjoon9063 {

    static int N;
    static int[][] dots;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        N = Integer.parseInt(br.readLine());
        dots = new int[N][2];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            dots[i][0] = Integer.parseInt(st.nextToken());
            dots[i][1] = Integer.parseInt(st.nextToken());
        }
        int minX = Integer.MAX_VALUE, minY = Integer.MAX_VALUE;
        int maxX = Integer.MIN_VALUE, maxY = Integer.MIN_VALUE;

        for (int i = 0; i < N; i++) {

            for (int j = 0; j < 2; j++) {
                if (j == 0) {
                    minX = Math.min(minX, dots[i][0]);
                    maxX = Math.max(maxX, dots[i][0]);
                } else {
                    minY= Math.min(minY, dots[i][1]);
                    maxY = Math.max(maxY, dots[i][1]);
                }
            }
        }
        bw.write((maxX - minX) * (maxY - minY) + "");
        bw.flush();
        bw.close();
        br.close();
    }

}
