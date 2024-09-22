package 백준.단계별로풀기.기하직사각형삼각형;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Baekjoon3009 {

    static Map<Integer, Integer> mapX = new HashMap<Integer, Integer>();
    static Map<Integer, Integer> mapY = new HashMap<Integer, Integer>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        for (int i = 0; i < 3; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            mapX.put(x, mapX.getOrDefault(x, 0) + 1);
            mapY.put(y, mapY.getOrDefault(y, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : mapX.entrySet()) {
            if (entry.getValue() == 1) {
                bw.write(entry.getKey() + " ");
            }
        }

        for (Map.Entry<Integer, Integer> entry : mapY.entrySet()) {
            if (entry.getValue() == 1) {
                bw.write(entry.getKey() + "");
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
