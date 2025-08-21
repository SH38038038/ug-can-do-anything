import java.io.*;
import java.util.*;
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String str = br.readLine();
        String[] strNum = str.split(" ");
        int[] intNum = new int[n];
        for(int i=0; i<n;i++){
            intNum[i]=Integer.parseInt(strNum[i]);
        }
        int min = 1000000;
        int max = -1000000;
        for(int i=0; i<n;i++){
            if (intNum[i]<min){
                min=intNum[i];
            }
            if (intNum[i]>max){
                max=intNum[i];
            }
        }
        System.out.println(min+" "+max);
        br.close();
    }
}