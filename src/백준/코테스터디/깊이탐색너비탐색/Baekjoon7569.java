package 백준.코테스터디.깊이탐색너비탐색;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Baekjoon7569 {

    public static int M, N, H;
    public static int[][][] tomatoArr;
    public static int[][][] visited;
    public static int[] dx = {1, -1, 0, 0, 0, 0};
    public static int[] dy = {0, 0, 1, -1, 0, 0};
    public static int[] dz = {0, 0, 0, 0, 1, -1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());
        H = Integer.parseInt(st.nextToken());

        tomatoArr = new int[H][N][M];
        visited = new int[H][N][M];

        Queue<int[]> queue = new LinkedList<>();

        // 익은 토마토들을 분리해서 queue 배열에 저장
        for (int i = 0; i < H; i++) {
            for (int j = 0; j < N; j++) {
                st = new StringTokenizer(br.readLine());
                for (int k = 0; k < M; k++) {
                    tomatoArr[i][j][k] = Integer.parseInt(st.nextToken());
                    if (tomatoArr[i][j][k] == 1) {
                        queue.add(new int[]{k, j, i});
                        visited[i][j][k] = 1;
                    }
                }
            }
        }

        // queue배열을 너비탐색
        int days = bfs(queue);

        for (int i = 0; i < H; i++) {
            for (int j = 0; j < N; j++) {
                for (int k = 0; k < M; k++) {
                    if (tomatoArr[i][j][k] == 0) {
                        bw.write("-1");
                        bw.flush();
                        return;
                    }
                }
            }
        }
        bw.write(String.valueOf(days));
        bw.flush();
        bw.close();
        br.close();
    }

    public static int bfs(Queue<int[]> queue) {
        int days = 0;

        while (!queue.isEmpty()) {
            int size = queue.size();

            for (int i = 0; i < size; i++) {
                int[] ripeT = queue.poll();
                int x = ripeT[0];
                int y = ripeT[1];
                int z = ripeT[2];

                for (int j = 0; j < 6; j++) {
                    int nx = x + dx[j];
                    int ny = y + dy[j];
                    int nz = z + dz[j];

                    if (nx >= 0 && ny >= 0 && nz >= 0 && nx < M && ny < N && nz < H) {
                        if ((visited[nz][ny][nx]==0) && tomatoArr[nz][ny][nx] == 0) {
                            tomatoArr[nz][ny][nx] = 1;
                            visited[nz][ny][nx] = 1;
                            queue.add(new int[]{nx, ny, nz});
                        }
                    }
                }
            }

            if (!queue.isEmpty()) {
                days++;
            }
        }

        return days;
    }
}
