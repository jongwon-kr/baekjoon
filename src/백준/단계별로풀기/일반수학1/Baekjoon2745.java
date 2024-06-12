package 백준.단계별로풀기.일반수학1;

import java.io.*;
import java.util.StringTokenizer;

public class Baekjoon2745 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String number = st.nextToken();
        int num = Integer.parseInt(st.nextToken());

        int result = Integer.parseInt(number, num);

        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
        br.close();
    }
}
