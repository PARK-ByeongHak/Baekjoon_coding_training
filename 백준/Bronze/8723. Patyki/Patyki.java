import java.util.*;
 
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] a=new int[3];
		for(int i=0;i<3;i++)
			a[i]=sc.nextInt();
		Arrays.sort(a);
        // 세 변의 길이가 모두 같을 경우(정삼각형)
		if(a[0]==a[2])
			System.out.println(2);
        // 두 변을 각각 제곱한 길이의 합이 나머지 한 변의 제곱의 길이와 같을 경우(직각삼각형)
		else if(a[2]*a[2]==a[0]*a[0]+a[1]*a[1])
			System.out.println(1);
        // 그 외
		else
			System.out.println(0);		
	}
}