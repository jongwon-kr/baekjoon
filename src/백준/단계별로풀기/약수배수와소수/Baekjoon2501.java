package 백준.단계별로풀기.약수배수와소수;

import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Baekjoon2501 {

    static int N, K;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        ArrayList<Integer> divisors = new ArrayList<>();

        for (int i = 1; i <= N; i++) {
            if (N % i == 0) {
                divisors.add(i);
            }
        }

        if (K > divisors.size()) {
            bw.write("0");
        } else {
            bw.write(divisors.get(K - 1)+"");
        }
        bw.flush();
        bw.close();
        br.close();
    }

}
