import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

public class Main {
    
    static int N;
    static Queue<String> Q[];
    static Queue<String> T = new LinkedList<String>();
    
    public void InputData() {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        Q = new LinkedList[N];
        for (int i=0; i<N; i++) {
            Q[i] = new LinkedList<String>();
        }
        sc.nextLine();
        for (int i=0; i<N; i++) {
            String str = sc.nextLine();
            String s[] = str.split(" ");
            for (int j=0; j<s.length; j++) {
                Q[i].add(s[j]);
            }
        }
        String tmp = sc.nextLine();
        String t[] = tmp.split(" ");
        for (int i=0; i<t.length; i++) {
            T.add(t[i]);
        }
    }

	public void Solve() {
        while (!T.isEmpty()) {
            String word = T.poll();
            boolean found = false;
            for (int i=0; i<N; i++) {
                //System.out.println(word+" / "+Q[i].peek());
                if (word.equals(Q[i].peek())) {
                    Q[i].poll();
                    found = true;
                }
            }
            if (!found) { // 앵무새 한 사이클에서 찾는 단어가 없는 경우
                System.out.println("Impossible");
                return;
            }
        }
        for (int i=0; i<N; i++) { // (반례) 받아적은 단어가 앵무새 단어보다 적을 경우
            while(!Q[i].isEmpty()) {
                System.out.println("Impossible");
                return;
            }
        }
        System.out.println("Possible");
	}
    
	public static void main(String[] args)
	{
		Main m = new Main();
		m.InputData();
        m.Solve();
	}
}