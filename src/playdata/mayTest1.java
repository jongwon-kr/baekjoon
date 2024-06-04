package playdata;

import java.io.*;
import java.util.HashSet;
import java.util.Set;

public class mayTest1 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        int N = Integer.parseInt(input.split(" ")[0]);  // 자리수
        int M = Integer.parseInt(input.split(" ")[1]);  // 답변 수
        int answer = Integer.parseInt(br.readLine());
        int testNum = 0, sCnt = 0, bCnt = 0;
        String result = "";
        Set<Integer> set = new HashSet<>();
        int temp = answer;
        for (int i = 0; i < N; i++) {
            set.add(temp % 10);
            temp /= 10;
        }

        for (int i = 0; i < M; i++) {
            temp = answer;
            testNum = Integer.parseInt(br.readLine());
            sCnt = 0;
            bCnt = 0;
            for (int j = 0; j < N; j++) {
                if (temp % 10 == testNum % 10) {
                    sCnt++;
                } else {
                    if (set.contains(testNum % 10)) {
                        bCnt++;
                    }
                }

                testNum /= 10;
                temp /= 10;
            }
            if (sCnt == N) {
                result = "WIN";
            }
            System.out.println(sCnt + "S " + bCnt + "B");
        }
        if(result.equals("WIN")){
            System.out.println(result);
        }else{
            result = "LOSE";
            System.out.println(result);
        }
    }
}