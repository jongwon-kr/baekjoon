package 백준.단계별로풀기.심화1;

import java.io.*;

public class Beakjoon2941 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();
        String[] cWords = new String[]{"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};

        for (String cWord : cWords) {
            str = str.replace(cWord, "!");
        }

        int cnt = str.length();

        bw.write(String.valueOf(cnt));
        bw.flush();
        bw.close();
        br.close();
    }
}
