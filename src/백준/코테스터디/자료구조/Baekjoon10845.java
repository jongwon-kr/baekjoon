package 백준.코테스터디.자료구조;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

public class Baekjoon10845 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Queue<Integer> q = new LinkedList<>();

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String inStr = br.readLine();
            if (inStr.startsWith("push")) {
                int value = Integer.parseInt(inStr.split(" ")[1]);
                q.add(value);
            } else {
                switch (inStr) {
                    case "front":
                        if (q.isEmpty()) {
                            bw.write("-1\n");
                        } else {
                            bw.write(q.peek() + "\n");
                        }
                        break;
                    case "back":
                        if (q.isEmpty()) {
                            bw.write("-1\n");
                        } else {
                            int lastValue = -1;
                            for (Integer integer : q) {
                                lastValue = integer;
                            }
                            bw.write(lastValue + "\n");
                        }
                        break;
                    case "size":
                        bw.write(q.size() + "\n");
                        break;
                    case "empty":
                        bw.write((q.isEmpty() ? 1 : 0) + "\n");
                        break;
                    case "pop":
                        if (q.isEmpty()) {
                            bw.write("-1\n");
                        } else {
                            bw.write(q.poll() + "\n");
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
