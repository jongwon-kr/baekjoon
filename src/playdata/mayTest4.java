package playdata;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class mayTest4 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int temp = 3;
        int sum = 0;

        while (true) {
            sum += temp;
            temp = temp + 4;
            if(num<sum){
                break;
            }
        }
        System.out.println(((sum - num)/2));
    }
}
