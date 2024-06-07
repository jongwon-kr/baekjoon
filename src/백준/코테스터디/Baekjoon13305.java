package 백준.코테스터디;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon13305 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] disArr = new int[n - 1];
        int[] costArr = new int[n - 1];
        long totalCost = 0;
        long min = 0;

        // 거리
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n - 1; i++) {
            disArr[i] = Integer.parseInt((st.nextToken()));
        }

        // cost
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n - 1; i++) {
            costArr[i] = Integer.parseInt((st.nextToken()));
        }

        min = costArr[0];
        for (int i = 0; i < n - 1; i++) {
            if (min > costArr[i]) {
                min = costArr[i];
            }
            totalCost += min * disArr[i];
        }

        System.out.println(totalCost);
    }
}
