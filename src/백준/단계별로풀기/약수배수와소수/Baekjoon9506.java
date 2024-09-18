package 백준.단계별로풀기.약수배수와소수;

import java.io.*;
import java.util.ArrayList;

public class Baekjoon9506 {

    static int N;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        N = Integer.parseInt(br.readLine());

        ArrayList<Integer> divisors = new ArrayList<>();
        int sum = 0;

        while (!(N == -1)) {
            divisors.clear();
            sum = 0;
            for (int i = 1; i <= N; i++) {
                if (N % i == 0) {
                    divisors.add(i);
                }
            }

            for (int i = 0; i < divisors.size() - 1; i++) {
                sum += divisors.get(i);
            }

            if (sum == N) {
                bw.write(N + " = ");
                for (int i = 0; i < divisors.size() - 1; i++) {
                    if (i != divisors.size() - 2) {
                        bw.write(divisors.get(i) + " + ");
                    } else {
                        bw.write(divisors.get(i) + "\n");
                    }
                }
            }else{
                bw.write(N + " is NOT perfect.\n");
            }
            N = Integer.parseInt(br.readLine());
        }
        bw.flush();
        bw.close();
        br.close();
    }

}
