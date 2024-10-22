package 백준.sstudy.week10;

import java.awt.*;
import java.io.*;
import java.util.*;

public class Baekjoon2573 {

    static int N, M, year = 0, cntIceberg = 0, cntIce = 0;
    static int[][] field;
    // 얼음 체크
    static boolean[][] noIce;
    static boolean[][] visited;
    // 4방향 탐색
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};

    // 빙산의 위치 기억
    static HashSet<Point> ices = new HashSet<>();

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        field = new int[N][M];
        noIce = new boolean[N][M];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                field[i][j] = Integer.parseInt(st.nextToken());
                if (field[i][j] >= 1) {
                    ices.add(new Point(i, j));
                } else {
                    noIce[i][j] = true;
                }
            }
        }

        while (!(cntIceberg > 1)) {
            meltIceberg();
            visited = new boolean[N][M];
            cntIceberg = 0;
            cntIce = 0;
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    if (!noIce[i][j] && !visited[i][j]) {
                        checkIceberg(i, j);
                    }
                }
            }
            // 빙산의 개수가 0개일 경우
            if(cntIce == 0){
                year = 0;
                break;
            }
        }

        bw.write(year + "");
        bw.flush();
        bw.close();
        br.close();
    }

    // 빙산 한번 녹이기
    static void meltIceberg() {

        for (Point ice : ices) {
            int cnt = 0;
            for (int i = 0; i < 4; i++) {
                if (ice.x + dx[i] < 0 || ice.x + dx[i] > N - 1 || ice.y + dy[i] < 0 || ice.y + dy[i] > M - 1) continue;
                if (field[ice.x + dx[i]][ice.y + dy[i]] <= 0 && noIce[ice.x + dx[i]][ice.y + dy[i]]) {
                    cnt++;
                }
            }
            field[ice.x][ice.y] -= cnt; // 주변의 바다의 수 만큼 빙산 녹음
            // 빙산이 다녹으면 0으로 초기화 및 noIce True
        }
        for (Point ice : ices) {
            if (field[ice.x][ice.y] <= 0) {
                field[ice.x][ice.y] = 0;
                noIce[ice.x][ice.y] = true;
            }
        }
        year++;
    }

    // 빙산의 개수 체크
    static void checkIceberg(int x, int y) {
        Queue<Point> queue = new LinkedList<>();

        visited[x][y] = true;
        queue.offer(new Point(x, y));
        cntIce++;

        while (!queue.isEmpty()) {
            Point c = queue.poll();
            for (int i = 0; i < 4; i++) {
                if (c.x + dx[i] < 0 || c.x > N - 1 || c.y + dy[i] < 0 || c.y > M - 1) continue;
                if (!visited[c.x + dx[i]][c.y + dy[i]] && field[c.x + dx[i]][c.y + dy[i]] >= 1) {
                    visited[c.x + dx[i]][c.y + dy[i]] = true;
                    queue.add(new Point(c.x + dx[i], c.y + dy[i]));
                    cntIce++;
                }
            }
        }
        cntIceberg++;
    }
}
