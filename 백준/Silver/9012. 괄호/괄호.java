import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        
        for(int i=0; i<N; i++){
            String str = br.readLine();
            Stack<Character> stack = new Stack<>();
            boolean isValid = true;
            
            for(int j=0; j<str.length(); j++){
                char now = str.charAt(j);
                if (now == '(') {
                    stack.push(now);
                } else { 
                    if (stack.isEmpty()) { 
                        isValid = false;
                        break;
                    }
                    stack.pop();
                }
            }
            if(stack.isEmpty() && isValid){
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}