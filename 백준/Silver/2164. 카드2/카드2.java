import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        LinkedList<Integer> deque = new LinkedList<Integer>();
        int N = Integer.parseInt(br.readLine());
        for (int i = 1; i <= N; i++) {
            deque.offerLast(i); 
        }

        while (deque.size() > 1) {
            deque.pollFirst();              // 제일 위 카드 버림
            int x = deque.pollFirst();      // 그 다음 카드 꺼내서
            deque.offerLast(x);             // 뒤로 보냄
        }
        System.out.println(deque.pop());
    }
}