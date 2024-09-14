package 백준.코테스터디.test8;

import java.io.*;
import java.util.*;

public class Baekjoon23349 {
    static class Enter {
        String place;
        int sTime;
        int eTime;

        public Enter(String place, int sTime, int eTime) {
            this.place = place;
            this.sTime = sTime;
            this.eTime = eTime;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());

        Map<String, Enter> enters = new HashMap<>();

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            String place = st.nextToken();
            int sTime = Integer.parseInt(st.nextToken());
            int eTime = Integer.parseInt(st.nextToken());

            // 중복 제거
            if (!enters.containsKey(name)) {
                enters.put(name, new Enter(place, sTime, eTime));
            }
        }

        Map<String, Integer> countMap = new HashMap<>();
        Map<String, Integer[]> timeMap = new HashMap<>();

        for (Enter ent : enters.values()) {
            for (Enter ent2 : enters.values()) {
                // 입장 객체가 같지 않고 주어진 시간 조건에 맞으면 혼잡 시간 업데이트
                if (!ent.equals(ent2) && (ent.sTime < ent2.eTime && ent2.sTime < ent.eTime)) {
                    System.out.println("ent.place = " + ent.place);
                    int oStart = Math.max(ent.sTime, ent2.sTime);
                    int oEnd = Math.min(ent.eTime, ent2.eTime);
                    String str = ent.place + " " + oStart + " " + oEnd;
                    countMap.put(str, countMap.getOrDefault(str, 0) + 1);
                    timeMap.put(str, new Integer[]{oStart, oEnd});
                }
            }
        }

        // 오름 차순 정렬
        List<Map.Entry<String, Integer>> list = new ArrayList<>(countMap.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> e1, Map.Entry<String, Integer> e2) {
                int countCompare = Integer.compare(e2.getValue(), e1.getValue());
                if (countCompare != 0) {
                    return countCompare;
                }
                return e1.getKey().compareTo(e2.getKey());
            }
        });


        String result = list.get(0).getKey();
        Integer[] resultTime = timeMap.get(result);
        bw.write(result.split(" ")[0] + " " + resultTime[0] + " " + resultTime[1]);

        bw.flush();
        bw.close();
        br.close();
    }
}
