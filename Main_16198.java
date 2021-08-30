package Day_20210830;

import java.util.*;

public class Main_16198 {
	static int N, MAX = Integer.MIN_VALUE;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		ArrayList<Integer> list = new ArrayList<>();
		for(int i=0;i<N;i++) {
			int num = sc.nextInt();
			list.add(num);
		}
		
		dfs(list, 0);
		System.out.println(MAX);
	}
	
	private static void dfs(ArrayList<Integer> list, int sum) {
		if(list.size() <= 2) {
			MAX = Math.max(MAX, sum);
			return;
		}
		for(int i=1;i<list.size()-1;i++) {
			int tmp = list.get(i);
			int num = list.get(i-1) * list.get(i+1);			
			list.remove(i);
			dfs(list, sum + num);
			list.add(i, tmp);
			
		}
		
	}

}
