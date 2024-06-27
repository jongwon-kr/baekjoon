package 백준.코테스터디.정렬;

import java.io.*;
import java.util.Arrays;

public class Baekjoon1431 {

    public static int N;
    public static String[] strs;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        N = Integer.parseInt(br.readLine());
        strs = new String[N];

        for (int i = 0; i < N; i++) {
            strs[i] = br.readLine();
        }

        Arrays.sort(strs, (s1, s2) -> {
            int sum1 = getSum(s1);
            int sum2 = getSum(s2);

            if (s1.length() != s2.length()) {
                return s1.length() - s2.length();
            } else if (sum1 != sum2) {
                // 숫자 합
                if (sum1 > sum2) {
                    return sum1;
                } else {
                    return sum1 - sum2;
                }
            }
            // 사전 순
            return s1.compareTo(s2);
        });

        for (String str : strs) {
            bw.write(str + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }

    static int getSum(String str) {
        int sum = 0;
        for (char c : str.toCharArray()) {
            if (c >= '0' && c <= '9') {
                sum += c - '0';
            }
        }
        return sum;
    }
}
