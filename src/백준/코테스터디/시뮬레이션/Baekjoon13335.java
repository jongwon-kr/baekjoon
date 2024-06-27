package 백준.코테스터디.시뮬레이션;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Baekjoon13335 {

    public static int n = 0, w = 0, L = 0;
    public static int[] trucks;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int time = 0;   // 걸린 시간
        int onWeight = 0;   // 지나가고 있는 트럭들의 총 무게
        Queue<Integer> bridge = new LinkedList<>(); // 다리 큐

        n = Integer.parseInt(st.nextToken());   // 트럭의 수
        w = Integer.parseInt(st.nextToken());   // 동시에 올라갈 수 있는 트럭의 수
        L = Integer.parseInt(st.nextToken());   // 다리의 최대 하중
        trucks = new int[n];

        // 다리의 길이만큼 빈공간 추가 0
        for (int i = 0; i < w; i++) {
            bridge.add(0);
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            trucks[i] = Integer.parseInt(st.nextToken());
        }

        int truckIndex = 0;
        while (!bridge.isEmpty()) {
            time++;
            onWeight -= bridge.poll();

            if (truckIndex < n) {
                if (onWeight + trucks[truckIndex] <= L) {
                    onWeight += trucks[truckIndex];
                    bridge.add(trucks[truckIndex++]);
                } else {
                    bridge.add(0);
                }
            }
        }
        bw.write(String.valueOf(time));
        bw.flush();
        bw.close();
        br.close();
    }
}