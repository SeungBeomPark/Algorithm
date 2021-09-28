package Day_20210928;

import java.util.*;

public class Solution_3진법뒤집기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 45;
		int result = solution(n);
		
		System.out.println(result);

	}

	private static int solution(int n) {
		// TODO Auto-generated method stub
		int answer = 0;
		ArrayList<Integer> list = new ArrayList<>();// 3진법으로 된 수를 저장하기 위한 리스트
		while(n != 0) {
			// n이 3보다 작은 수면, 그 수를 리스트에 추가하고 반복문 탈출
			if(n < 3) {
				list.add(n);
				break;
			}
			//3으로 나눈 나머지를 리스트에 추가하고, n을 3으로 나눈다.
			list.add(n % 3);
			n = n/3;
		}
		//3진법으로 나타낸 수를 10진법으로 변환
		for(int i=0;i<list.size();i++) {
			answer += (Math.pow(3, list.size()-i-1) * list.get(i));
		}
		
		return answer;
	}

}
