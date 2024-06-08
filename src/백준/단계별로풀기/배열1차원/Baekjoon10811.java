package 백준.단계별로풀기.배열1차원;

import java.io.*;
import java.util.StringTokenizer;

public class Baekjoon10811 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];
        int[] tempArr = new int[N];
        int firBox = 0;
        int secBox = 0;

        for (int i = 0; i < N; i++) {
            arr[i] = i+1;
            tempArr[i] = i+1;
        }
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            firBox = Integer.parseInt(st.nextToken()) - 1;
            secBox = Integer.parseInt(st.nextToken()) - 1;
            int temp = firBox;
            for (int j = secBox; j >= firBox; j--) {
                arr[temp++] = tempArr[j];
            }
            for (int j = 0; j < N; j++) {
                tempArr[j] = arr[j];
            }
        }
        for (int i : arr) {
            bw.write(i + " ");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
