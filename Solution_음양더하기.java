package Day_20210726;

public class Solution_음양더하기 {
	public static void main(String[] args) {
		int[] absol = {4, 7, 12};
		boolean[] signs = {true, false, true};
		int result = solution(absol, signs);
		
		System.out.println(result);
	}
	
	public static int solution(int[] absolutes, boolean[] signs) {
		int answer = 0;
		for(int i=0;i<signs.length;i++) {
			if(signs[i] == false) {// signs 배열의 i번째가 false이면, 기존 값에 -1을 곱한다
				absolutes[i] *= -1;
			}
			answer += absolutes[i];
		}
		
		return answer;
	}

}
