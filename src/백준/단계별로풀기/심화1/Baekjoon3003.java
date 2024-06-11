package 백준.단계별로풀기.심화1;

import java.io.*;
import java.util.StringTokenizer;

public class Baekjoon3003 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] cArr = {1, 1, 2, 2, 2, 8};
        int[] arr = new int[6];
        for (int i = 0; i < 6; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            cArr[i] = cArr[i] - arr[i];
        }

        for (int i : cArr) {
            bw.write(i+" ");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
