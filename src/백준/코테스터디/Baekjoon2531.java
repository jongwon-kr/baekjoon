package 백준.코테스터디;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Baekjoon2531 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] options = new int[4];

        for (int i = 0; i < 4; i++) {
            options[i] = Integer.parseInt(st.nextToken());
        }

        /*
            접시의 수 : N
            초밥의 가짓수 : d
            연속 먹는 접시 수 : k
            쿠폰번호 : c
        */
        int n = options[0], d = options[1], k = options[2], c = options[3], dCheck = 0, cnt = 0, max = 0;
        ArrayList<Integer> dArr = new ArrayList<>();
        ArrayList<Integer> dSet = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            dArr.add(Integer.parseInt(st.nextToken()));
        }
        // 쿠폰 고려 O
        for (int i = 0; i < n; i++) {
            dSet.add(dArr.get(i));
            cnt = 1;
            int ck = i + 1;
            while (true) {
                if (ck == n) {
                    ck = 0;
                }
                if (cnt != k){
                    dCheck = dArr.get(ck++);
                }else{
                    dCheck = c;
                }
                if (dSet.contains(dCheck)) {
                    if (max < cnt)
                        max = cnt;
                    break;
                } else {
                    cnt++;
                    dSet.add(dCheck);
                }
            }
            dSet.clear();
        }
        // 쿠폰 고려 X
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            set.add(dArr.get(i));
        }
        System.out.println("set.size() = " + set.size());
        if(max == k + 1){
            System.out.println(max);
        }
        System.out.println(max);

    }
}
