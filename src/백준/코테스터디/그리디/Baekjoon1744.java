package 백준.코테스터디.그리디;

import java.io.*;
import java.util.Arrays;

public class Baekjoon1744 {

    public static int N = 0;
    public static int totalSum = 0;
    public static int[] nums;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        N = Integer.parseInt(br.readLine());

        nums = new int[N];
        for (int i = 0; i < N; i++) {
            nums[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(nums);

        int i = N - 1;
        // 제일 큰 수부터 처리 양수
        while (i > 0 && nums[i] > 0) {
            if (nums[i] > 1 && nums[i - 1] > 1) {
                totalSum += nums[i] * nums[i - 1];
                i -= 2;
            } else {
                totalSum += nums[i];
                i--;
            }
        }
        
        // 배열 첫 번째 처리
        if (i == 0 && nums[i] > 0) {
            totalSum += nums[i];
        }

        // 음수 처리
        i = 0;
        while (i < N - 1 && nums[i] <= 0 && nums[i + 1] <= 0) {
            totalSum += nums[i] * nums[i + 1];
            i += 2;
        }

        if (i < N && nums[i] <= 0) {
            totalSum += nums[i];
        }

        bw.write(String.valueOf(totalSum));
        bw.flush();
        bw.close();
        br.close();
    }
}