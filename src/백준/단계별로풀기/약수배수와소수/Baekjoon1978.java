package 백준.단계별로풀기.약수배수와소수;

import java.io.*;
import java.util.StringTokenizer;

public class Baekjoon1978 {

    static int N;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int num = 0;
        int cnt = 0;
        boolean check = true;

        for (int i = 0; i < N; i++) {
            num = Integer.parseInt(st.nextToken());
            check = true;
            if (num != 1) {
                for (int j = 2; j < num; j++) {
                    if (num % j == 0) {
                        check = false;
                        break;
                    }
                }
            }else{
                continue;
            }
            if (check) {
                cnt++;
            }
        }

        bw.write(cnt + "");
        bw.flush();
        bw.close();
        br.close();
    }

}
