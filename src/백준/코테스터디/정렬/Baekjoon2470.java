package 백준.코테스터디.정렬;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Baekjoon2470 {

    public static int N = 0;
    public static int[] values;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        N = Integer.parseInt(br.readLine());
        values = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            values[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(values);

        int[] output = getMinValue();

        for (int i : output) {
            bw.write(i + " ");
        }

        bw.flush();
        bw.close();
        br.close();
    }

    static int[] getMinValue() {
        int left = 0;
        int right = N - 1;
        int min = Integer.MAX_VALUE;
        int[] result = new int[2];

        while (left < right) {
            int sum = values[left] + values[right];
            if (Math.abs(sum) < min) {
                min = Math.abs(sum);
                result[0] = values[left];
                result[1] = values[right];
            }
            if (sum < 0) {
                left++;
            } else {
                right--;
            }
        }
        return result;
    }
}
