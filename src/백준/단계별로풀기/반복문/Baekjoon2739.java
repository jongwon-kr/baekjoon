package 백준.단계별로풀기.반복문;

import java.io.*;

public class Baekjoon2739 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        for (int i = 1; i <= 9; i++) {
            bw.write(String.format("%d * %d = %d\n", n, i, (n * i)));
        }
        bw.flush();
        bw.close();
    }
}
