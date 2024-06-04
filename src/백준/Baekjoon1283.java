package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Baekjoon1283 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Set<Character> keySet = new HashSet<Character>();
        String str;

        for (int i = 0; i < n; i++) {
            boolean search = true;
            int index = 0;
            str = br.readLine();
            if (str.contains(" ")) {
                // 단어가 2개 이상
                String[] strs = str.split(" ");
                for (String s : strs) {
                    // 공백단위로 각 단어의 첫 글자 확인
                    if (!keySet.contains(s.toLowerCase().charAt(0)) && search && s.charAt(0) != ' ') {
                        keySet.add(s.toLowerCase().charAt(0));
                        str = str.replaceFirst(s, s.replaceFirst(String.valueOf(s.charAt(0)), "[" + String.valueOf(s.charAt(0)) + "]"));
                        search = false;
                    }
                }
            } else {
                // 단일 단어
                while (search) {
                    // 모든 첫글자가 해당되면 왼쪽 부터 오른쪽으로 확인
                    if (!keySet.contains(str.toLowerCase().charAt(index++)) && str.charAt(0) != ' ') {
                        keySet.add(str.toLowerCase().charAt(index - 1));
                        str = str.replaceFirst(String.valueOf(str.charAt(index - 1)), "[" + String.valueOf(str.charAt(index - 1)) + "]");
                        search = false;
                        break;
                    }
                    if (index == str.length()) {
                        search = false;
                        break;
                    }
                }
            }
            System.out.println(str);
        }
        br.close();
    }
}
