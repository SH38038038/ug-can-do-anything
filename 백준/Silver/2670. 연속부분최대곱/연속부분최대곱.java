import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        double[] seq = new double[N+1];
        double[] dp = new double[N+1];
        double max = 0;
        for(int i=1; i<=N; i++){
            seq[i] = Double.parseDouble(br.readLine());
            dp[i] = Math.max(seq[i], dp[i-1]*seq[i]);
            max = Math.max(max,dp[i]);
        }
        System.out.print(String.format("%.3f",max));
    }
}