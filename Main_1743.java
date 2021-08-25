package Day_20210825;

import java.util.*;

public class Main_1743 {
	static int[] dr = {-1, 1, 0, 0};
	static int[] dc = {0, 0, -1, 1};
	static int n, m, k, max;
	static int[][] arr;
	static boolean[][] visit;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		k = sc.nextInt();
		max = 0;
		arr = new int[n+1][m+1];
		visit = new boolean[n+1][m+1];
		
		for(int i=1;i<=k;i++) {
			int a =sc.nextInt();
			int b = sc.nextInt();
			arr[a][b] = -1;
		}
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=m;j++) {
				if(arr[i][j] == -1 && !visit[i][j]) {
					int tmp = max;
					max = 0;
					dfs(i, j);
					max = Math.max(max, tmp);
				}
			}
		}
		
		System.out.println(max);
		

	}
	private static void dfs(int r, int c) {
		visit[r][c] = true;
		max++;
		for(int k=0;k<4;k++) {
			int nr = r + dr[k];
			int nc = c + dc[k];
			if(nr >=1 && nr <= n && nc >= 1 && nc <= m ) {
				if(arr[nr][nc] == -1 && !visit[nr][nc]) {
					dfs(nr, nc);
				}
			}
		}
		
	}

}
