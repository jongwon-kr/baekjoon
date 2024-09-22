package 백준.단계별로풀기.기하직사각형삼각형;

import java.io.*;

public class Baekjoon27323 {

    static int A, B;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        A = Integer.parseInt(br.readLine());
        B = Integer.parseInt(br.readLine());

        bw.write((A * B) + "");
        bw.flush();
        bw.close();
        br.close();
    }

}
