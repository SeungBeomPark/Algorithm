package Day_20210923;

public class Solution_����ǰ����͵��� {
	
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
			int count = 0; // ����� ������ Ȧ��, ¦������ �Ǻ�
			
			for(int j=1;j<=i;j++) {
				if(i % j == 0) {
					count++;
				}
			}
			// ����� ������ ¦���� ��
			if(count % 2 == 0) {
				answer += i;
			}else { // ����� ������ Ȧ���� ��
				answer -= i;
			}
		}
		
		return answer;
	}

}
