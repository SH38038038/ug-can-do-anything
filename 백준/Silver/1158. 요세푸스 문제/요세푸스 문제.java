import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        
        Deque<Integer> deque = new ArrayDeque<>();
        for(int i=1; i<N+1; i++){
            deque.offerLast(i);
        }
       
        StringBuilder sb = new StringBuilder();
        sb.append("<");
        
        
        while(!deque.isEmpty()){
            for(int i = 0; i < K - 1; i++) {
                int temp = deque.pollFirst();
                deque.offerLast(temp);
            }
            sb.append(deque.pollFirst());
            if(!deque.isEmpty()){
                sb.append(", ");
            }
        }
        sb.append(">");
        System.out.println(sb.toString());
    }
}