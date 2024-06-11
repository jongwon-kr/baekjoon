package 백준.단계별로풀기.심화1;

import java.io.*;

public class Baekjoon10988 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();
        int length = str.length() - 1;
        int cnt = 0;

        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) == str.charAt(length--)) {
                cnt++;
            }
        }

        if (cnt == str.length() / 2) {
            bw.write("1");
        } else {
            bw.write("0");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
