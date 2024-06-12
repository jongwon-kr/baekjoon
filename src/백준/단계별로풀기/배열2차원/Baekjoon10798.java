package 백준.단계별로풀기.배열2차원;

import java.io.*;

public class Baekjoon10798 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = "";
        char[][] arr = new char[5][15];

        for (int i = 0; i < 5; i++) {
            str = br.readLine();
            for (int j = 0; j < str.length(); j++) {
                arr[i][j] = str.charAt(j);
            }
        }

        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 5; j++) {
                if (arr[j][i] != '\0') {
                    bw.write(String.valueOf(arr[j][i]));
                }
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
