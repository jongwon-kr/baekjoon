package 백준.단계별로풀기.일반수학1;

import java.io.*;
import java.util.StringTokenizer;

public class Baekjoon2869 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken()); // 낮에 올라가는 높이
        int B = Integer.parseInt(st.nextToken()); // 밤에 내려오는 높이
        int V = Integer.parseInt(st.nextToken()); // 나무의 높이

        if (A >= V) {
            bw.write("1");
        } else {
            int days = (V - A) / (A - B);
            if ((V - A) % (A - B) != 0) {
                days++;
            }
            days += 1;
            bw.write(String.valueOf(days));
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
