package Day_20210923;

import java.util.*;

public class Solution_예산 {

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
		int sum = 0;// 신청금액 총 합을 구하기 위한 변수

		Arrays.sort(d);
		
		for(int i=0;i<d.length;i++) {
			sum += d[i];
			if(sum > budget) {
				// 신청 금액이 예산보다 크면, i를 리턴
				answer = i;
				return answer;
			}
			
		}
		// 총 신청금액이 예산보다 작으면, 부서별 배열 길이 리턴
		if(sum <= budget) {
			answer = d.length;
		}
				
		return answer;
	}
	
	

}
