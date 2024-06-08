package 백준.단계별로풀기.문자와문자열;

import java.io.*;

public class Baekjoon11654 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        char c = str.charAt(0);
        int asc = Integer.valueOf(c);
        System.out.println(asc);
        br.close();
    }
}
