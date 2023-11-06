import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String value1 = sc.next();
		String operation = sc.next();
		String value2 = sc.next();
		
		boolean v1 = value1.equals("true");
		boolean v2 = value2.equals("true");
		
		System.out.print(operation.equals("AND")?v1&&v2:v1||v2);
		
	}

}