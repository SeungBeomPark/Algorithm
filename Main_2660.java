package Day_20210825;

import java.util.*;
public class Main_2660 {
	static int N;
	static int[][] friend;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		int max = 251;
		int min = Integer.MAX_VALUE;
		friend = new int[N+1][N+1];
		for(int i=1;i<=N;i++) {
			for(int j=1;j<=N;j++) {
				friend[i][j] = max;
			}
		}
		while(true) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			if(a  == -1 && b == -1) {
				break;
			}
			friend[a][b] = 1;
			friend[b][a] = 1;
		}
		
		for(int k=1;k<=N;k++) {
			friend[k][k] = 1;
			for(int i=1;i<=N;i++) {
				for(int j=1;j<=N;j++) {
					if(friend[i][j] > friend[i][k] + friend[k][j]) {
						friend[i][j] = friend[i][k] + friend[k][j];
					}
				}
			}
		}
		int[] scores = new int[N+1];
		ArrayList<Integer> list = new ArrayList<>();
		for(int i=1;i<=N;i++) {
			for(int j=1;j<=N;j++) {
				scores[i] = Math.max(scores[i], friend[i][j]);
			}
			min = Math.min(min, scores[i]);
		}
		
		for(int i=1;i<=N;i++) {
			if(scores[i] == min) {
				list.add(i);
			}
		}
		System.out.println(min + " " + list.size());
		
		for(int k : list) {
			System.out.print(k + " ");
		}
		
		

	}

}
