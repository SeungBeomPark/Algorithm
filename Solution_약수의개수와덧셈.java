package Day_20210923;

public class Solution_약수의개수와덧셈 {
	
	public static void main(String[] args) {
		int left = 24;
		int right = 27;
		
		int result = solution(left, right);
		
		System.out.println(result);
	}
	
	private static int solution(int left, int right) {
		// TODO Auto-generated method stub
		int answer = 0;
		
		for(int i=left;i<=right;i++) {
			int count = 0; // 약수의 개수가 홀수, 짝수인지 판별
			
			for(int j=1;j<=i;j++) {
				if(i % j == 0) {
					count++;
				}
			}
			// 약수의 개수가 짝수일 때
			if(count % 2 == 0) {
				answer += i;
			}else { // 약수의 개수가 홀수일 때
				answer -= i;
			}
		}
		
		return answer;
	}

}
