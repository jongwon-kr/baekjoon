package 백준.단계별로풀기.문자와문자열;

import java.io.*;
import java.util.StringTokenizer;

public class Baekjoon2675 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());


        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int mul = Integer.parseInt(st.nextToken());
            String str = st.nextToken();

            for (int j = 0; j < str.length(); j++) {
                String result = String.valueOf(str.charAt(j));
                for (int k = 0; k < mul; k++) {
                    bw.write(result);
                }
            }
            bw.write("\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
