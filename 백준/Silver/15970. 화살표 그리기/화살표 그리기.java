import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
		int N; // 점들의 갯수
		int x; // 점의 좌표
		int y; // 점의 색깔
		String str = br.readLine();
		N = Integer.parseInt(str);
		
		Map<Integer, ArrayList<Integer>> map = new HashMap<>();
		for(int i=0; i<N; i++) {
			str = br.readLine();
			x = Integer.parseInt(str.split(" ")[0]);
			y = Integer.parseInt(str.split(" ")[1]);
			
			// 색깔별 점의 좌표
			if(map.containsKey(y)) {
				map.get(y).add(x);
			}else {
				map.put(y, new ArrayList<Integer>());
				map.get(y).add(x);
			}
		}
		int sum = 0;
		Set<Integer> keys = map.keySet();
		// 1~N
		for(int key: keys) {
			ArrayList<Integer> arr = map.get(key);
			Collections.sort(arr);
			
			int distance = 0;
			int l=0;
			int r=0;
			for(int i=0; i<arr.size(); i++) {
				if(i==0) {
					distance = arr.get(i+1)-arr.get(i);
				}else if(i==arr.size()-1) {
					distance = arr.get(i)-arr.get(i-1);
				}else {
					l = arr.get(i)-arr.get(i-1);
					r = arr.get(i+1)-arr.get(i);
					distance = Math.min(l, r);
				}
				sum += distance;
			}
		}
		System.out.println(sum);
	}
}