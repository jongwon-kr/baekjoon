package 백준.코테스터디.자료구조;

import java.io.*;
import java.util.LinkedList;
import java.util.ListIterator;

public class Baekjoon1406 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        LinkedList<Character> list = new LinkedList<>();
        String str = br.readLine();
        int n = Integer.parseInt(br.readLine());    // 연산 횟수

        for (int i = str.length() - 1; i >= 0; i--) {
            list.push(str.charAt(i));
        }

        ListIterator<Character> iter = list.listIterator(list.size());

        for (int i = 0; i < n; i++) {
            String eSen = br.readLine();
            edit(iter, eSen);
        }

        for (Character c : list) {
            bw.write(c);
        }
        bw.flush();
        bw.close();
        br.close();
    }

    public static void edit(ListIterator<Character> iter, String eSen) {
        if (eSen.startsWith("P ")) {
            // eSen.split(" ")[1]을 커서의 왼쪽에 추가
            iter.add(eSen.charAt(2));
        } else {
            switch (eSen) {
                case "L":
                    if (iter.hasPrevious()) {
                        iter.previous();
                    }
                    break;
                case "D":
                    if (iter.hasNext()) {
                        iter.next();
                    }
                    break;
                case "B":
                    if (iter.hasPrevious()) {
                        iter.previous();
                        iter.remove();
                    }
                    break;
            }
        }
    }
}