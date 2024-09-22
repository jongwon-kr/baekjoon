package 백준.단계별로풀기.약수배수와소수;

import java.io.*;

public class Baekjoon11653 {

    static int N;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        N = Integer.parseInt(br.readLine());
        int d = 0;
        while (true) {
            d = checkDecimal(N);
            if (d != 0) {
                bw.write(d + "\n");
                N /= d;
            }else{
                break;
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }

    static int checkDecimal(int n) {
        for (int i = 2; i <= n; i++) {
            if (n % i == 0) {
                return i;
            }
        }
        return 0;
    }

}
