package Day_20210824;

import java.util.*;

public class Solution_소수만들기 {
	static int answer = 0;
	public static void main(String[] args) {
		int[] nums = {1, 2, 7, 6, 4};
		int result = solution(nums);
		
		System.out.println(result);
	}
	
	public static int solution(int[] nums) {
		for(int i=0;i<nums.length-2;i++) {
			for(int j=i+1;j<nums.length-1;j++) {
				for(int k=j+1;k<nums.length;k++) {
					isSosu(nums[i]+nums[j]+nums[k]);
				}
			}
		}
		
		
		return answer;
	}

	private static void isSosu(int num) {
		int i = 2;		
		while(i * i <= num) {
			if(num % i == 0) {
					return;
			}
			i++;
		}
		
		answer++;
		
	}
}
