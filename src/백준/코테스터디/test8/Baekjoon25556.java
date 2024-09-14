package 백준.코테스터디.test8;

import java.io.*;
import java.util.*;

public class Baekjoon25556 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Stack<Integer>[] stacks = new Stack[4];
        for (int i = 0; i < 4; i++) {
            stacks[i] = new Stack<>();
        }

        int expectedValue = 1;

        for (int num : arr) {
            boolean placed = false;

            for (int i = 0; i < 4; i++) {
                if (stacks[i].isEmpty() || stacks[i].peek() > num) {
                    stacks[i].push(num);
                    placed = true;
                    break;
                }
            }

            if (!placed) {
                bw.write("NO");
                bw.flush();
                br.close();
                bw.close();
                return;
            }

            for (int i = 0; i < 4; i++) {
                while (!stacks[i].isEmpty() && stacks[i].peek() == expectedValue) {
                    stacks[i].pop();
                    expectedValue++;
                }
            }
        }

        bw.write("YES");
        bw.flush();
        br.close();
        bw.close();
    }
}
