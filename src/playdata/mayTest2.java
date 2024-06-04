package playdata;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class mayTest2 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int cnt = 0, result = 0;
        for (int i = 0; i < n; i++) {
            String testNum = br.readLine();
            testNum = testNum.split("\\.")[1];
            cnt = 0;
            for (int j = 0; j < testNum.length(); j++) {
                if (testNum.charAt(i) != '0') {
                    cnt++;
                    break;
                }
            }
            if(cnt==0){
                result++;
            }
        }
        System.out.println(result);
    }
}
