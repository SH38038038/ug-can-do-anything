import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] dp = new int[N+1];
        
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        for(int i=0; i<N; i++){
            dp[i] = Integer.parseInt(st.nextToken());
        }
        int count = 1;
        int maxcount = 1;
        for(int i=1; i<N; i++){
            if (dp[i-1]<=dp[i]){
                count++;
                maxcount = Math.max(maxcount,count);
            }else{
                count=1;
            }
        }
        count=1;
        for(int i=1; i<N; i++){
            if (dp[i-1]>=dp[i]){
                count++;
                maxcount = Math.max(maxcount,count);
            }else{
                count=1;
            }
        }
        System.out.println(maxcount);
        br.close();
    }
}