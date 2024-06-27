package 백준.코테스터디.dynamicPrograming;

import java.io.*;

public class Baekjoon9251 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str1 = br.readLine();
        String str2 = br.readLine();

        bw.write(String.valueOf(lcs(str1, str2)));
        bw.flush();
        bw.close();
        br.close();
    }

    static int lcs(String str1, String str2) {
        int str1Len = str1.length();
        int str2Len = str2.length();
        int[][] lcsArr = new int[str1Len + 1][str2Len + 1];

        for (int i = 1; i <= str1Len; i++) {
            for (int j = 1; j <= str2Len; j++) {
                if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
                    lcsArr[i][j] = lcsArr[i - 1][j - 1] + 1;
                } else {
                    lcsArr[i][j] = Math.max(lcsArr[i - 1][j], lcsArr[i][j - 1]);
                }
            }
        }
        return lcsArr[str1Len][str2Len];
    }
}
