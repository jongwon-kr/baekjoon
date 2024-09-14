package 백준.sstudy.week1;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Baekjoon9933 {

    public static int N;
    public static String[] strs;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuffer sb;
        HashMap<String, Integer> map = new HashMap<>();
        String password = "";
        boolean checkPassword = false;
        N = Integer.parseInt(br.readLine());
        strs = new String[N];

        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            sb = new StringBuffer(str);

            if (!map.containsKey(str)) {
                if(!map.containsKey(sb.reverse().toString())){
                    map.put(str, 1);
                }else{
                    map.put(sb.reverse().toString(), map.get(sb.reverse().toString()) + 1);
                }
            }
        }

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            sb = new StringBuffer(entry.getKey());
            if (entry.getValue() == 2) {
                password = entry.getKey();
                checkPassword = true;
            }
            if (entry.getKey().contentEquals(sb.reverse())) {
                password = entry.getKey();
                checkPassword = true;
            }
        }

        if (checkPassword) {
            bw.write(password.length()+ " " + password.charAt(password.length()/2));
        }


        bw.flush();
        bw.close();
        br.close();
    }

}