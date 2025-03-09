import java.io.*;
import java.util.*;

public class Main {
    static int N;
    static int[] seq;
    static int[] up;
    static int[] down;
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        N = Integer.parseInt(br.readLine());
        
        up = new int[N];
        down = new int[N];
        seq = new int[N];
        
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        
        for(int i=0; i<N; i++){
            seq[i] = Integer.parseInt(st.nextToken());
        }
        
        Up();
        Down();
        
        int max = 0;
        for(int i=0; i<N; i++){
            if(max<up[i]+down[i]){
                max = up[i]+down[i];
            }
        }
        System.out.println(max-1);
        
    }
    
    static void Up() {
        for(int i=0; i<N; i++){
            up[i] = 1;
            
            for(int j = 0; j<i; j++){  //i가 j보다 앞
                if(seq[j]<seq[i] && up[i]<up[j]+1){
                    up[i]=up[j]+1;
                }
            }
        }
    }
    
    static void Down() {
        for(int i=N-1; i>=0; i--){ //역 오름차순
            down[i]=1;
            
            for(int j = N-1; j>i; j--){ 
                if(seq[j]<seq[i] && down[i]<down[j]+1){ //j가 i보다 앞
                     down[i] = down[j] +1;   
                }
            }
        }
    }
}