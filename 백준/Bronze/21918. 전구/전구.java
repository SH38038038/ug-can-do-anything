import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        int light = Integer.parseInt(st.nextToken());
        int work = Integer.parseInt(st.nextToken());
        
        int[] lightArr = new int[light+1];
        st = new StringTokenizer(br.readLine());
        for (int i=1; i<=light; i++){
            lightArr[i] = Integer.parseInt(st.nextToken());       
        }
        for (int i=1; i<=work; i++){
            st = new StringTokenizer(br.readLine());
            int num = Integer.parseInt(st.nextToken());
            int l = Integer.parseInt(st.nextToken());
            int r = Integer.parseInt(st.nextToken());
            switch(num){
                case 1:
                    lightArr[l] = r;
                    break;
                case 2:
                    for (int j = l; j<=r; j++){
                        lightArr[j] = (lightArr[j]==1) ? 0 : 1;
                    }
                    break;
                case 3:
                    for (int k = l; k<=r; k++){
                        lightArr[k] = 0;
                    }
                    break;
                case 4:
                    for (int t = l; t<=r; t++){
                        lightArr[t] = 1;
                    }
                    break;
            }
        }
        
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= light; i++) {
            sb.append(lightArr[i] + " ");
        }
        System.out.println(sb.toString());
    }
}
     