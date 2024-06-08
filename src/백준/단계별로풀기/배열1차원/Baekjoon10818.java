package 백준.단계별로풀기.배열1차원;

import java.io.*;
import java.util.StringTokenizer;

public class Baekjoon10818 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int max = 0, min = 0;
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        max = Integer.parseInt(st.nextToken());
        min = max;
        for (int i = 0; i < n - 1; i++) {
            int term = Integer.parseInt(st.nextToken());
            if (max < term) {
                max = term;
            }
            if (min > term) {
                min = term;
            }
        }

        bw.write(min + " " + max);
        bw.flush();
        bw.close();
        br.close();
    }
}
