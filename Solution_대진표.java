package Day_20210818;

public class Solution_´ëÁøÇ¥ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 8;
		int a = 4;
		int b = 7;
		
		int result = solution(n, a, b);
		
		System.out.println(result);

	}
	
	public static int solution(int n, int a, int b) {
		int answer = 1;
		int left = 0, right = 0;
		
		if(a > b) {
			left = b;
			right = a;
		}else {
			left = a;
			right = b;
		}
		while(true) {
			if((right - left == 1) && (left % 2 != 0)) {
				break;
			}
			left = (left + 1) / 2;
			right = (right + 1) / 2;
			answer++;
		}
		
		
		return answer;
	}

}
