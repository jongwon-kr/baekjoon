package 백준.코테스터디.시뮬레이션;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Baekjoon31902 {

    public static int N = 0, K = 0, L = 0;
    public static int[][] field;
    public static boolean[][] checkPos;
    public static Queue<Turn> turn = new LinkedList<>();
    public static int[] dx = {-1, 0, 1, 0}; // 회전 방향 x
    public static int[] dy = {0, 1, 0, -1}; // 회전 방향 x

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        N = Integer.parseInt(br.readLine());
        K = Integer.parseInt(br.readLine());

        field = new int[N][N];
        checkPos = new boolean[N][N];
        int x = 0, y = 0;

        // 사과 위치 저장
        for (int i = 0; i < K; i++) {
            st = new StringTokenizer(br.readLine());
            field[Integer.parseInt(st.nextToken()) - 1][Integer.parseInt(st.nextToken()) - 1] = -1;
        }

        // 방향 회전 정보 저장
        L = Integer.parseInt(br.readLine());
        for (int i = 0; i < L; i++) {
            String str = br.readLine();
            turn.add(new Turn(Integer.parseInt(str.split(" ")[0]),str.split(" ")[1].charAt(0)));
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

            // 종료 조건 체크: 벽 또는 자기 몸과의 충돌
            if (nx < 0 || ny < 0 || nx >= N || ny >= N || checkPos[nx][ny]) {
                break;
            }

            // 사과 먹기
            if (field[nx][ny] == -1) {
                field[nx][ny] = 0;
            } else {
                int[] tail = snake.pollLast();
                checkPos[tail[0]][tail[1]] = false;
            }

            // 새로운 머리 위치로 이동
            snake.addFirst(new int[] {nx, ny});
            checkPos[nx][ny] = true;

            // 방향 변경
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

    static class Turn{
        int time;
        char dir;

        public Turn(int time, char dir) {
            this.time = time;
            this.dir = dir;
        }
    }
}
