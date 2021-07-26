package Day_20210726;
// 프로그래머스 내적문제
public class Solution_내적 {
	public static void main(String[] args) {
		int[] a = {1,2,3,4};// int형 배열 선언
		int[] b = {-3, -1, 0, 2}; // int형 배열 선언
		
		int result = solution(a, b);
		System.out.println(result);
	}
	
	public static int solution(int[] a, int[] b) {
		int answer = 0;
		//a와 b의 배열길이는 같아서 둘 중 아무거나 선언해도 상관없음
		for(int i=0;i<a.length;i++) {
			answer += a[i] * b[i];
		}
		return answer;
	}

}
