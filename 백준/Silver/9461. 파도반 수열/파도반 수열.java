import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        int[] seq = new int[N];
        
        int max = 0;
        for(int i=0; i<N; i++){
            seq[i] = Integer.parseInt(br.readLine());
            if(max<seq[i]){
                max=seq[i];
            }
        }
        long[] dp = new long[max+1];
        dp[0]=0L;
        for(int i=1; i<=max; i++){
            if(i<4){
                dp[i]=1L;
            }else{
                dp[i]=dp[i-3]+dp[i-2];
            }
        }
        for(int i=0; i<N; i++){
            System.out.println(dp[seq[i]]);
        }
    }
}