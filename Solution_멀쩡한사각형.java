package Day_20210923;

public class Solution_�����ѻ簢�� {

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
		// ����� h/w�̹Ƿ�, 0���� w������ ��ǥ���� �簢�� ���� ����
		for(int i=0;i<w;i++) {
			answer += (long)h*i/w;
		}
		// ��Ī�̹Ƿ� 2�� ���Ѵ�.
		answer = answer * 2;
		
		return answer;
	}

}
