package 백준.단계별로풀기.문자와문자열;

import java.io.*;

public class Baekjoon27866 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();
        int index = Integer.parseInt(br.readLine()) - 1;

        bw.write(str.charAt(index));
        bw.flush();
        bw.close();
        br.close();
    }
}
