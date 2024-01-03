import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    
    private static int r,c;
    private static char[][] graph;

    private static int[] dx = {0,0,1,-1};
    private static int[] dy = {1,-1,0,0};
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        r = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());
        graph = new char[r][c];
        boolean flag = true;

        for(int i=0;i<r;i++) {
            String str = br.readLine();
            for(int j=0;j<c;j++) {
                graph[i][j] = str.charAt(j);
            }
        }
        //늑대 주위에 울타리
        //늑대 옆에 양 바로 있으면 무조건 0 출력
        for(int i=0;i<r;i++) {
            for(int j=0;j<c;j++) {
                if(graph[i][j] == 'W') {
                    for(int xy = 0 ; xy<4; xy++) {
                        int nx = i+dx[xy];
                        int ny = j+dy[xy];
                        //목장 안에 있을때
                        if(nx >=0 && nx< r && ny >=0 && ny<c) {
                            if(graph[nx][ny]=='.') {
                                graph[nx][ny]='D';
                            }else if(graph[nx][ny]=='S') {
                                flag = false;
                                System.out.println(0);
                                return;
                            }
                        }
                    }
                }
            }
        }
        if(!flag) {
            System.out.println(0);
        }else {
            StringBuilder sb = new StringBuilder();
            System.out.println(1);
            for(int i=0;i<r;i++) { 
                sb.append(graph[i]);
                sb.append("\n");
            }
            System.out.println(sb);
        }
    }
}