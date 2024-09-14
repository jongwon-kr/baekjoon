package 백준.코테스터디.시뮬레이션;

import java.io.*;
import java.util.StringTokenizer;

public class Baekjoon13335 {

    public static int n = 0, w = 0, L = 0;
    public static int[] trucks;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());   // 트럭의 수
        w = Integer.parseInt(st.nextToken());   // 동시에 올라갈 수 있는 트럭의 수
        L = Integer.parseInt(st.nextToken());   // 다리의 최대 하중
        trucks = new int[n];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            trucks[i] = Integer.parseInt(st.nextToken());
        }

                }
            }