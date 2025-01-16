import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {

    static Long dp[][];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        dp = new Long[N + 1][2]; 
        
        dp[1][0]=dp[1][1]=1L;
        System.out.println(culc(N,1));
    }

    static Long culc(int digit, int val){
        if(digit==1){
            return dp[digit][val];
        }
        if(dp[digit][val]==null){
            if(val==1){
                dp[digit][val]=culc(digit-1,0);
            }else{
                dp[digit][val]=culc(digit-1,0)+culc(digit-1,1);
            }
        }
        return dp[digit][val];
    }
}
