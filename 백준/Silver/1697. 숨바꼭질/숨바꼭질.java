import java.io.*;
import java.util.*;

public class Main{
    static int N, K;
    static int[] dist;
    static boolean[] visited;
    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        
        dist = new int[100001];
        visited = new boolean[100001];
        System.out.println(bfs());
    }
    
    static int bfs(){
        ArrayDeque<Integer> q = new ArrayDeque<>();
        q.add(N);
        visited[N]=true;
        dist[N]=0;
        
        while(!q.isEmpty()){
            int x = q.poll();
            if(x==K) return dist[x];
             int[] next = {x - 1, x + 1, x * 2};            for(int nx : next){
                if(nx >= 0 && nx<=100000 && !visited[nx]){
                    visited[nx]=true;
                    dist[nx] = dist[x]+1;
                    q.add(nx);    
                }     
            }
        }
        return -1;
    }
}