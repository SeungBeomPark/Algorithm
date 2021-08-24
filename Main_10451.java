package Day_20210824;

import java.util.*;

public class Main_10451 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int tc=1;tc<=T;tc++) {
			int count = 0;
			int N = sc.nextInt();
			boolean[] visit = new boolean[N+1];
			
			ArrayList<ArrayList<Integer>> list = new ArrayList<>();
			for(int i=0;i<=N;i++) {
				list.add(new ArrayList<>());
			}
			for(int i=1;i<=N;i++) {
				int num = sc.nextInt();
				list.get(i).add(num);
			}
			for(int i=1;i<=N;i++) {
				if(!visit[i]) {
					visit[i] = true;
					dfs(list, visit, i);
					count++;
				}
			}
			
			
			System.out.println(count);
		}
	}

	private static void dfs(ArrayList<ArrayList<Integer>> list, boolean[] visit, int start) {
		for(int i : list.get(start)) {
			if(!visit[i]) {
				visit[i] = true;
				dfs(list, visit, i);
			}
		}
		
	}

}
