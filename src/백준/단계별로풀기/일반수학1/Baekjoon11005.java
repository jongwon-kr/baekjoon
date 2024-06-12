package 백준.단계별로풀기.일반수학1;

import java.io.*;
import java.util.StringTokenizer;

public class Baekjoon11005 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int num = Integer.parseInt(st.nextToken());
        int base = Integer.parseInt(st.nextToken());

        String result = convertToBase(num, base);

        bw.write(result);
        bw.flush();
        bw.close();
        br.close();
    }

    public static String convertToBase(int num, int base) {
        if (num == 0) {
            return "0";
        }

        StringBuilder sb = new StringBuilder();
        while (num > 0) {
            int remainder = num % base;
            if (remainder < 10) {
                sb.append((char) (remainder + '0')); // 0-9
            } else {
                sb.append((char) (remainder - 10 + 'A')); // A-Z
            }
            num /= base;
        }

        return sb.reverse().toString();
    }
}
