package 백준.단계별로풀기.기하직사각형삼각형;

import java.io.*;
import java.util.StringTokenizer;

public class Baekjoon14215 {

    static int l1, l2, l3;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        l1 = Integer.parseInt(st.nextToken());
        l2 = Integer.parseInt(st.nextToken());
        l3 = Integer.parseInt(st.nextToken());

        if (l1 + l2 > l3 && l1 + l3 > l2 && l2 + l3 > l1) {
            bw.write(String.valueOf(l1 + l2 + l3));
        } else {
            int maxPerimeter = 0;
            if (l1 >= l2 && l1 >= l3) {
                maxPerimeter = (l2 + l3) * 2 - 1;
            } else if (l2 >= l1 && l2 >= l3) {
                maxPerimeter = (l1 + l3) * 2 - 1;
            } else {
                maxPerimeter = (l1 + l2) * 2 - 1;
            }
            bw.write(String.valueOf(maxPerimeter));
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
