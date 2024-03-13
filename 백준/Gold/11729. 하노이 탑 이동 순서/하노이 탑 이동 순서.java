public class Main {
    public static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int N = sc.nextInt(); // 원판의 개수

        sb.append((int) (Math.pow(2, N) - 1)).append('\n');

        hanoi(N, 1, 2, 3);
        System.out.println(sb);
    }

    public static void hanoi(int N, int start, int mid, int to) {
        // 이동할 원판이 한 개일 때
        if (N == 1) {
            sb.append(start + " " + to + "\n");
            return;
        }
        
        // A -> B 이동
        hanoi(N - 1, start, to, mid);
        
        // A -> C 이동
        sb.append(start + " " + to + "\n");
        
        // B -> C 이동
        hanoi(N - 1, mid, start, to);
    }
}
