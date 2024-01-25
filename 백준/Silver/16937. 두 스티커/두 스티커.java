import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
 
public class Main {
	
	public static int H, W;
	public static int N;
	public static ArrayList<Node> Node = new ArrayList<Node>();
	public static boolean[] visited;
	public static Node[] SelectedSticker = new Node[2]; //2개의 선택된 스티커 사용
	public static int result = 0;
	
    public static void main(String[] args) throws IOException{
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	H = Integer.parseInt(st.nextToken()); 
    	W = Integer.parseInt(st.nextToken());
    	
    	
    	st = new StringTokenizer(br.readLine());
    	N = Integer.parseInt(st.nextToken());
    	visited = new boolean[N];
    	
    	for(int i=0;i<N;i++) {
    		st = new StringTokenizer(br.readLine());
        	int R = Integer.parseInt(st.nextToken());
        	int C = Integer.parseInt(st.nextToken());
        	Node.add(new Node(R, C, i));
        	if( R != C) {	//90도 회전까지 넣습니다.
        		Node.add(new Node(C, R, i));
        	}
    	}
    	
    	simulate(0, 0);
    	
    	System.out.println(result);
    }
    
    public static void simulate(int idx, int level) {
    	if(level == 2) {
    		//가로로 배치할때 ( 세로길이는 Sticker중 가장 긴것만 고려합니다. )
    		if(SelectedSticker[0].c + SelectedSticker[1].c <= W && Math.max(SelectedSticker[0].r, SelectedSticker[1].r) <= H) {
    			result = Math.max(result,  SelectedSticker[0].r * SelectedSticker[0].c + SelectedSticker[1].r * SelectedSticker[1].c);
    		}
    		//세로로 배치할때 ( 가로길이는 Sticker중 가장 긴것만 고려합니다. )
    		if(SelectedSticker[0].r + SelectedSticker[1].r <= H && Math.max(SelectedSticker[0].c, SelectedSticker[1].c) <= W)  {
    			result = Math.max(result,  SelectedSticker[0].r * SelectedSticker[0].c + SelectedSticker[1].r * SelectedSticker[1].c);
    		}
    		
    		return ;
    	}
    	
    	
    	for(int i=idx;i<Node.size();i++) {
    		Node temp = Node.get(i);
    		int R = temp.r;
    		int W = temp.c;
    		int TEMPSTICKERINDEX = temp.stickerIndex;  
    		if(visited[TEMPSTICKERINDEX] == true) continue; //중복된 스티커가 사용되지 않도록 처리합니다.
    		visited[TEMPSTICKERINDEX] = true;
    		SelectedSticker[level] = temp;  //Sticker의 순서에 맞춰 넣습니다.
    		simulate(i + 1,level + 1);
    		SelectedSticker[level] = null; //Sticker를 사용햇다면 제거합니다.
    		visited[TEMPSTICKERINDEX] = false;
    	}
    	
    }
}
 
class Node{
	int r;
	int c;
	int stickerIndex;
	public Node(int r, int c, int stickerIndex) {
		this.r = r;
		this.c = c;
		this.stickerIndex = stickerIndex;
	}
}