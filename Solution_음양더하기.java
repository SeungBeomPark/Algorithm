package Day_20210726;

public class Solution_������ϱ� {
	public static void main(String[] args) {
		int[] absol = {4, 7, 12};
		boolean[] signs = {true, false, true};
		int result = solution(absol, signs);
		
		System.out.println(result);
	}
	
	public static int solution(int[] absolutes, boolean[] signs) {
		int answer = 0;
		for(int i=0;i<signs.length;i++) {
			if(signs[i] == false) {// signs �迭�� i��°�� false�̸�, ���� ���� -1�� ���Ѵ�
				absolutes[i] *= -1;
			}
			answer += absolutes[i];
		}
		
		return answer;
	}

}
