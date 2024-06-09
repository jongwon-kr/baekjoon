package 백준.단계별로풀기.문자와문자열;

import java.io.*;

public class Baekjoon5622 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = br.readLine();
        char alphabet = '\u0000';
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            alphabet = str.charAt(i);
            switch (alphabet) {
                case 'A', 'B', 'C':
                    sum += 3;
                    break;
                case 'D', 'E', 'F':
                    sum += 4;
                    break;
                case 'G', 'H', 'I':
                    sum += 5;
                    break;
                case 'J', 'K', 'L':
                    sum += 6;
                    break;
                case 'M', 'N', 'O':
                    sum += 7;
                    break;
                case 'P', 'Q', 'R', 'S':
                    sum += 8;
                    break;
                case 'T', 'U', 'V':
                    sum += 9;
                    break;
                case 'W', 'X', 'Y', 'Z':
                    sum += 10;
                    break;
            }
        }
        bw.write(String.valueOf(sum));
        bw.flush();
        bw.close();
        br.close();
    }
}
