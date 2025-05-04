import java.io.*;
import java.util.*;

public class Main {
    
    static int[][] dp = new int[30][30];
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        
        StringTokenizer st;
        
        StringBuilder sb = new StringBuilder();
        
        for(int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine(), " ");
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            
            sb.append(comb(m,n)).append("\n");
        }
        System.out.println(sb);
    }
    
    static int comb(int n, int r){
        if(dp[n][r]>0){
            return dp[n][r];
        }
        if(n==r || r==0){
            return dp[n][r]=1;
        }
        return dp[n][r] = comb(n-1,r-1)+comb(n-1,r);
    }
}