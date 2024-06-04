package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Baekjoon1946 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String rl;

        int n = Integer.parseInt(br.readLine());
        int vNum = 0;
        int[][] rankArr;
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            vNum = Integer.parseInt(br.readLine());
            rankArr = new int[vNum][2];
            cnt = 0;
            for (int j = 0; j < vNum; j++) {
                rl = br.readLine();
                rankArr[j][0] = Integer.parseInt(rl.split(" ")[0]);
                rankArr[j][1] = Integer.parseInt(rl.split(" ")[1]);
            }
            for (int[] ranks : rankArr) {
                int cnt2 = 0;
                for (int[] ranks2 : rankArr) {
                    if (ranks[0] < ranks2[0]) {
                        cnt2++;
                    }
                    if (ranks[1] < ranks2[1]) {
                        cnt2++;
                    }
                }
                if (cnt2 > 0) {
                    cnt++;
                }
            }
            System.out.println("cnt = " + cnt);
        }
    }
}