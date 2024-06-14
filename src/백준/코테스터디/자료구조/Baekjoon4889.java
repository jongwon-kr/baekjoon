package 백준.코테스터디.자료구조;

import java.io.*;
import java.util.Stack;

public class Baekjoon4889 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String inputStr = "";
        Stack<Character> s = new Stack<>();
        int step = 1;
        int cnt = 0;
        int oCnt = 0;
        int cCnt = 0;

        while (!(inputStr = br.readLine()).contains("-")) {
            oCnt = 0;
            cCnt = 0;

            for (int i = 0; i < inputStr.length(); i++) {
                char c = inputStr.charAt(i);
                if (c == '{') {
                    s.push(c);
                } else {
                    if (!s.isEmpty() && s.peek() == '{') {
                        s.pop();
                    } else {
                        s.push(c);
                    }
                }
            }

            while (true) {
                if (s.isEmpty()) {
                    break;
                } else if (s.peek() == '{') {
                    oCnt++;
                    s.pop();
                } else {
                    cCnt++;
                    s.pop();
                }

            }

            cnt = (oCnt + 1) / 2 + (cCnt + 1) / 2;

            bw.write(step + ". " + cnt + "\n");
            step++;
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
