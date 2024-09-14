package 백준.코테스터디.수학;

import java.io.*;
import java.util.StringTokenizer;

public class Baekjoon1253 {

    public static int N = 0;
    public static int[] nums;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        N = Integer.parseInt(br.readLine());
        nums = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < N; i++) {

        }

    }

    public static boolean BSearchRecursive(int n, int left, int right) {
        if(left > right) return false;

        int mid = (left + right) / 2;

        if (nums[mid] < n)
            return BSearchRecursive(n, mid +1, right);
        else if (nums[mid] > n)
            return BSearchRecursive(n, left, mid - 1);
        else
            return true;

    }
}
