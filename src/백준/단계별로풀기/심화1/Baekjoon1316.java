package 백준.단계별로풀기.심화1;

import java.io.*;
import java.util.HashSet;
import java.util.Set;

public class Baekjoon1316 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int cnt = 0;

        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            if (isGroupWord(str)) {
                cnt++;
            }
        }

        bw.write(cnt + "\n");
        bw.flush();
        bw.close();
        br.close();
    }

    public static boolean isGroupWord(String str) {
        Set<Character> set = new HashSet<>();
        char prevChar = '\0';

        for (int j = 0; j < str.length(); j++) {
            char tempChar = str.charAt(j);
            if (tempChar != prevChar) {
                if (set.contains(tempChar)) {
                    return false;
                }
                set.add(tempChar);
                prevChar = tempChar;
            }
        }

        return true;
    }
}
