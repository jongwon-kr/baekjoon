package 백준.단계별로풀기.배열1차원;

import java.io.*;

public class Baekjoon5597 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] arr = new int[30];

        for (int i = 0; i < 28; i++) {
            int temp = Integer.parseInt(br.readLine());
            arr[temp - 1] = temp;
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                bw.write((i+1) + "\n");
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
