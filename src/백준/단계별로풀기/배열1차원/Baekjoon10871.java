package 백준.단계별로풀기.배열1차원;

import java.io.*;
import java.util.StringTokenizer;

public class Baekjoon10871 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int checkNum = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            int term = Integer.parseInt(st.nextToken());
            if (term < checkNum) {
                bw.write(term + " ");
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
