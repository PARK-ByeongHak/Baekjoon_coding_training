import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        //파일 개수 N 입력
        int N = sc.nextInt();
        sc.nextLine();
        //기준 첫 파일 입력 후, 문자 배열에 저장
        String A = sc.nextLine();
        char[] B = A.toCharArray();
        //첫 파일 기준, 나머지 파일 담을 배열 생성 
        char[][] C = new char[N-1][A.length()];
        //나머지 파일 배열에 저장
        for(int i=0; i<N-1; i++){
            String D = sc.nextLine();
            for(int j=0; j<A.length(); j++){
            C[i][j] = D.charAt(j);
            }
        }
        //출력하기 위한 배열 생성
        char[] E = new char[A.length()];
        //각각 파일의 문자 비교, 다 같으면 그 문자 대입/ 다르면 '?' 문자 대입 
        // 첫 파일과 나머지 파일 비교 
        for(int t=0; t<N-1; t++){
            for(int k=0; k<A.length(); k++){
                if((B[k] == C[t][k])){
                    E[k] = B[k];
                }else{
                    E[k] = '?';
                }
            }
        }
        // 나머지 파일간 비교
        for(int t=0; t<N-2; t++){
            for(int k=0; k<A.length(); k++){
                if((C[t][k] != C[t+1][k])){
                    E[k] = '?';
                }
            }
        }
        //문자가 하나 일 때, 그대로 출력 / 다를 경우, 앞서 반복문으로 처리한 문자 배열 출력 
        for(int n=0; n<A.length(); n++){
            if(N==1){
                System.out.print(B[n]);
            }else{
                System.out.print(E[n]);
            }
        }
    }
}