package 백준;

import java.io.*;
import java.util.StringTokenizer;

public class Baekjoon11723 {
    /*
        add x: S에 x를 추가한다. (1 ≤ x ≤ 20) S에 x가 이미 있는 경우에는 연산을 무시한다.
        remove x: S에서 x를 제거한다. (1 ≤ x ≤ 20) S에 x가 없는 경우에는 연산을 무시한다.
        check x: S에 x가 있으면 1을, 없으면 0을 출력한다. (1 ≤ x ≤ 20)
        toggle x: S에 x가 있으면 x를 제거하고, 없으면 x를 추가한다. (1 ≤ x ≤ 20)
        all: S를 {1, 2, ..., 20} 으로 바꾼다.
        empty: S를 공집합으로 바꾼다.
     */
    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken()), v = 0;
        int bitMask = 0;
        System.out.println();
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            String op = st.nextToken();
            if (op.equals("all")) {
            } else if (op.equals(("empty"))) {
            } else {
                v = Integer.parseInt(st.nextToken());
            }

            switch (op) {
                case "all":
                    bitMask = ~0;  // 1~20의 모든 비트를 1로 켜준다,
                    break;
                case "empty":
                    bitMask = 0;  // 1~20의 모든 비트를 0으로 끈다,
                    break;
                case "add":   // ex. add 1, add 2, add 3 의 결과는 -> 111
                    bitMask = bitMask | 1 << (v - 1); // 1 << (x-1): x-1번 비트만 1, 나머지 비트는 0으로 만들고 | 연산으로 나머지는 원래 상태를 유지한 채 x-1번 비트를 1로 바꿔준다,
                    break;
                case "remove":
                    bitMask = bitMask & ~(1 << (v - 1)); // 1 << (x-1): 추가 시와 동일하기 x-1번 비트를 1로 만들어주고, & 연산을 진행하여 x-1번만 0으로 바뀌고 나머지는 유지되도록 한다.
                    break;
                case "check":
                    sb.append(((bitMask & 1 << (v - 1)) == 1 << (v - 1) ? 1 : 0)).append("\n");
                    break;
                case "toggle":
                    bitMask = bitMask ^ 1 << (v - 1);  // ^ 연산을 통해 x-1번 자리의 비트를 1->0. 0->1로 바꿔준다.
                    break;
            }
        }
        bw.write(sb.toString());
        bw.close();
        br.close();
    }
}
