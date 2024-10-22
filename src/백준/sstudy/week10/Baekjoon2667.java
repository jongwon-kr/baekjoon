package 백준.sstudy.week10;

import java.awt.*;
import java.io.*;
import java.util.*;

public class Baekjoon2667 {

    static int N;
    static int[][] field;
    static boolean[][] visited;
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    static ArrayList<Integer> result = new ArrayList<>();

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        N = Integer.parseInt(br.readLine());
        field = new int[N][N];
        visited = new boolean[N][N];

        for (int i = 0; i < N; i++) {
            String line = br.readLine();
            for (int j = 0; j < N; j++) {
                // 입력값이 0100203 처럼 붙어있어서 charAt로 배열에 저장
                field[i][j] = Integer.parseInt(line.charAt(j) + "");
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (!visited[i][j] && field[i][j] == 1) {
                    bfs(i, j);
                }
            }
        }

        // 오름차순 정렬
        Collections.sort(result);

        bw.write(result.size()+"\n");
        for (Integer i : result) {
            bw.write(i+"\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }

    static void bfs(int x, int y) {
        Queue<Point> q = new LinkedList<Point>();
        visited[x][y] = true;

        q.add(new Point(x, y));  // 큐에 방문지점 추가

        int cnt = 1; // 방문지점에서 시작
        while (!q.isEmpty()) {
            Point c = q.poll(); // 맨 앞의 큐를 꺼냄
            // 상, 하, 좌, 우 4방향 탐색
            for (int i = 0; i < 4; i++) {
                // 배열을 벗어나면 continue
                if (c.x + dx[i] < 0 || c.x + dx[i] > N - 1 || c.y + dy[i] < 0 || c.y + dy[i] > N - 1) continue;
                if (!visited[c.x + dx[i]][c.y + dy[i]] && field[c.x + dx[i]][c.y + dy[i]] == 1) {
                    visited[c.x + dx[i]][c.y + dy[i]] = true;
                    q.add(new Point(c.x + dx[i], c.y + dy[i]));
                    cnt++;
                }
            }
        }
        result.add(cnt);
    }

}
