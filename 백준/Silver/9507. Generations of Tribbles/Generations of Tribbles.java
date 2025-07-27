import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        
        long[] dp = new long[68];
        
        dp[0]=1;
        dp[1]=1;
        dp[2]=2;
        dp[3]=4;
        
        for(int i=4; i<=67; i++){
            dp[i] = dp[i-1]+dp[i-2]+dp[i-3]+dp[i-4];
        }
        StringBuilder sb = new StringBuilder();
        
        for(int i=0; i<N; i++){
            int n = Integer.parseInt(br.readLine());
            sb.append(dp[n]+"\n");
        }
        System.out.print(sb);
    }
}