package 백준.단계별로풀기.기하직사각형삼각형;

import java.io.*;

public class Baekjoon10101 {

    static int[] angles = new int[3];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for (int i = 0; i < 3; i++) {
            angles[i] = Integer.parseInt(br.readLine());
        }

        if (angles[0] + angles[1] + angles[2] != 180) {
            bw.write("Error");
        } else if (angles[0] == 60 && angles[1] == 60 && angles[2] == 60) {
            bw.write("Equilateral");
        } else if (angles[0] == angles[1] || angles[1] == angles[2] || angles[2] == angles[0]) {
            bw.write("Isosceles");
        } else {
            bw.write("Scalene");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
