package 백준.단계별로풀기.문자와문자열;

import java.io.*;

public class Baekjoon2743 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();

        bw.write(String.valueOf(str.length()));
        bw.flush();
        bw.close();
        br.close();
    }
}
