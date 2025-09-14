import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        Deque<Integer> stack = new ArrayDeque<>();
        
        for(int i=0; i<N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String command = st.nextToken();
            
            switch(command){
                case "push":
                    int x = Integer.parseInt(st.nextToken());
                    stack.push(x);
                    break;
                case "pop":
                    if(stack.isEmpty()){
                        System.out.println(-1);
                        break;
                    } else {
                        System.out.println(stack.pop());
                        break;
                    }
                case "top":
                    if(stack.isEmpty()){
                        System.out.println(-1);
                        break;
                    } else {
                        System.out.println(stack.peek());
                        break;
                    }
                case "empty":
                    System.out.println(stack.isEmpty() ? 1 : 0);
                    break;
                case "size":
                    System.out.println(stack.size());
                    break;
               
                default:
                    break;
            }
        }
    }
}