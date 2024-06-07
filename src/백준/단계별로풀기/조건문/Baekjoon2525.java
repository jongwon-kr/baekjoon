package 백준.단계별로풀기.조건문;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon2525 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int h = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int addM = Integer.parseInt(st.nextToken());
        m += addM;
        if((m+addM)>=60){
            h += m/60;
            m %= 60;
        }

        if (h >= 24) {
            h -= 24;
        }

        System.out.println(h + " " + m);
    }
}
