import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();//수열의 크기
        int K = scanner.nextInt();//몇번 반복할건가요?
        int []A = new int[N];//N개만큼 배열 생성
        String []t = new String[N];
        String str = scanner.next();
        t=str.split(",");
        for(int i =0  ; i < A.length;i++)
            A[i] = Integer.parseInt(t[i]);

        for(int time = 0; time < K ; time++)//몇번 반복할건가요?
        {
            for(int i = 0; i < N-1; i++)
            {
                A[i] = A[i+1]-A[i];
            }
        }
        for(int i = 0; i < N-K; i++)//반복할수록 K수만큼 줄어들기 때문
        {
            System.out.print(A[i]);
            if(i!=N-K-1)System.out.print(',');
        }
    }
}
