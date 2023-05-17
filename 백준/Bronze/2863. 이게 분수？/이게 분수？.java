import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double a=sc.nextDouble();
		double b=sc.nextDouble();
		double c=sc.nextDouble();
		double d=sc.nextDouble();
		double max=a/c+b/d;
		
		int count=0;
		for(int i=0; i<4; i++){
			double tmp;
			tmp=a;
			a=c; c=d; d=b; b=tmp;
			double k=a/c+b/d;
			if(max<k){
				max=k;
				count=i+1;
			}
		}
		System.out.print(count);
	}
}