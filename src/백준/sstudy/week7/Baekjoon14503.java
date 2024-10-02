package 백준.sstudy.week7;

import java.io.*;
import java.util.StringTokenizer;

public class Baekjoon14503 {

    static int N, M;
    static int r, c, d;
    static int[][] map;
    static int count = 1;
    // 방향
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        ;

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        map = new int[N][M];

        st = new StringTokenizer(br.readLine());
        r = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());
        d = Integer.parseInt(st.nextToken());

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        clean(r, c, d);

        bw.write(count + "");
        bw.flush();
        bw.close();
        br.close();
    }

    public static void clean(int x, int y, int dir) {
        map[x][y] = -1;

        for (int i = 0; i < 4; i++) {
            // 시계 반대방향으로 회전
            dir = (dir + 3) % 4;

            int nx = x + dx[dir];
            int ny = y + dy[dir];
            if (nx >= 0 && ny >= 0 && nx < N && ny < M) {
                // 청소하지 않았을 경우
                if (map[nx][ny] == 0) {
                    count++;
                    clean(nx, ny, dir);
                    return;
                }
            }
        }

        // 후진
        int back = (dir + 2) % 4;
        int bx = x + dx[back];
        int by = y + dy[back];
        if (bx >= 0 && by >= 0 && bx < N && by < M && map[bx][by] != 1) {
            clean(bx, by, dir);
        }
    }
}
