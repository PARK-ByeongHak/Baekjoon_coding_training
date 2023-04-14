import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] score = new int[2];
        for(int i=0; i<score.length; i++) {
        	int a = sc.nextInt();
        	score[i] +=a*6;
        	int b = sc.nextInt();
        	score[i] +=b*3;
        	int c = sc.nextInt();
        	score[i] +=c*2;
        	int d = sc.nextInt();
        	score[i] +=d;
        	int e = sc.nextInt();
        	score[i] +=e*2;
        }
        System.out.println(score[0]+" "+score[1]);
    }
}