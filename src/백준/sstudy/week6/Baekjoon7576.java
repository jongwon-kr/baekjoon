package 백준.sstudy.week6;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Baekjoon7576 {

    static class Node {
        int x;
        int y;
        int days;
        public Node(int x, int y, int days) {
            this.x = x;
            this.y = y;
            this.days = days;
        }
    }

    static int N, M;    // N = 세로, M = 가로
    static int days = 0;    // 모든 토마토가 익는 경과일
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, -1, 0, 1};
    static int[][] map;
    static Queue<Node> q = new LinkedList<>();


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());
        map = new int[N][M];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        for (int x = 0; x < N; x++) {
            for (int y = 0; y < M; y++) {
                if (map[x][y] == 1) {
                    q.offer(new Node(x, y, 0));
                }
            }
        }

        bfs();
        if (checkTomato()) {
            bw.write(days + "");
        } else {
            bw.write("-1");
        }
        bw.flush();
        bw.close();
        br.close();
    }

    static void bfs() {
        while (!q.isEmpty()) {
            Node n = q.poll();
            days = n.days;
            for (int j = 0; j < 4; j++) {
                if (n.x + dx[j] < 0 || n.x + dx[j] > N - 1 || n.y + dy[j] < 0 || n.y + dy[j] > M - 1) continue;
                if (map[n.x + dx[j]][n.y + dy[j]] == 0) {
                    map[n.x + dx[j]][n.y + dy[j]] = 1;
                    q.offer(new Node(n.x + dx[j], n.y + dy[j], days + 1));
                }
            }
        }
    }

    static boolean checkTomato() {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (map[i][j] == 0) {
                    return false;
                }
            }
        }
        return true;
    }
}
