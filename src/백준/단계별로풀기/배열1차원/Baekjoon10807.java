package 백준.단계별로풀기.배열1차원;

import java.io.*;
import java.util.StringTokenizer;

public class Baekjoon10807 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        int checkNum = 0;
        int cnt = 0;

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        checkNum = Integer.parseInt(st.nextToken());

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == checkNum) {
                cnt++;
            }
        }
        bw.write(String.valueOf(cnt));
        bw.flush();
        br.close();
        bw.close();
    }
}
