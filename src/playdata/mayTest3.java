package playdata;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class mayTest3 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        ArrayList<Integer> arr = new ArrayList<>();
        int right = 0, left = 0;
        int num = 0;
        for (int i = 0; i < n; i++) {
            num = Integer.parseInt(st.nextToken());
            if (num % 2 == 1) {
                // 홀수
                arr.add(arr.size() - right, num);
                right++;
            } else {
                // 짝수
                arr.add(left, num);
                left++;
            }
        }
        for (Integer i : arr) {
            System.out.print(i + " ");
        }
    }
}
