package 백준.코테스터디.자료구조;

import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

public class Baekjoon10828 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String inStr = "";
        Stack<Integer> s = new Stack<>();

        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            inStr = br.readLine();
            if (inStr.contains("push")) {
                s.push(Integer.parseInt(inStr.split(" ")[1]));
            } else {
                switch (inStr) {
                    case "pop":
                        if (s.isEmpty()) {
                            bw.write("-1\n");
                        }else{
                            bw.write(s.pop()+"\n");
                        }
                        break;
                    case "size":
                        bw.write(s.size()+"\n");
                        break;
                    case "empty":
                        if (s.isEmpty()) {
                            bw.write("1\n");
                        }else{
                            bw.write("0\n");
                        }
                        break;
                    case "top":
                        if (s.isEmpty()) {
                            bw.write("-1\n");
                        }else{
                            bw.write(s.peek()+"\n");
                        }
                        break;
                }
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
