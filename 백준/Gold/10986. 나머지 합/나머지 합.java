import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        long sum = 0;
        HashMap<Integer, Long> map = new HashMap<>();
        long answer = 0;

        for (int i = 0; i < n; i++) {
            sum += arr[i];
            int key = (int)(sum % m);
            if (key == 0) answer++;
            answer += map.getOrDefault(key, 0L);
            map.put(key, map.getOrDefault(key, 0L) + 1);
        }

        System.out.println(answer);
    }
}
