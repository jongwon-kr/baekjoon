package 백준.코테스터디.재귀;

import java.io.*;

public class Baekjoon16505 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());

        int size = (int) Math.pow(2, n); // 출력 사이즈 2의 n승
        char[][] field = new char[size][size];

        // 배열 공백으로 초기화
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                field[i][j] = ' ';
            }
        }

        triangle(field, 0, 0, n);

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size - i; j++) {
                bw.write(field[i][j]);
            }
            bw.write('\n');
        }

        bw.flush();
        bw.close();
        br.close();
    }

    public static void triangle(char[][] field, int x, int y, int n) {
        if (n == 0) {
            field[x][y] = '*';
        } else {
            int size = (int) Math.pow(2, n - 1);
            triangle(field, x, y, n - 1);
            triangle(field, x + size, y, n - 1);
            triangle(field, x, y + size, n - 1);
        }
    }
}
