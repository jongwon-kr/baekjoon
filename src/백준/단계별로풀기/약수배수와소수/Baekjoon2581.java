package 백준.단계별로풀기.약수배수와소수;

import java.io.*;
import java.util.StringTokenizer;

public class Baekjoon2581 {

    static int N, M, sum, min;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        N = Integer.parseInt(br.readLine());
        M = Integer.parseInt(br.readLine());

        sum = 0;
        min = Integer.MAX_VALUE;
        Boolean check;

        for (int i = N; i < M + 1; i++) {
            check = false;
            if (i != 1) {
                for (int j = 2; j < i; j++) {
                    if (i % j == 0) {
                        check = true;
                    }
                }
                if (!check) {
                    sum += i;
                    min = Math.min(min, i);
                }
            }
        }
        if (sum != 0) {
            bw.write(sum + "\n");
            bw.write(min + "");
        }else{
            bw.write("-1");
        }
        bw.flush();
        bw.close();
        br.close();
    }

}
