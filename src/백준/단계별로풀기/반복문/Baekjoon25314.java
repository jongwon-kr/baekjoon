package 백준.단계별로풀기.반복문;

import java.io.*;

public class Baekjoon25314 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        n /= 4;

        for (int i = 0; i < n; i++) {
            bw.write("long ");
        }
        bw.write("int");
        bw.flush();
        bw.close();
    }
}
