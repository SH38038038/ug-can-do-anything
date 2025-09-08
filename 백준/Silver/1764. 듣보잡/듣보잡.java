import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        HashMap<String, Integer> map = new HashMap<>();

        // 첫 번째 집합 n개
        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            map.put(s, 1);
        }

        // 두 번째 집합 m개
        for (int i = 0; i < m; i++) {
            String s = br.readLine();
            map.put(s, map.getOrDefault(s, 0) + 1); // 존재하면 +1, 없으면 1
        }

        // value가 2 이상인 key 출력
        List<String> result = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() >= 2) {
                result.add(entry.getKey());
            }
        }

        Collections.sort(result); // 사전 순 출력
        System.out.println(result.size()); // 개수 출력
        for (String s : result) {
            System.out.println(s); // key 출력
        }
    }
}
