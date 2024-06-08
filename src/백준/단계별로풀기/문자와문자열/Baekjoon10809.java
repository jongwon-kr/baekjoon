package 백준.단계별로풀기.문자와문자열;

import java.io.*;

public class Baekjoon10809 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();
        int[] arr = new int[26];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = -1;
        }

        // 'a' = 97

        for (int i = 0; i < str.length(); i++) {
            if (arr[(int)str.charAt(i)-97] == -1) {
                arr[(int)str.charAt(i)-97] = i;
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
