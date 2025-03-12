import java.io.*;
import java.util.*;

public class Main{    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String t1=br.readLine();
        String t2=br.readLine();
        int[] tel = new int[16];
        
        for(int i=0; i<8; i++){
            tel[i*2] = t1.charAt(i) - '0';
            tel[i*2+1] = t2.charAt(i) - '0';
        }
        for(int i=15; i>1; i--){
            for(int j=0; j<i; j++){
                tel[j]=(tel[j]+tel[j+1])%10;
            }
        }
        System.out.printf("%d%d\n",tel[0],tel[1]);
    }
}