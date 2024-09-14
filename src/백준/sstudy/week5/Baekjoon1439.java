package 백준.sstudy.week5;

import java.io.*;

public class Baekjoon1439 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();
        int cntZero = 0;
        int cntOne = 0;

        if (str.charAt(0) == '0') {
            cntZero++;
        } else {
            cntOne++;
        }

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) != str.charAt(i - 1)) {
                if (str.charAt(i) == '0') {
                    cntZero++;
                } else {
                    cntOne++;
                }
            }
        }

        int result = Math.min(cntZero, cntOne);
        bw.write(result + "");
        bw.flush();
        bw.close();
        br.close();
    }
}
