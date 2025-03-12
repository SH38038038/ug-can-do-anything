import java.io.*;
import java.util.*;

public class Main{
    
    static int CodeCnt1, CodeCnt2;
    static int[] f;
    
    public static void main(String[] args) throws IOException{
        CodeCnt1=0;
        CodeCnt2=0;
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n =  Integer.parseInt(br.readLine());
        f = new int[n]; 
        fibo1(n);
        fibo2(n);
        System.out.println(CodeCnt1+" "+CodeCnt2);
    }
    
    static int fibo1(int n){
        if(n==1 || n==2){
            CodeCnt1++;
            return 1;
        }
        else return(fibo1(n-1)+fibo1(n-2));  
    }
    static int fibo2(int n){
        f[0]=1;
        f[1]=1;
        for(int i = 2; i < n; i++){
            CodeCnt2++;
            f[i] = f[i-1] + f[i-2];
        }
        return f[n-1]; 
    }
}