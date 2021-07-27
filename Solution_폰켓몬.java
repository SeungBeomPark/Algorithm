package Day_20210727;

import java.util.*;

public class Solution_폰켓몬 {
	public static void main(String[] args) {
		int[] nums = {3, 3, 3, 2, 2, 2};
		int result = solution(nums);
		
		System.out.println(result);
	}
	
	public static int solution(int[] nums) {
		int answer = 0;
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(nums[0]);
		// 번호 중복을 피하기 위해
		for(int i=1;i<nums.length;i++) {
			if(!list.contains(nums[i])) { // 리스트에 해당하는 폰켓몬의 종류의 번호가 없을 때
				list.add(nums[i]);
			}
		}
		answer = (list.size() < nums.length/2) ? list.size() : nums.length/2;
		return answer;
	}

}
