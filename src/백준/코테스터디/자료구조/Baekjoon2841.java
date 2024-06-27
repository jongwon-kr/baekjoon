package 백준.코테스터디.자료구조;

import java.io.*;
import java.util.StringTokenizer;

public class Baekjoon2841 {

    public static int N = 0;
    public static int P = 0;


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        P = Integer.parseInt(st.nextToken());
    }
}
