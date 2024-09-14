package 백준.sstudy.week5;

import java.io.*;

public class Baekjoon1343 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();
        String poliA = "AAAA";
        String poliB = "BB";

        str = str.replaceAll("XXXX", poliA);
        str = str.replaceAll("XX", poliB);

        if (str.contains("X")) {
            bw.write("-1");
        } else {
            bw.write(str);
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
