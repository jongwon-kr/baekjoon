package 백준.단계별로풀기.심화1;

import java.io.*;

public class Baekjoon2444 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        // 상단 부분
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < n - i; j++) {
                bw.write(" ");
            }
            for (int j = 0; j < 2 * i - 1; j++) {
                bw.write("*");
            }
            bw.write("\n");
        }

        // 하단 부분
        for (int i = n - 1; i > 0; i--) {
            for (int j = 0; j < n - i; j++) {
                bw.write(" ");
            }
            for (int j = 0; j < 2 * i - 1; j++) {
                bw.write("*");
            }
            bw.write("\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
