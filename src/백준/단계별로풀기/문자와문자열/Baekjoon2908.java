package 백준.단계별로풀기.문자와문자열;

import java.io.*;
import java.util.Collections;
import java.util.StringTokenizer;

public class Baekjoon2908 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        String str1 = st.nextToken();
        String reverseStr1 = "";
        for (int i = str1.length() - 1; i >= 0; i--) {
            reverseStr1 += String.valueOf(str1.charAt(i));
        }
        String str2 = st.nextToken();
        String reverseStr2 = "";
        for (int i = str2.length() - 1; i >= 0; i--) {
            reverseStr2 += String.valueOf(str2.charAt(i));
        }
        if (Integer.parseInt(reverseStr1) > Integer.parseInt(reverseStr2)) {
            bw.write(reverseStr1);
        } else {
            bw.write(reverseStr2);
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
