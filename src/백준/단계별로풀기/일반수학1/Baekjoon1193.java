package 백준.단계별로풀기.일반수학1;

import java.io.*;

public class Baekjoon1193 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine()) - 1;
        boolean toTop = true;
        int x = 1, y = 1;

        for (int n = 0; n < num; n++) {
            if (toTop) {
                if (x - 1 == 0) {
                    x++;
                    toTop = false;
                }
                x--;
                y++;
            } else {
                if (y - 1 == 0) {
                    y++;
                    toTop = true;
                }
                x++;
                y--;
            }
        }
        bw.write(x + "/" + y);
        bw.flush();
        bw.close();
        br.close();
    }
}