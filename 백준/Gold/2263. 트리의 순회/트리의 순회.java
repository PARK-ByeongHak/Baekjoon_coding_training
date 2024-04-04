import java.io.*;
import java.util.*;

public class Main {
    private static int[] inOrder;
    private static int[] postOrder;
    private static int[] position;
    private static StringBuilder preOrderResult = new StringBuilder();

    // 프리오더를 구하는 함수
    private static void findPreOrder(int inStart, int inEnd, int postStart, int postEnd) {
        if (inStart > inEnd || postStart > postEnd) return;

        int root = postOrder[postEnd];
        preOrderResult.append(root).append(' ');

        int rootIndex = position[root];
        int leftSize = rootIndex - inStart;

        // 왼쪽 서브트리
        findPreOrder(inStart, rootIndex - 1, postStart, postStart + leftSize - 1);
        // 오른쪽 서브트리
        findPreOrder(rootIndex + 1, inEnd, postStart + leftSize, postEnd - 1);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        inOrder = new int[n];
        postOrder = new int[n];
        position = new int[n + 1];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < n; i++) {
            inOrder[i] = Integer.parseInt(st.nextToken());
            position[inOrder[i]] = i;
        }

        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < n; i++) {
            postOrder[i] = Integer.parseInt(st.nextToken());
        }

        findPreOrder(0, n - 1, 0, n - 1);
        System.out.println(preOrderResult);
    }
}
