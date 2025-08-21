import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[10];
        int max = 0;
        int max_idx = 0;
        for(int i=1; i<=9; i++){
            int n = Integer.parseInt(br.readLine());
            arr[i] = n;
            if(max<n){
                max = n;
                max_idx = i;
            }
        }
        System.out.println(max);
        System.out.println(max_idx);
        
    }
}