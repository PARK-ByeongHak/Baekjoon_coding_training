import java.io.*;
 
class Main {
 
    static char []input;
    static int []fail;
    static int cnt = 0;
    static String K;
 
    public static void made_fail(){ // fail 배열 생성
        int m = 0;
        int begin = 1;
        while(begin+m < K.length()){
            if(K.charAt(begin+m) == K.charAt(m)){
                m++;
                fail[begin+m-1] = m;
            }
            else{
                if(m == 0) {
                    begin++;
                }
                else {
                    begin += m-fail[m-1];
                    m = fail[m-1];
                }
            }
        }
    }
 
    public static void kmp(){ // KMP 알고리즘 수행
        int m = 0;
        int begin = 0;
        while(begin+m < cnt){
            if(input[begin+m] == K.charAt(m)){
                m++;
                if(m >= K.length()){ // 일치하는 부분을 찾았다면, 1을 출력하고 프로그램 종료
                    System.out.println("1\n");
                    System.exit(0);
                }
            }
            else {
                if (m == 0) {
                    begin++;
                } else {
                    begin += m - fail[m - 1];
                    m = fail[m - 1];
                }
            }
        }
    }
 
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int i;
 
        String s = br.readLine();
        K = br.readLine();
        input = new char[s.length()];
        fail = new int[K.length()];
        for(i=0;i<s.length();i++){ // 문자열에서 숫자를 제거
            if(!(s.charAt(i) - '0' <= 9)){
                input[cnt++] = s.charAt(i);
            }
        }
 
        made_fail();
        kmp();
        System.out.println("0\n"); // 문자열 끝까지 일치하는 부분을 못찾았다면, 0을 출력
        System.exit(0);
    }
}