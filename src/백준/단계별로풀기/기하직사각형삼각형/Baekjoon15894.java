package 백준.단계별로풀기.기하직사각형삼각형;

import java.io.*;

public class Baekjoon15894 {

    static Long N;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        N = Long.parseLong(br.readLine());

        bw.write(N * 4 + "");
        bw.flush();
        bw.close();
        br.close();
    }

}
