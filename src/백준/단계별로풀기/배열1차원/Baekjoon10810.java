package 백준.단계별로풀기.배열1차원;

import java.io.*;
import java.util.StringTokenizer;

public class Baekjoon10810 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];
        int sBox = 0;
        int fBox = 0;
        int bNum = 0;

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            sBox = Integer.parseInt(st.nextToken());
            fBox = Integer.parseInt(st.nextToken());
            bNum = Integer.parseInt(st.nextToken());
            for (int j = (sBox - 1); j < fBox; j++) {
                arr[j] = bNum;
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
