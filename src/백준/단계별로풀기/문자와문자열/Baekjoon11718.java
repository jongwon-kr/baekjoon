package 백준.단계별로풀기.문자와문자열;

import java.io.*;

public class Baekjoon11718 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str;
        while ((str = br.readLine()) != null) {
            if(str.equals(""))
                break;
            bw.write(str + "\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
