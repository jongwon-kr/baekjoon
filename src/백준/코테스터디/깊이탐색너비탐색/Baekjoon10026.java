package 백준.코테스터디.깊이탐색너비탐색;

import java.io.*;

public class Baekjoon10026 {

    public static int N = 0;
    public static char[][] screen;
    public static boolean[][] visited;
    public static int nWeakCnt = 0;
    public static int weakCnt = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = "";

        N = Integer.parseInt(br.readLine());
        screen = new char[N][N];
        visited = new boolean[N][N];

        for (int i = 0; i < N; i++) {
            str = br.readLine();
            for (int j = 0; j < N; j++) {
                screen[i][j] = str.charAt(j);
            }
        }

        // 적록색약 X
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (visited[i][j] == false) {
                    dfs(i, j, screen[i][j]);
                    nWeakCnt++;
                }
            }
        }

        visited = new boolean[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (screen[i][j] == 'G') {
                    screen[i][j] = 'R';
                }
            }
        }
        // 적록색약 X
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (visited[i][j] == false) {
                    dfs(i, j, screen[i][j]);
                    weakCnt++;
                }
            }
        }

        bw.write(nWeakCnt + " " + weakCnt);
        bw.flush();
        bw.close();
        br.close();
    }

    public static int dfs(int x, int y, char check) {
        if (x >= N || x <= -1 || y >= N || y <= -1) {
            return 0;
        }

        if (screen[x][y] == check && visited[x][y] == false) {
            visited[x][y] = true;

            dfs(x + 1, y, check);
            dfs(x - 1, y, check);
            dfs(x, y + 1, check);
            dfs(x, y - 1, check);
        }
        return 0;
    }
}
