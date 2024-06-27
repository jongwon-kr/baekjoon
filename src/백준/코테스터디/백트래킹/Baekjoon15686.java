package 백준.코테스터디.백트래킹;

import java.io.*;
import java.util.*;

public class Baekjoon15686 {

    public static int N, M; // N : 도시의 크기(N X N), M : 선택 할 치킨집 수
    public static int[][] city;
    public static ArrayList<int[]> house = new ArrayList<>();
    public static ArrayList<int[]> chicken = new ArrayList<>();
    public static int min = Integer.MAX_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        city = new int[N][N];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                city[i][j] = Integer.parseInt(st.nextToken());
                if (city[i][j] == 1) {  // 집 위치를 배열에 저장
                    house.add(new int[]{i, j});
                } else if (city[i][j] == 2) {   // 치킨집 위치를 배열에 저장
                    chicken.add(new int[]{i, j});
                }
            }
        }

        selChicken(new ArrayList<>(), 0, 0);

        bw.write(String.valueOf(min));
        bw.flush();
        bw.close();
        br.close();
    }

    public static void selChicken(List<int[]> curList, int start, int cnt) {
        if (cnt == M) {
            calDistance(curList);
        }else{
            for (int i = start; i < chicken.size(); i++) {
                curList.add(chicken.get(i));
                selChicken(curList, i + 1, cnt + 1);
                curList.remove(curList.size() - 1);
            }
        }
    }

    public static void calDistance(List<int[]> curList) {

        int total = 0;

        for (int[] h : house) {
            int min = Integer.MAX_VALUE;
            for (int[] c : curList) {
                // 절대값 abs
                int distance = Math.abs(h[0] - c[0]) + Math.abs(h[1] - c[1]);
                min = Math.min(min, distance);
            }
            total += min;
        }

        min = Math.min(min, total);
    }
}
