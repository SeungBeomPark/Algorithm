package Day_20210923;

public class Solution_멀쩡한사각형 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int w = 8;
		int h = 12;
		
		long result = solution(w, h);
		
		System.out.println(result);

	}

	private static long solution(int w, int h) {
		// TODO Auto-generated method stub
		long answer = 0;
		// 기울기는 h/w이므로, 0부터 w까지의 좌표에서 사각형 개수 구함
		for(int i=0;i<w;i++) {
			answer += (long)h*i/w;
		}
		// 대칭이므로 2배 곱한다.
		answer = answer * 2;
		
		return answer;
	}

}
