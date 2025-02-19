import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()); 
        int[] cow = new int[n + 1];
        for (int i=0; i<=n; i++){
            cow[i] = -1;
        }
        int count=0;
        for(int i=1; i<=n; i++){
            String input = br.readLine();
            StringTokenizer st = new StringTokenizer(input);
            int cowNum = Integer.parseInt(st.nextToken());
            int roadNum = Integer.parseInt(st.nextToken());
            if (cow[cowNum]== -1){
                cow[cowNum]=roadNum;
            } else {
                if(cow[cowNum] != roadNum){
                    count++;
                    cow[cowNum]=roadNum;
                }
            }
        }
        System.out.println(count);
    }
}
