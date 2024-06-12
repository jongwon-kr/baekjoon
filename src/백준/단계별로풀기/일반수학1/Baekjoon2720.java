package 백준.단계별로풀기.일반수학1;

import java.io.*;

public class Baekjoon2720 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int cent = 0;
        int[][] changeArr = new int[n][4];

        for (int i = 0; i < n; i++) {
            cent = Integer.parseInt(br.readLine());
            while (cent>0){
                if (cent >= 25) {
                    changeArr[i][0] = cent/25;
                    cent %= 25;
                } else if (cent >= 10) {
                    changeArr[i][1] = cent/10;
                    cent %= 10;
                } else if (cent >= 5) {
                    changeArr[i][2] = cent/5;
                    cent %= 5;
                } else if (cent > 0) {
                    changeArr[i][3] = cent;
                    cent = 0;
                }
            }
        }

        for (int[] ints : changeArr) {
            for (int c : ints) {
                bw.write(c+" ");
            }
            bw.write("\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
