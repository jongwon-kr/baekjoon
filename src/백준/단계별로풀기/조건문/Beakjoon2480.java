package 백준.단계별로풀기.조건문;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.StringTokenizer;

public class Beakjoon2480 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int firDice = Integer.parseInt(st.nextToken());
        int secDice = Integer.parseInt(st.nextToken());
        int tirDice = Integer.parseInt(st.nextToken());
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(firDice);
        arr.add(secDice);
        arr.add(tirDice);

        int money = 0;

        if (firDice == secDice && secDice == tirDice && firDice == tirDice) {
            money = (firDice * 1000) + 10000;
        } else if (firDice == secDice) {
            money = (firDice * 100) + 1000;
        }else if (firDice == tirDice) {
            money = (firDice * 100) + 1000;
        }else if (tirDice == secDice) {
            money = (tirDice * 100) + 1000;
        }else{
            money = Collections.max(arr) * 100;
        }
        System.out.println(money);
    }
}
