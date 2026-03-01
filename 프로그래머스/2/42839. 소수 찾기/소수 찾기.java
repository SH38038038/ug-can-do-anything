import java.util.*;

class Solution {

    static Set<Integer> set;
    static boolean[] visited;

    public int solution(String numbers) {
        int answer = 0;

        set = new HashSet<>();
        visited = new boolean[numbers.length()];

        dfs(numbers, "");

        for (Integer num : set) {
            if (isPrime(num)) {
                answer++;
            }
        }
        return answer;
    }

    public static void dfs(String numbers, String s) {
        if (!s.equals("")) {
            set.add(Integer.parseInt(s));
        }

        for (int i = 0; i < numbers.length(); i++) {
            if (!visited[i]) {
                visited[i] = true;
                dfs(numbers, s + numbers.charAt(i));
                visited[i] = false;
            }
        }
    }

    public static boolean isPrime(int n) {
        if (n < 2) return false;

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}