package 백준.단계별로풀기.반복문;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon10952 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int sum = 0;
        while(st.hasMoreTokens()){
            sum = 0;
            for (int j = 0; j < 2; j++) {
                sum += Integer.parseInt(st.nextToken());
            }
            if(sum == 0)
                break;
            System.out.println(sum);
            st = new StringTokenizer(br.readLine());
        }
    }
}
