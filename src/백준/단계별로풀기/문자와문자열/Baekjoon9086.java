package 백준.단계별로풀기.문자와문자열;

import java.io.*;

public class Baekjoon9086 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        String str = "";
        for (int i = 0; i < n; i++) {
            str = br.readLine();
            bw.write(str.substring(0, 1) + str.substring(str.length() - 1, str.length()) + "\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
