package 백준.단계별로풀기.문자와문자열;

import java.io.*;

public class Baekjoon11720 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        String str = br.readLine();
        int sum = 0;

        for (int i = 0; i < n; i++) {
            int temp = Integer.parseInt(String.valueOf(str.charAt(i)));
            sum += temp;
        }
        bw.write(String.valueOf(sum));
        bw.flush();
        bw.close();
        br.close();
    }
}
