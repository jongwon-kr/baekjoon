package 백준.단계별로풀기.배열1차원;

import java.io.*;
import java.util.StringTokenizer;

public class Baekjoon10813 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];
        int firBox = 0;
        int secBox = 0;

        for (int i = 0; i < N; i++) {
            arr[i] = i+1;
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            firBox = Integer.parseInt(st.nextToken()) - 1;
            secBox = Integer.parseInt(st.nextToken()) - 1;
            int temp = arr[firBox];
            arr[firBox] = arr[secBox];
            arr[secBox] = temp;
        }
        for (int i : arr) {
            bw.write(i + " ");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
