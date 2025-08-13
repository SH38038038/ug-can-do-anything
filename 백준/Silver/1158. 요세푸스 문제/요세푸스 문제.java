import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        
        LinkedList<Integer> deque = new LinkedList<>();
        for(int i = 1; i <= N; i++) {
            deque.offer(i);
        }
        
        StringBuilder sb = new StringBuilder();
        sb.append("<");
        
        while(!deque.isEmpty()) {
            // K-1번 회전 : 맨 앞 원소를 뒤로 보냄
            for(int i = 0; i < K - 1; i++) {
                int temp = deque.pollFirst();
                deque.offerLast(temp);
            }
            // K번째 원소 제거 및 출력
            sb.append(deque.pollFirst());
            if(!deque.isEmpty()) {
                sb.append(", ");
            }
        }
        
        sb.append(">");
        System.out.println(sb.toString());
    }
}
