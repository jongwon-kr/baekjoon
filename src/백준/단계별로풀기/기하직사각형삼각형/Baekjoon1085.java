package 백준.단계별로풀기.기하직사각형삼각형;

import java.io.*;
import java.util.StringTokenizer;

public class Baekjoon1085 {

    static int x, y, w, h;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        x = Integer.parseInt(st.nextToken());
        y = Integer.parseInt(st.nextToken());
        w = Integer.parseInt(st.nextToken());
        h = Integer.parseInt(st.nextToken());

        int min = Math.min(x, w - x);
        min = Math.min(min, Math.min(y, h - y));
        bw.write(min + "\n");
        bw.flush();
        bw.close();
        br.close();
    }

}
