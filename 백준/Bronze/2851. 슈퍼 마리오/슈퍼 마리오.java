import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];
        int sum=0;
        int cnt=0;
        int temp=0;
        for(int i=0;i<arr.length;i++) {
            arr[i]=sc.nextInt();
        }
         
        while(cnt<10) {
            temp= sum+arr[cnt];
             
            if(sum<temp&&temp<100) {
                sum = sum + arr[cnt];
            }
             
            else if(temp>=100) {
                break;
            }
            cnt++;
        }
        if(temp-100>100-sum) {
            System.out.println(sum);
        }
        else {
            System.out.println(temp);
        }
    }
}