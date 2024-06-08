package 백준.단계별로풀기.배열1차원;

import java.io.*;

public class Baekjoon2562 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = 9;
        int max = 0, maxIndex = 1;

        for (int i = 1; i <= n; i++) {
            int term = Integer.parseInt(br.readLine());
            if (max < term) {
                max = term;
                maxIndex = i;
            }
        }
        bw.write(max + "\n" + maxIndex);
        bw.flush();
        bw.close();
        br.close();
    }
}
