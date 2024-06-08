package 백준.단계별로풀기.배열1차원;

import java.io.*;
import java.util.StringTokenizer;

public class Backjoon1546 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int max = 0;
        double sum = 0;

        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] scores = new int[n];

        for (int i = 0; i < n; i++) {
            scores[i] = Integer.parseInt(st.nextToken());
        }
        max = scores[0];

        for (int i = 0; i < n; i++) {
            if (max < scores[i]) {
                max = scores[i];
            }
        }
        for (int i = 0; i < n; i++) {

            sum += ((double)scores[i]/max)*100;
        }
        bw.write(String.valueOf(sum/n));
        bw.flush();
        bw.close();
        br.close();
    }
}
