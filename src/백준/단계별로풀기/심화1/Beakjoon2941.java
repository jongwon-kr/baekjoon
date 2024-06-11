package 백준.단계별로풀기.심화1;

import java.io.*;

public class Beakjoon2941 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();
        String[] cWords = new String[]{"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
        int cnt = 0;

        for (int i = 0; i < 101; i++) {
            for (int j = 0; j < cWords.length; j++) {
                if (str.contains(cWords[j])) {
                    cnt++;
                    str = str.replaceFirst(cWords[j], "!");
                }
            }
        }
        for (int i = 0; i < str.length(); i++) {
            if (!(str.charAt(i) == '!')) {
                cnt++;
            }
        }

        bw.write(String.valueOf(cnt));
        bw.flush();
        bw.close();
        br.close();
    }
}