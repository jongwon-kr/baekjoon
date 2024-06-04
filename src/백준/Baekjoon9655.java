package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon9655 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        boolean winCheck = true;  // true = SK, false = CY
        String winner = "SK";
        int point;
        while (true) {
            if(n % 2 == 1){
                //홀수
                if(n == 1){
                    point = 1;
                }else{
                    point = 3;
                }
            }else{
                // 짝수
                if (n == 2) {
                    point = 1;
                } else {
                    point = 3;
                }
            }
            n -= point;
            if (n == 0) {
                break;
            }
            if (winCheck) {
                winCheck = false;
                winner = "CY";
            } else if (!winCheck) {
                winCheck = true;
                winner = "SK";
            }
        }
        System.out.println(winner);
    }
}
