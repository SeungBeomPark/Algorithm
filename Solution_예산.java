package Day_20210923;

import java.util.*;

public class Solution_���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] d = {1,3,2,5,4};
		int budget = 9;
		
		int result = solution(d, budget);
		
		System.out.println(result);

	}

	private static int solution(int[] d, int budget) {
		// TODO Auto-generated method stub
		int answer = 0;		
		int sum = 0;// ��û�ݾ� �� ���� ���ϱ� ���� ����

		Arrays.sort(d);
		
		for(int i=0;i<d.length;i++) {
			sum += d[i];
			if(sum > budget) {
				// ��û �ݾ��� ���꺸�� ũ��, i�� ����
				answer = i;
				return answer;
			}
			
		}
		// �� ��û�ݾ��� ���꺸�� ������, �μ��� �迭 ���� ����
		if(sum <= budget) {
			answer = d.length;
		}
				
		return answer;
	}
	
	

}
