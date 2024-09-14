package 백준.코테스터디.해시;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Baekjoon1351 {

    public static long N = 0;
    public static long P = 0;
    public static long Q = 0;
    public static Map<Long, Long> memo = new HashMap<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Long.parseLong(st.nextToken());
        P = Long.parseLong(st.nextToken());
        Q = Long.parseLong(st.nextToken());

        long result = getNum(N);
        bw.write(result + "");
        bw.flush();
        bw.close();
        br.close();
    }

    public static long getNum(long n) {
        if (n == 0) {
            return 1;
        }

        if (memo.containsKey(n)) {
            return memo.get(n);
        }

        long num = getNum(n / P) + getNum(n / Q);
        memo.put(n, num);

        return num;
    }
}
