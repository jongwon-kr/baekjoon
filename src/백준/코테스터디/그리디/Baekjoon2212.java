package 백준.코테스터디.그리디;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Baekjoon2212 {

    public static int N = 0, K = 0;
    public static int totalMin = 0;
    public static int[] points;
    public static int[] distances;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        N = Integer.parseInt(br.readLine());
        K = Integer.parseInt(br.readLine());
        points = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            points[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(points);

        distances = new int[N - 1]; // 집중국 사이 거리
        for (int i = 0; i < N - 1; i++) {
            int distance = points[i + 1] - points[i];
            distances[i] = distance;
        }
        Arrays.sort(distances);

        for (int i = 0; i < N - K; i++) {
            totalMin += distances[i];
        }

        bw.write(totalMin + "\n");
        bw.flush();
        bw.close();
        br.close();
    }
}