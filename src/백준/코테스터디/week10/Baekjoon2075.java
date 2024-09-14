package 백준.코테스터디.week10;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Baekjoon2075 {

    public static int N;
    public static ArrayList arr = new ArrayList();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                arr.add(Integer.parseInt(st.nextToken()));
            }
        }

        Collections.sort(arr, Collections.reverseOrder());

        bw.write(String.valueOf(arr.get(N-1)));
        bw.flush();
        bw.close();
        br.close();
    }


}
