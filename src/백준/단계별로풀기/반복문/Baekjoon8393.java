package 백준.단계별로풀기.반복문;

import java.io.*;

public class Baekjoon8393 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        bw.write(String.valueOf(sum));
        bw.flush();
        br.close();
        bw.close();
    }
}
