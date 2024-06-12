package 백준.단계별로풀기.심화1;

import java.io.*;
import java.util.StringTokenizer;

public class Baekjoon25206 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        double cSum = 0;
        double sSum = 0;

        while ((st = new StringTokenizer(br.readLine())).hasMoreTokens()) {
            String course = st.nextToken();
            double time = Double.parseDouble(st.nextToken());
            String grade = st.nextToken();

            if (!grade.equals("P")) {
                cSum += time;
                switch (grade) {
                    case "A+":
                        sSum += 4.5 * time;
                        break;
                    case "A0":
                        sSum += 4.0 * time;
                        break;
                    case "B+":
                        sSum += 3.5 * time;
                        break;
                    case "B0":
                        sSum += 3.0 * time;
                        break;
                    case "C+":
                        sSum += 2.5 * time;
                        break;
                    case "C0":
                        sSum += 2.0 * time;
                        break;
                    case "D+":
                        sSum += 1.5 * time;
                        break;
                    case "D0":
                        sSum += 1.0 * time;
                        break;
                }
            }
        }
        bw.write(String.format("%.6f",sSum / cSum ));
        bw.flush();
        bw.close();
        br.close();
    }
}
