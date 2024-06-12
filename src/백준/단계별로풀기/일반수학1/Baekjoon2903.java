package 백준.단계별로풀기.일반수학1;

import java.io.*;

public class Baekjoon2903 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        int pointsPerSide = (int)Math.pow(2, n) + 1;

        int totalPoints = pointsPerSide * pointsPerSide;

        bw.write(String.valueOf(totalPoints));
        bw.flush();
        bw.close();
        br.close();
    }
}
