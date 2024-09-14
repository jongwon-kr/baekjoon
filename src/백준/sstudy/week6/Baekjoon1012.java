package 백준.sstudy.week6;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Baekjoon1012 {

    static class Node {
        int x;
        int y;

        public Node(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    static int T, N, M, K, wCnt;
    static int[][] map;
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    static boolean[][] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());
            N = Integer.parseInt(st.nextToken());
            M = Integer.parseInt(st.nextToken());
            K = Integer.parseInt(st.nextToken());
            map = new int[N][M];
            visited = new boolean[N][M];
            wCnt = 0;

            for (int j = 0; j < K; j++) {
                st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());
                map[x][y] = 1;
            }

            for (int x = 0; x < N; x++) {
                for (int y = 0; y < M; y++) {
                    if (map[x][y] == 1 && !visited[x][y]) {
                        bfs(x, y);  // 너비 우선 탐색
                    }
                }
            }
            bw.write(wCnt + "\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }

    static void bfs(int x, int y) {
        wCnt++;     // 지렁이 1마리 추가
        Queue<Node> q = new LinkedList<>();

        visited[x][y] = true;
        q.offer(new Node(x, y));

        while (!q.isEmpty()) {
            Node n = q.poll();
            for (int i = 0; i < 4; i++) {
                if (n.x + dx[i] < 0 || n.x + dx[i] > N - 1 || n.y + dy[i] < 0 || n.y + dy[i] > M - 1) continue;
                if (map[n.x + dx[i]][n.y + dy[i]] == 1 && !visited[n.x + dx[i]][n.y + dy[i]]) {
                    visited[n.x + dx[i]][n.y + dy[i]] = true;
                    q.offer(new Node(n.x + dx[i], n.y + dy[i]));
                }
            }
        }
    }

}
