package Day_20210727;

import java.util.*;

public class Solution_���ϸ� {
	public static void main(String[] args) {
		int[] nums = {3, 3, 3, 2, 2, 2};
		int result = solution(nums);
		
		System.out.println(result);
	}
	
	public static int solution(int[] nums) {
		int answer = 0;
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(nums[0]);
		// ��ȣ �ߺ��� ���ϱ� ����
		for(int i=1;i<nums.length;i++) {
			if(!list.contains(nums[i])) { // ����Ʈ�� �ش��ϴ� ���ϸ��� ������ ��ȣ�� ���� ��
				list.add(nums[i]);
			}
		}
		answer = (list.size() < nums.length/2) ? list.size() : nums.length/2;
		return answer;
	}

}
