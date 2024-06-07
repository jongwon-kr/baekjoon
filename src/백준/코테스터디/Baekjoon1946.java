package 백준.코테스터디;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Baekjoon1946 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            int vNum = Integer.parseInt(br.readLine());
            int[][] rankArr = new int[vNum][2];

            for (int j = 0; j < vNum; j++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                rankArr[j][0] = Integer.parseInt(st.nextToken());
                rankArr[j][1] = Integer.parseInt(st.nextToken());
            }

            Arrays.sort(rankArr, Comparator.comparingInt(o -> o[0]));

            int cnt = 1;
            int minRank = rankArr[0][1];

            for (int j = 1; j < vNum; j++) {
                if (rankArr[j][1] < minRank) {
                    cnt++;
                    minRank = rankArr[j][1];
                }
            }
            System.out.println(cnt);
        }
    }
}
