package 백준.단계별로풀기.배열1차원;

import java.io.*;
import java.util.HashSet;
import java.util.Set;

public class Baekjoon3052 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = 10;
        int cnt = 0;
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < n; i++) {
            int temp = Integer.parseInt(br.readLine());
            set.add(temp % 42);
        }

        bw.write(String.valueOf(set.size()));
        bw.flush();
        bw.close();
        br.close();
    }
}
