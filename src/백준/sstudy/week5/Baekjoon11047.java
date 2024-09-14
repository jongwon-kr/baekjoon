package 백준.sstudy.week5;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Baekjoon11047 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = br.readLine();

        int N = Integer.parseInt(str.split(" ")[0]);
        int K = Integer.parseInt(str.split(" ")[1]);
        int cntCoin = 0;
        ArrayList<Integer> coins = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            coins.add(Integer.parseInt(br.readLine()));
        }

        Collections.reverse(coins);

        for (Integer coin : coins) {
            while (true) {
                if (K >= coin) {
                    if((K - coin) >= 0){
                        K -= coin;
                        cntCoin++;
                    }
                }else{
                    break;
                }
            }
            if(K==0){
                break;
            }
        }
        bw.write(cntCoin + "\n");
        bw.flush();
        bw.close();
        br.close();
    }

}
