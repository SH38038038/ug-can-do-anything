import java.io.*;
import java.util.*;

public class Main{
    static Queue<Point> direction = new LinkedList<>();
    static Deque<Point> snakeDeque = new ArrayDeque<>();
    
    static int snakeDir = 3; // 뱀의 초기 방향
    static int[][] map;
    static int[] dx = {-1,0,1,0};
    static int[] dy = {0,-1,0,1};
    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        int N = Integer.parseInt(br.readLine()); // 보드 크기
        int K = Integer.parseInt(br.readLine()); // 사과 개수
        
        map = new int[N][N];
        map[0][0] = -1; // 뱀이 있는 곳
        snakeDeque.offer(new Point(0,0));
        
        for(int i=0; i<K; i++){
            st = new StringTokenizer(br.readLine());
            
            int a = Integer.parseInt(st.nextToken())-1;
            int b = Integer.parseInt(st.nextToken())-1;
            
            map[a][b] = 1; // 사과가 있는 곳
        }
        
        int L = Integer.parseInt(br.readLine());
        for(int i=0; i<L; i++){
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            String s = st.nextToken();
            int c;
            if(s.equals("L")) // L이면 왼쪽 D면 오른쪽으로 
                c=0;
            else
                c=1;
            direction.add(new Point(x,c));
            
        }
        
        int time = 0;
        
        int X = direction.peek().x;
        int C = direction.poll().y;
        
        while(true){
            time++;
            
            int nx = snakeDeque.peekFirst().x + dx[snakeDir];
            int ny = snakeDeque.peekFirst().y + dy[snakeDir];
            
            // 벽 또는 자기자신의 몸과 부딪힌 경우 
			if(nx < 0 || nx >= N || ny < 0 || ny >= N || map[nx][ny] == -1) {
                break;
            }
            
            if(map[nx][ny]==1){
                map[nx][ny]=-1;
                snakeDeque.offerFirst(new Point(nx,ny));
            } else {
                map[nx][ny]=-1;
                snakeDeque.offerFirst(new Point(nx,ny));
                map[snakeDeque.peekLast().x][snakeDeque.pollLast().y] = 0;
            }
            if(time == X){
                if(C == 0){
                    snakeDir = (snakeDir+1)%4;
                }else{
                    snakeDir = (snakeDir+3)%4;
                }
                if(!direction.isEmpty()){
                    X=direction.peek().x;
                    C=direction.poll().y;
                }
            }
        }
        System.out.println(time);
        br.close();
    }
}
class Point {
	int x;
	int y;

	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
}
