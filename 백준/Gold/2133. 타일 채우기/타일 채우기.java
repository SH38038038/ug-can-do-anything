import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        int[] dp = new int[N+1];
        
        if (N < 2) {
            System.out.println(N == 0 ? 1 : 0);
            return;
        }
        
        dp[0]=1;
        dp[2]=3;
        
        if (N % 2 != 0) {
            System.out.println(0);
            return;
        }
        
        for(int i=4; i<=N; i+=2){
            dp[i]=dp[i-2]*dp[2];
            for(int j=i-4;j>=0;j-=2){
                dp[i]= dp[i]+dp[j]*2;
            }
        }
        System.out.println(dp[N]);
    }
}