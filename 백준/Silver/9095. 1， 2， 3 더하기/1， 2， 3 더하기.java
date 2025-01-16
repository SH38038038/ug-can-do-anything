import java.io.*;
import java.util.*;
public class Main {

    static Integer[] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        dp = new Integer[12];
        dp[1]=1;
        dp[2]=2;
        dp[3]=4;
        for(int i=0; i<n; i++){
            int k = Integer.parseInt(br.readLine());
            for(int j=4; j<=k; j++){
                dp[j]=dp[j-1]+dp[j-2]+dp[j-3];
            }
            System.out.println(dp[k]);
        } 
    }
}