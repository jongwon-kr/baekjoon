package 백준.코테스터디.test9;

import java.io.*;
import java.util.*;

public class Baekjoon17391 {

    public static int N = 0;
    public static int M = 0;
    public static int[][] map;
    public static int[][] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        map = new int[N][M];
        visited = new int[N][M];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
                visited[i][j] = Integer.MAX_VALUE;
            }
        }

        bfs();
        System.out.println(visited[N-1][M-1]);
    }

    public static void bfs() {
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[] {0, 0});
        visited[0][0] = 0;

        int[] dx = {0, 1};
        int[] dy = {1, 0};

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int x = current[0];
            int y = current[1];
            int currentMoves = visited[x][y];
            int maxSteps = map[x][y];

            for (int i = 0; i < 2; i++) {
                for (int step = 1; step <= maxSteps; step++) {
                    int nx = x + dx[i] * step;
                    int ny = y + dy[i] * step;
                    if (nx < N && ny < M && currentMoves + 1 < visited[nx][ny]) {
                        visited[nx][ny] = currentMoves + 1;
                        queue.add(new int[]{nx, ny});
                    }
                }
            }
        }
    }
}