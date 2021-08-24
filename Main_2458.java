package Day_20210824;

import java.util.*;
public class Main_2458 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int result = 0;
		int max = N * (N * (N-1) / 2);
		
		int[][] student = new int[N][N];
		for(int i=0;i<N;i++) {
			for(int j=0;j<N;j++) {
				student[i][j] = max;
			}
		}
		for(int i=1;i<=M;i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			student[a-1][b-1] = 1;
		}
		
		for(int k=0;k<N;k++) {
			for(int i=0;i<N;i++) {
				for(int j=0;j<N;j++) {
					if(student[i][j] > student[i][k] + student[k][j]) {
						student[i][j] = student[i][k] + student[k][j];
					}
				}
			}
		}
		
		for(int i=0;i<N;i++) {
			int count = 0;
			for(int j=0;j<N;j++)
			{
				if(student[i][j] < max || student[j][i] < max) {
					count++;
				}
			}
			if(count == N-1) {
				result++;
			}
		}
		
		System.out.println(result);
		

	}

}
