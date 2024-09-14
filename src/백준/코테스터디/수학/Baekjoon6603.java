package 백준.코테스터디.수학;

import java.io.*;
import java.util.StringTokenizer;

public class Baekjoon6603 {

    public static int k = 0;
    public static int[] S;
    public static int[] lotto = new int[6];
    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st;

        while (true) {
            st = new StringTokenizer(br.readLine());
            k = Integer.parseInt(st.nextToken());
            if (k == 0) {
                break;
            }

            S = new int[k];
            for (int i = 0; i < k; i++) {
                S[i] = Integer.parseInt(st.nextToken());
            }

            getNumbers(0, 0);

            bw.write("\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }

    public static void getNumbers(int index, int numCnt) throws IOException {
        // 로또 번호가 완성되면 다음 숫자로
        if (numCnt == 6) {
            for (int i = 0; i < 6; i++) {
                bw.write(lotto[i] + " ");
            }
            bw.write("\n");
            return;
        }

        for (int i = index; i < k; i++) {
            lotto[numCnt] = S[i];
            getNumbers(i + 1, numCnt + 1);
        }
    }
}
