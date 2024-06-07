package 백준.단계별로풀기.반복문;

import java.io.*;
import java.util.StringTokenizer;

public class Baekjoon11022 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int num1 = 0;
        int num2 = 0;

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            num1 = Integer.parseInt(st.nextToken());
            num2 = Integer.parseInt(st.nextToken());
            bw.write(String.format("Case #%d: %d + %d = %d\n",i+1,num1,num2,(num1+num2)));
        }
        bw.flush();
        bw.close();
    }
}
