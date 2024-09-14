package 백준.코테스터디.시뮬레이션;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Baekjoon3190 {

    public static int N = 0, K = 0, L = 0;
    public static int[][] field;
    public static boolean[][] checkPos;
    public static Queue<Turn> turn = new LinkedList<>();
    public static int[] dx = {0, 1, 0, -1}; // 방향 x
    public static int[] dy = {1, 0, -1, 0}; // 방향 y

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        N = Integer.parseInt(br.readLine());
        K = Integer.parseInt(br.readLine());

        field = new int[N][N];
        checkPos = new boolean[N][N];

        // 사과 위치 저장
        for (int i = 0; i < K; i++) {
            st = new StringTokenizer(br.readLine());
            field[Integer.parseInt(st.nextToken())][Integer.parseInt(st.nextToken())] = -1;
        }

        // 방향 회전 정보 저장
        L = Integer.parseInt(br.readLine());
        for (int i = 0; i < L; i++) {
            String str = br.readLine();
            turn.add(new Turn(Integer.parseInt(str.split(" ")[0]), str.split(" ")[1].charAt(0)));
        }

        int time = 0;
        int dir = 1;
        LinkedList<int[]> snake = new LinkedList<>();
        snake.add(new int[] {0, 0});
        checkPos[0][0] = true;

        while (true) {
            time++;
            int[] head = snake.peekFirst();
            int nx = head[0] + dx[dir];
            int ny = head[1] + dy[dir];

            if (ny < 0 || nx < 0 || ny >= N || nx >= N || checkPos[ny][nx]) {
                break;
            }
            
            // -1 << 사과
            if (field[ny][nx] == -1) {
                field[ny][nx] = 0;
            } else {
                int[] tail = snake.pollLast();
                checkPos[tail[0]][tail[1]] = false;
            }

            snake.addFirst(new int[] {ny, nx});
            checkPos[ny][nx] = true;

            if (!turn.isEmpty() && turn.peek().time == time) {
                Turn t = turn.poll();
                if (t.dir == 'L') {
                    dir = (dir + 3) % 4;
                } else {
                    dir = (dir + 1) % 4;
                }
            }
        }

        bw.write(String.valueOf(time));
        bw.flush();
        bw.close();
        br.close();
    }

    static class Turn {
        int time;
        char dir;

        public Turn(int time, char dir) {
            this.time = time;
            this.dir = dir;
        }
    }
}
