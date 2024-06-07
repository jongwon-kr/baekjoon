package 백준.단계별로풀기.입출력과사칙연산;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon2588 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int num1 = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int num2 = Integer.parseInt(st.nextToken());
        int sum = 0;
        int mul = 1;
        for (int i = 0; i < 3; i++) {
            mul = 1;
            for (int j = 0; j < i; j++) {
                mul *= 10;
            }
            sum += num1 * ((num2 % 10 )* mul);
            System.out.println(num1 * (num2 % 10 ));
            num2 /= 10;
        }
        System.out.println(sum);
    }
}
