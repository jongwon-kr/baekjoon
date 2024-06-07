package 백준.단계별로풀기.반복문;

import java.io.*;
import java.util.StringTokenizer;

public class Baekjoon25304 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int totalPrice = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());
        int price = 0;
        int cnt = 0;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            price = Integer.parseInt(st.nextToken());
            cnt = Integer.parseInt(st.nextToken());
            sum += price * cnt;
        }
        if (totalPrice == sum) {
            bw.write("Yes");
        } else {
            bw.write("No");
        }
        bw.flush();
        br.close();
        bw.close();
    }
}
