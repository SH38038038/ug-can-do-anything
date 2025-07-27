import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        
        for(int i=0; i<N; i++){
            int T = Integer.parseInt(br.readLine());
            int[] seq = new int[T];
            
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            for(int j = 0; j<T; j++){
                seq[j] = Integer.parseInt(st.nextToken());
            }
            
            int maxSum = seq[0];
            int currentSum = seq[0];
            
            for(int j = 1; j<T; j++){
                currentSum = Math.max(seq[j], currentSum + seq[j]);
                maxSum = Math.max(maxSum, currentSum);
            }
            
            sb.append(maxSum+"\n");        
        }
        System.out.print(sb);
    }
}